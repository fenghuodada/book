package com.unity3d.services.core.misc;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.C0063d;
import androidx.constraintlayout.core.C0499a;
import com.unity3d.services.core.log.C9549a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.unity3d.services.core.misc.j */
/* loaded from: classes3.dex */
public class C9564j {
    /* renamed from: a */
    public static String m1992a(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return m1984b(messageDigest.digest());
                }
                messageDigest.update(bArr, 0, read);
            }
        } catch (NoSuchAlgorithmException e) {
            C9549a.m2023a("SHA-256 algorithm not found", e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m1989a(String str) {
        return m1985a(str.getBytes());
    }

    /* renamed from: a */
    public static String m1985a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr, 0, bArr.length);
            return m1984b(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            C9549a.m2023a("SHA-256 algorithm not found", e);
            return null;
        }
    }

    /* renamed from: a */
    public static Map<String, Object> m1988a(Map<String, Object> map, JSONObject jSONObject) {
        return m1987a(map, jSONObject, "");
    }

    /* renamed from: a */
    public static Map<String, Object> m1987a(Map<String, Object> map, JSONObject jSONObject, String str) {
        HashMap hashMap = new HashMap(map);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(C0063d.m13053a(str, next), jSONObject.opt(next));
        }
        return hashMap;
    }

    /* renamed from: a */
    public static JSONObject m1986a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (jSONObject == null) {
            return jSONObject2;
        }
        if (jSONObject2 == null) {
            return jSONObject;
        }
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject3.put(next, jSONObject2.get(next));
        }
        Iterator<String> keys2 = jSONObject.keys();
        while (keys2.hasNext()) {
            String next2 = keys2.next();
            jSONObject3.put(next2, (jSONObject3.has(next2) && (jSONObject3.get(next2) instanceof JSONObject) && (jSONObject.get(next2) instanceof JSONObject)) ? m1986a(jSONObject.getJSONObject(next2), jSONObject3.getJSONObject(next2)) : jSONObject.get(next2));
        }
        return jSONObject3;
    }

    /* renamed from: a */
    public static void m1991a(Runnable runnable) {
        m1990a(runnable, 0L);
    }

    /* renamed from: a */
    public static void m1990a(Runnable runnable, long j) {
        Handler handler = new Handler(Looper.getMainLooper());
        if (j > 0) {
            handler.postDelayed(runnable, j);
        } else {
            handler.post(runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m1993a(java.io.File r4, java.lang.String r5) {
        /*
            java.lang.String r0 = "Error closing FileOutputStream"
            r1 = 0
            if (r4 != 0) goto L6
            return r1
        L6:
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            byte[] r5 = r5.getBytes()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            r3.write(r5)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            r3.flush()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L20
            r1 = 1
            r3.close()     // Catch: java.lang.Exception -> L1b
            goto L34
        L1b:
            r5 = move-exception
            goto L31
        L1d:
            r4 = move-exception
            r2 = r3
            goto L4c
        L20:
            r5 = move-exception
            r2 = r3
            goto L26
        L23:
            r4 = move-exception
            goto L4c
        L25:
            r5 = move-exception
        L26:
            java.lang.String r3 = "Could not write file"
            com.unity3d.services.core.log.C9549a.m2023a(r3, r5)     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L34
            r2.close()     // Catch: java.lang.Exception -> L1b
            goto L34
        L31:
            com.unity3d.services.core.log.C9549a.m2023a(r0, r5)
        L34:
            if (r1 == 0) goto L4b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Wrote file: "
            r5.<init>(r0)
            java.lang.String r4 = r4.getAbsolutePath()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.unity3d.services.core.log.C9549a.m2019b(r4)
        L4b:
            return r1
        L4c:
            if (r2 == 0) goto L56
            r2.close()     // Catch: java.lang.Exception -> L52
            goto L56
        L52:
            r5 = move-exception
            com.unity3d.services.core.log.C9549a.m2023a(r0, r5)
        L56:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.misc.C9564j.m1993a(java.io.File, java.lang.String):boolean");
    }

    /* renamed from: a */
    public static byte[] m1994a(File file) throws IOException {
        FileInputStream fileInputStream;
        Path path;
        byte[] readAllBytes;
        FileInputStream fileInputStream2 = null;
        if (file == null || !file.exists()) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            path = file.toPath();
            readAllBytes = Files.readAllBytes(path);
            return readAllBytes;
        }
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            int length = (int) file.length();
            byte[] bArr = new byte[length];
            if (fileInputStream.read(bArr) == length) {
                fileInputStream.close();
                return bArr;
            }
            throw new IOException("Failed to read all bytes from input file path: " + file.getPath());
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            throw th;
        }
    }

    /* renamed from: b */
    public static String m1984b(byte[] bArr) {
        String str = "";
        for (byte b : bArr) {
            int i = b & 255;
            if (i <= 15) {
                str = C0063d.m13053a(str, "0");
            }
            StringBuilder m12383b = C0499a.m12383b(str);
            m12383b.append(Integer.toHexString(i));
            str = m12383b.toString();
        }
        return str;
    }
}
