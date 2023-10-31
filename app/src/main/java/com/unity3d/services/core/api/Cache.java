package com.unity3d.services.core.api;

import android.annotation.TargetApi;
import android.media.MediaMetadataRetriever;
import android.util.Base64;
import android.util.SparseArray;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.unity3d.services.core.cache.C9467a;
import com.unity3d.services.core.cache.C9471e;
import com.unity3d.services.core.cache.EnumC9468b;
import com.unity3d.services.core.cache.EnumC9469c;
import com.unity3d.services.core.device.C9498b;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.misc.C9564j;
import com.unity3d.services.core.properties.C9568a;
import com.unity3d.services.core.properties.C9572d;
import com.unity3d.services.core.request.EnumC9585i;
import com.unity3d.services.core.webview.bridge.C9644l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class Cache {

    /* renamed from: com.unity3d.services.core.api.Cache$a */
    /* loaded from: classes3.dex */
    public static class C9454a implements FilenameFilter {
        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith(C9572d.m1939c());
        }
    }

    @TargetApi(10)
    /* renamed from: a */
    private static SparseArray<String> m2264a(String str, JSONArray jSONArray) throws JSONException, IOException, RuntimeException {
        File file = new File(str);
        SparseArray<String> sparseArray = new SparseArray<>();
        if (!file.exists()) {
            throw new IOException("File: " + file.getAbsolutePath() + " doesn't exist");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
        for (int i = 0; i < jSONArray.length(); i++) {
            int i2 = jSONArray.getInt(i);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(i2);
            if (extractMetadata != null) {
                sparseArray.put(i2, extractMetadata);
            }
        }
        return sparseArray;
    }

    /* renamed from: a */
    private static String m2265a(String str) {
        return C9572d.m1954a() + RemoteSettings.FORWARD_SLASH_STRING + C9572d.m1939c() + str;
    }

    /* renamed from: b */
    private static JSONObject m2263b(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FacebookAdapter.KEY_ID, str);
        File file = new File(m2265a(str));
        if (file.exists()) {
            jSONObject.put("found", true);
            jSONObject.put("size", file.length());
            jSONObject.put("mtime", file.lastModified());
        } else {
            jSONObject.put("found", false);
        }
        return jSONObject;
    }

    @WebViewExposed
    public static void deleteFile(String str, C9644l c9644l) {
        if (new File(m2265a(str)).delete()) {
            c9644l.m1736a(new Object[0]);
        } else {
            c9644l.m1737a(EnumC9469c.FILE_IO_ERROR, new Object[0]);
        }
    }

    @WebViewExposed
    public static void download(String str, String str2, JSONArray jSONArray, Boolean bool, C9644l c9644l) {
        if (C9471e.m2233f()) {
            c9644l.m1737a(EnumC9469c.FILE_ALREADY_CACHING, new Object[0]);
        } else if (!C9498b.m2149U()) {
            c9644l.m1737a(EnumC9469c.NO_INTERNET, new Object[0]);
        } else {
            try {
                C9471e.m2240a(str, m2265a(str2), Request.getHeadersMap(jSONArray), bool.booleanValue());
                c9644l.m1736a(new Object[0]);
            } catch (Exception e) {
                C9549a.m2023a("Error mapping headers for the request", e);
                c9644l.m1737a(EnumC9585i.MAPPING_HEADERS_FAILED, str, str2);
            }
        }
    }

    @WebViewExposed
    public static void getCacheDirectoryExists(C9644l c9644l) {
        File m1954a = C9572d.m1954a();
        if (m1954a == null) {
            c9644l.m1737a(EnumC9469c.CACHE_DIRECTORY_NULL, new Object[0]);
        } else {
            c9644l.m1736a(Boolean.valueOf(m1954a.exists()));
        }
    }

    @WebViewExposed
    public static void getCacheDirectoryType(C9644l c9644l) {
        C9467a m1944b = C9572d.m1944b();
        if (m1944b == null || m1944b.m2246a(C9568a.m1959e()) == null) {
            c9644l.m1737a(EnumC9469c.CACHE_DIRECTORY_NULL, new Object[0]);
        } else if (!m1944b.m2246a(C9568a.m1959e()).exists()) {
            c9644l.m1737a(EnumC9469c.CACHE_DIRECTORY_DOESNT_EXIST, new Object[0]);
        } else {
            EnumC9468b m2247a = m1944b.m2247a();
            if (m2247a == null) {
                c9644l.m1737a(EnumC9469c.CACHE_DIRECTORY_TYPE_NULL, new Object[0]);
            } else {
                c9644l.m1736a(m2247a.name());
            }
        }
    }

    @WebViewExposed
    public static void getFileContent(String str, String str2, C9644l c9644l) {
        Object encodeToString;
        String m2265a = m2265a(str);
        File file = new File(m2265a);
        if (!file.exists()) {
            c9644l.m1737a(EnumC9469c.FILE_NOT_FOUND, str, m2265a);
            return;
        }
        try {
            byte[] m1994a = C9564j.m1994a(file);
            if (str2 == null) {
                c9644l.m1737a(EnumC9469c.UNSUPPORTED_ENCODING, str, m2265a, str2);
                return;
            }
            if (str2.equals("UTF-8")) {
                encodeToString = Charset.forName("UTF-8").decode(ByteBuffer.wrap(m1994a)).toString();
            } else if (!str2.equals("Base64")) {
                c9644l.m1737a(EnumC9469c.UNSUPPORTED_ENCODING, str, m2265a, str2);
                return;
            } else {
                encodeToString = Base64.encodeToString(m1994a, 2);
            }
            c9644l.m1736a(encodeToString);
        } catch (IOException e) {
            Enum r1 = EnumC9469c.FILE_IO_ERROR;
            c9644l.m1737a(r1, str, m2265a, e.getMessage() + ", " + e.getClass().getName());
        }
    }

    @WebViewExposed
    public static void getFileInfo(String str, C9644l c9644l) {
        try {
            c9644l.m1736a(m2263b(str));
        } catch (JSONException e) {
            C9549a.m2023a("Error creating JSON", e);
            c9644l.m1737a(EnumC9469c.JSON_ERROR, new Object[0]);
        }
    }

    @WebViewExposed
    public static void getFilePath(String str, C9644l c9644l) {
        if (new File(m2265a(str)).exists()) {
            c9644l.m1736a(m2265a(str));
        } else {
            c9644l.m1737a(EnumC9469c.FILE_NOT_FOUND, new Object[0]);
        }
    }

    @WebViewExposed
    public static void getFiles(C9644l c9644l) {
        File m1954a = C9572d.m1954a();
        if (m1954a == null) {
            return;
        }
        C9549a.m2019b("Unity Ads cache: checking app directory for Unity Ads cached files");
        File[] listFiles = m1954a.listFiles(new C9454a());
        if (listFiles == null || listFiles.length == 0) {
            c9644l.m1736a(new JSONArray());
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (File file : listFiles) {
                String substring = file.getName().substring(C9572d.m1939c().length());
                C9549a.m2019b("Unity Ads cache: found " + substring + ", " + file.length() + " bytes");
                jSONArray.put(m2263b(substring));
            }
            c9644l.m1736a(jSONArray);
        } catch (JSONException e) {
            C9549a.m2023a("Error creating JSON", e);
            c9644l.m1737a(EnumC9469c.JSON_ERROR, new Object[0]);
        }
    }

    @WebViewExposed
    public static void getFreeSpace(C9644l c9644l) {
        c9644l.m1736a(Long.valueOf(C9498b.m2139a(C9572d.m1954a())));
    }

    @WebViewExposed
    public static void getHash(String str, C9644l c9644l) {
        c9644l.m1736a(C9564j.m1989a(str));
    }

    @WebViewExposed
    public static void getMetaData(String str, JSONArray jSONArray, C9644l c9644l) {
        try {
            SparseArray<String> m2264a = m2264a(m2265a(str), jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < m2264a.size(); i++) {
                JSONArray jSONArray3 = new JSONArray();
                jSONArray3.put(m2264a.keyAt(i));
                jSONArray3.put(m2264a.valueAt(i));
                jSONArray2.put(jSONArray3);
            }
            c9644l.m1736a(jSONArray2);
        } catch (IOException e) {
            c9644l.m1737a(EnumC9469c.FILE_IO_ERROR, e.getMessage());
        } catch (RuntimeException e2) {
            c9644l.m1737a(EnumC9469c.INVALID_ARGUMENT, e2.getMessage());
        } catch (JSONException e3) {
            c9644l.m1737a(EnumC9469c.JSON_ERROR, e3.getMessage());
        }
    }

    @WebViewExposed
    public static void getProgressInterval(C9644l c9644l) {
        c9644l.m1736a(Integer.valueOf(C9471e.m2237c()));
    }

    @WebViewExposed
    public static void getTimeouts(C9644l c9644l) {
        c9644l.m1736a(Integer.valueOf(C9471e.m2239b()), Integer.valueOf(C9471e.m2235d()));
    }

    @WebViewExposed
    public static void getTotalSpace(C9644l c9644l) {
        c9644l.m1736a(Long.valueOf(C9498b.m2133b(C9572d.m1954a())));
    }

    @WebViewExposed
    public static void isCaching(C9644l c9644l) {
        c9644l.m1736a(Boolean.valueOf(C9471e.m2233f()));
    }

    @WebViewExposed
    public static void recreateCacheDirectory(C9644l c9644l) {
        if (C9572d.m1954a().exists()) {
            c9644l.m1737a(EnumC9469c.CACHE_DIRECTORY_EXISTS, new Object[0]);
            return;
        }
        C9572d.m1949a((C9467a) null);
        if (C9572d.m1954a() == null) {
            c9644l.m1737a(EnumC9469c.CACHE_DIRECTORY_NULL, new Object[0]);
        } else {
            c9644l.m1736a(new Object[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
        if (r11 == null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    @com.unity3d.services.core.webview.bridge.WebViewExposed
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void setFileContent(java.lang.String r9, java.lang.String r10, java.lang.String r11, com.unity3d.services.core.webview.bridge.C9644l r12) {
        /*
            java.lang.String r0 = "Error closing FileOutputStream"
            java.lang.String r1 = "UTF-8"
            java.lang.String r2 = m2265a(r9)
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            byte[] r7 = r11.getBytes(r1)     // Catch: java.io.UnsupportedEncodingException -> L92
            if (r10 == 0) goto L3a
            int r8 = r10.length()
            if (r8 <= 0) goto L3a
            java.lang.String r8 = "Base64"
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto L25
            byte[] r7 = android.util.Base64.decode(r11, r4)
            goto L3a
        L25:
            boolean r11 = r10.equals(r1)
            if (r11 == 0) goto L2c
            goto L3a
        L2c:
            com.unity3d.services.core.cache.c r11 = com.unity3d.services.core.cache.EnumC9469c.UNSUPPORTED_ENCODING
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r6] = r9
            r0[r5] = r2
            r0[r4] = r10
            r12.m1737a(r11, r0)
            return
        L3a:
            r11 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55 java.io.FileNotFoundException -> L65
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55 java.io.FileNotFoundException -> L65
            r1.write(r7)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4f java.io.FileNotFoundException -> L51
            r1.flush()     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4f java.io.FileNotFoundException -> L51
            r1.close()     // Catch: java.lang.Exception -> L4a
            goto L7f
        L4a:
            r9 = move-exception
            goto L7a
        L4c:
            r9 = move-exception
            r11 = r1
            goto L87
        L4f:
            r11 = r1
            goto L55
        L51:
            r11 = r1
            goto L65
        L53:
            r9 = move-exception
            goto L87
        L55:
            com.unity3d.services.core.cache.c r1 = com.unity3d.services.core.cache.EnumC9469c.FILE_IO_ERROR     // Catch: java.lang.Throwable -> L53
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L53
            r3[r6] = r9     // Catch: java.lang.Throwable -> L53
            r3[r5] = r2     // Catch: java.lang.Throwable -> L53
            r3[r4] = r10     // Catch: java.lang.Throwable -> L53
            r12.m1737a(r1, r3)     // Catch: java.lang.Throwable -> L53
            if (r11 == 0) goto L7e
            goto L74
        L65:
            com.unity3d.services.core.cache.c r1 = com.unity3d.services.core.cache.EnumC9469c.FILE_NOT_FOUND     // Catch: java.lang.Throwable -> L53
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L53
            r3[r6] = r9     // Catch: java.lang.Throwable -> L53
            r3[r5] = r2     // Catch: java.lang.Throwable -> L53
            r3[r4] = r10     // Catch: java.lang.Throwable -> L53
            r12.m1737a(r1, r3)     // Catch: java.lang.Throwable -> L53
            if (r11 == 0) goto L7e
        L74:
            r11.close()     // Catch: java.lang.Exception -> L78
            goto L7e
        L78:
            r9 = move-exception
            r5 = r6
        L7a:
            com.unity3d.services.core.log.C9549a.m2023a(r0, r9)
            goto L7f
        L7e:
            r5 = r6
        L7f:
            if (r5 == 0) goto L86
            java.lang.Object[] r9 = new java.lang.Object[r6]
            r12.m1736a(r9)
        L86:
            return
        L87:
            if (r11 == 0) goto L91
            r11.close()     // Catch: java.lang.Exception -> L8d
            goto L91
        L8d:
            r10 = move-exception
            com.unity3d.services.core.log.C9549a.m2023a(r0, r10)
        L91:
            throw r9
        L92:
            com.unity3d.services.core.cache.c r11 = com.unity3d.services.core.cache.EnumC9469c.UNSUPPORTED_ENCODING
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r6] = r9
            r0[r5] = r2
            r0[r4] = r10
            r12.m1737a(r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.api.Cache.setFileContent(java.lang.String, java.lang.String, java.lang.String, com.unity3d.services.core.webview.bridge.l):void");
    }

    @WebViewExposed
    public static void setProgressInterval(Integer num, C9644l c9644l) {
        C9471e.m2238b(num.intValue());
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void setTimeouts(Integer num, Integer num2, C9644l c9644l) {
        C9471e.m2241a(num.intValue());
        C9471e.m2236c(num2.intValue());
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void stop(C9644l c9644l) {
        if (!C9471e.m2233f()) {
            c9644l.m1737a(EnumC9469c.NOT_CACHING, new Object[0]);
            return;
        }
        C9471e.m2242a();
        c9644l.m1736a(new Object[0]);
    }
}
