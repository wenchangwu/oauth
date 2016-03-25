package com.iqiyi.oauth2.server.oauth;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.security.authentication.encoding.BaseDigestPasswordEncoder;
import org.springframework.security.crypto.codec.Base64;
import org.springframework.security.crypto.codec.Hex;
import org.springframework.security.crypto.codec.Utf8;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

/**
 * 
 * @Title: MyPasswordEncoder.java
 * @Copyright: Copyright (c) 2012
 * @Description: <br>
 *               <br>
 * @Company: iqiyi.com
 * @Created on 2013-1-15 下午6:20:46
 * @author shuhuan@qiyi.com
 */
@Component("MyPasswordEncoder")  
public class MyPasswordEncoder extends BaseDigestPasswordEncoder {

    private final String algorithm;
    private int iterations = 1;

    /**
     * Convenience constructor for specifying the algorithm and whether or not to enable base64 encoding
     *
     * @param algorithm
     * @param encodeHashAsBase64
     * @throws IllegalArgumentException if an unknown
     */
    public MyPasswordEncoder() throws IllegalArgumentException {
        this.algorithm = "MD5";
        setEncodeHashAsBase64(false);
        //Validity Check
        getMessageDigest();
    }

    /**
     * Encodes the rawPass using a MessageDigest.
     * If a salt is specified it will be merged with the password before encoding.
     *
     * @param rawPass The plain text password
     * @param salt The salt to sprinkle
     * @return Hex string of password digest (or base64 encoded string if encodeHashAsBase64 is enabled.
     */
    public String encodePassword(String rawPass, Object salt) {
        String saltedPass = mergePasswordAndSalt(rawPass, salt, false);

        System.out.println(saltedPass);
        
        MessageDigest messageDigest = getMessageDigest();

        byte[] digest = messageDigest.digest(Utf8.encode(saltedPass));

        // "stretch" the encoded value if configured to do so
        for (int i = 1; i < iterations; i++) {
            digest = messageDigest.digest(digest);
        }

        if (getEncodeHashAsBase64()) {
            return Utf8.decode(Base64.encode(digest));
        } else {
            return new String(Hex.encode(digest));
        }
    }

    /**
     * Get a MessageDigest instance for the given algorithm.
     * Throws an IllegalArgumentException if <i>algorithm</i> is unknown
     *
     * @return MessageDigest instance
     * @throws IllegalArgumentException if NoSuchAlgorithmException is thrown
     */
    protected final MessageDigest getMessageDigest() throws IllegalArgumentException {
        try {
            return MessageDigest.getInstance(algorithm);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalArgumentException("No such algorithm [" + algorithm + "]");
        }
    }

    /**
     * Takes a previously encoded password and compares it with a rawpassword after mixing in the salt and
     * encoding that value
     *
     * @param encPass previously encoded password
     * @param rawPass plain text password
     * @param salt salt to mix into password
     * @return true or false
     */
    public boolean isPasswordValid(String encPass, String rawPass, Object salt) {
        String pass1 = "" + encPass;
        
        String pass2 = encodePassword(rawPass, salt);

        System.out.println(pass1 + "-->" +pass2);
        
        if(pass1.equals(pass2)) {
        	return true;
        }
        
        return false;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    /**
     * Sets the number of iterations for which the calculated hash value should be "stretched". If this is greater
     * than one, the initial digest is calculated, the digest function will be called repeatedly on the result for
     * the additional number of iterations.
     *
     * @param iterations the number of iterations which will be executed on the hashed password/salt
     * value. Defaults to 1.
     */
    public void setIterations(int iterations) {
        Assert.isTrue(iterations > 0, "Iterations value must be greater than zero");
        this.iterations = iterations;
    }
    
    protected String mergePasswordAndSalt(String password, Object salt, boolean strict) {
        if (password == null) {
            password = "";
        }

        if (strict && (salt != null)) {
            if ((salt.toString().lastIndexOf("{") != -1) || (salt.toString().lastIndexOf("}") != -1)) {
                throw new IllegalArgumentException("Cannot use { or } in salt.toString()");
            }
        }

        if ((salt == null) || "".equals(salt)) {
            return password;
        } else {
            return salt.toString() + password;
        }
    }
}