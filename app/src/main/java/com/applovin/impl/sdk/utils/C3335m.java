package com.applovin.impl.sdk.utils;

import android.text.TextUtils;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.applovin.impl.sdk.utils.m */
/* loaded from: classes.dex */
public class C3335m {
    /* renamed from: a */
    public static String m6919a(String str, String str2) {
        return m6916a(str, str2, new byte[]{-83, -98, -53, -112, -29, -118, 55, 117, 59, 8, -12, -15, 73, 110, -67, 57, 117, 4, -26, 97, 66, -12, 125, 91, -119, -103, -30, 114, 123, 54, 51, -77});
    }

    /* renamed from: a */
    public static String m6918a(String str, String str2, long j) {
        return m6917a(str, str2, j, new byte[]{-83, -98, -53, -112, -29, -118, 55, 117, 59, 8, -12, -15, 73, 110, -67, 57, 117, 4, -26, 97, 66, -12, 125, 91, -119, -103, -30, 114, 123, 54, 51, -77});
    }

    /* renamed from: a */
    private static String m6917a(String str, String str2, long j, byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (str2 != null) {
            if (str2.length() >= 80) {
                if (bArr != null) {
                    char c = ' ';
                    if (bArr.length >= 32) {
                        if (str == null || str.isEmpty()) {
                            return str;
                        }
                        try {
                            String substring = str2.substring(32);
                            String substring2 = str2.substring(0, 32);
                            byte[] bytes = str.getBytes("UTF-8");
                            byte[] m6915a = m6915a(substring2, bArr);
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byteArrayOutputStream.write(((byte) ((j >> 0) & 255)) ^ m6915a[0]);
                            byteArrayOutputStream.write(((byte) ((j >> 8) & 255)) ^ m6915a[1]);
                            byteArrayOutputStream.write(((byte) ((j >> 16) & 255)) ^ m6915a[2]);
                            byteArrayOutputStream.write(((byte) ((j >> 24) & 255)) ^ m6915a[3]);
                            byteArrayOutputStream.write(((byte) ((j >> 32) & 255)) ^ m6915a[4]);
                            byteArrayOutputStream.write(((byte) ((j >> 40) & 255)) ^ m6915a[5]);
                            byteArrayOutputStream.write(((byte) ((j >> 48) & 255)) ^ m6915a[6]);
                            byteArrayOutputStream.write(((byte) ((j >> 56) & 255)) ^ m6915a[7]);
                            int i9 = 0;
                            while (i9 < bytes.length) {
                                long j2 = j + i9;
                                long j3 = (j2 ^ (j2 >> 33)) * (-4417276706812531889L);
                                long j4 = (j3 ^ (j3 >> 29)) * (-8796714831421723037L);
                                long j5 = j4 ^ (j4 >> c);
                                byteArrayOutputStream.write((byte) (((i9 + 0 >= bytes.length ? (byte) 0 : bytes[i]) ^ m6915a[i % m6915a.length]) ^ ((j5 >> 0) & 255)));
                                byteArrayOutputStream.write((byte) ((m6915a[i2 % m6915a.length] ^ (i9 + 1 >= bytes.length ? (byte) 0 : bytes[i2])) ^ ((j5 >> 8) & 255)));
                                byteArrayOutputStream.write((byte) ((m6915a[i3 % m6915a.length] ^ (i9 + 2 >= bytes.length ? (byte) 0 : bytes[i3])) ^ ((j5 >> 16) & 255)));
                                byteArrayOutputStream.write((byte) ((m6915a[i4 % m6915a.length] ^ (i9 + 3 >= bytes.length ? (byte) 0 : bytes[i4])) ^ ((j5 >> 24) & 255)));
                                byteArrayOutputStream.write((byte) ((m6915a[i5 % m6915a.length] ^ (i9 + 4 >= bytes.length ? (byte) 0 : bytes[i5])) ^ ((j5 >> 32) & 255)));
                                byteArrayOutputStream.write((byte) ((m6915a[i6 % m6915a.length] ^ (i9 + 5 >= bytes.length ? (byte) 0 : bytes[i6])) ^ ((j5 >> 40) & 255)));
                                byteArrayOutputStream.write((byte) ((m6915a[i7 % m6915a.length] ^ (i9 + 6 >= bytes.length ? (byte) 0 : bytes[i7])) ^ ((j5 >> 48) & 255)));
                                byteArrayOutputStream.write((byte) ((m6915a[i8 % m6915a.length] ^ (i9 + 7 >= bytes.length ? (byte) 0 : bytes[i8])) ^ ((j5 >> 56) & 255)));
                                i9 += 8;
                                c = ' ';
                            }
                            String m6912b = m6912b(byteArrayOutputStream.toByteArray());
                            return "1:" + m6914a(bArr) + ":" + substring + ":" + m6912b;
                        } catch (IOException unused) {
                            return null;
                        }
                    }
                    throw new IllegalArgumentException("Salt is too short");
                }
                throw new IllegalArgumentException("No salt specified");
            }
            throw new IllegalArgumentException("SDK key is too short");
        }
        throw new IllegalArgumentException("No SDK key specified");
    }

    /* renamed from: a */
    private static String m6916a(String str, String str2, byte[] bArr) {
        if (str2 != null) {
            if (str2.length() >= 80) {
                if (bArr != null) {
                    char c = ' ';
                    if (bArr.length >= 32) {
                        if (TextUtils.isEmpty(str) || str.trim().startsWith("{")) {
                            return str;
                        }
                        String[] split = str.split(":");
                        char c2 = 0;
                        try {
                            if ("1".equals(split[0]) && split.length == 4) {
                                char c3 = 1;
                                String str3 = split[1];
                                String str4 = split[2];
                                byte[] m6920a = m6920a(split[3]);
                                if (str2.endsWith(str4) && m6914a(bArr).equals(str3)) {
                                    byte[] m6915a = m6915a(str2.substring(0, 32), bArr);
                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m6920a);
                                    char c4 = '\b';
                                    try {
                                        long read = (((byteArrayInputStream.read() ^ m6915a[5]) & 255) << 40) | (((byteArrayInputStream.read() ^ m6915a[0]) & 255) << 0) | (((byteArrayInputStream.read() ^ m6915a[1]) & 255) << 8) | (((byteArrayInputStream.read() ^ m6915a[2]) & 255) << 16) | (((byteArrayInputStream.read() ^ m6915a[3]) & 255) << 24) | (((byteArrayInputStream.read() ^ m6915a[4]) & 255) << 32) | (((byteArrayInputStream.read() ^ m6915a[6]) & 255) << 48) | (((byteArrayInputStream.read() ^ m6915a[7]) & 255) << 56);
                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                        byte[] bArr2 = new byte[8];
                                        int read2 = byteArrayInputStream.read(bArr2);
                                        int i = 0;
                                        while (read2 >= 0) {
                                            long j = i + read;
                                            long j2 = (j ^ (j >> 33)) * (-4417276706812531889L);
                                            long j3 = (j2 ^ (j2 >> 29)) * (-8796714831421723037L);
                                            long j4 = j3 ^ (j3 >> c);
                                            byteArrayOutputStream.write((byte) ((bArr2[c2] ^ m6915a[(i + 0) % m6915a.length]) ^ ((j4 >> c2) & 255)));
                                            byteArrayOutputStream.write((byte) ((bArr2[c3] ^ m6915a[(i + 1) % m6915a.length]) ^ ((j4 >> c4) & 255)));
                                            byteArrayOutputStream.write((byte) ((m6915a[(i + 2) % m6915a.length] ^ bArr2[2]) ^ ((j4 >> 16) & 255)));
                                            byteArrayOutputStream.write((byte) ((bArr2[3] ^ m6915a[(i + 3) % m6915a.length]) ^ ((j4 >> 24) & 255)));
                                            byteArrayOutputStream.write((byte) ((m6915a[(i + 4) % m6915a.length] ^ bArr2[4]) ^ ((j4 >> c) & 255)));
                                            byteArrayOutputStream.write((byte) ((bArr2[5] ^ m6915a[(i + 5) % m6915a.length]) ^ ((j4 >> 40) & 255)));
                                            byteArrayOutputStream.write((byte) ((m6915a[(i + 6) % m6915a.length] ^ bArr2[6]) ^ ((j4 >> 48) & 255)));
                                            byteArrayOutputStream.write((byte) ((m6915a[(i + 7) % m6915a.length] ^ bArr2[7]) ^ ((j4 >> 56) & 255)));
                                            i += 8;
                                            read2 = byteArrayInputStream.read(bArr2);
                                            read = read;
                                            c4 = '\b';
                                            c2 = 0;
                                            c = ' ';
                                            c3 = 1;
                                        }
                                        return new String(byteArrayOutputStream.toByteArray(), "UTF-8").trim();
                                    } catch (IOException unused) {
                                        return null;
                                    }
                                }
                                return null;
                            }
                            return null;
                        } catch (IOException unused2) {
                            return null;
                        }
                    }
                    throw new IllegalArgumentException("Salt is too short");
                }
                throw new IllegalArgumentException("No salt specified");
            }
            throw new IllegalArgumentException("SDK key is too short");
        }
        throw new IllegalArgumentException("No SDK key specified");
    }

    /* renamed from: a */
    private static String m6914a(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr);
            return StringUtils.toHexString(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("SHA-1 algorithm not found", e);
        }
    }

    /* renamed from: a */
    private static byte[] m6920a(String str) {
        return Base64.decode(m6913b(str), 0);
    }

    /* renamed from: a */
    private static byte[] m6915a(String str, byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            messageDigest.update(str.getBytes("UTF-8"));
            return messageDigest.digest();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 encoding not found", e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException("SHA-1 algorithm not found", e2);
        }
    }

    /* renamed from: b */
    private static String m6913b(String str) {
        return str.replace('-', '+').replace('_', '/').replace('*', '=');
    }

    /* renamed from: b */
    private static String m6912b(byte[] bArr) throws UnsupportedEncodingException {
        return m6911c(Base64.encode(bArr, 2));
    }

    /* renamed from: c */
    private static String m6911c(byte[] bArr) throws UnsupportedEncodingException {
        return new String(bArr, "UTF-8").replace('+', '-').replace('/', '_').replace('=', '*');
    }
}
