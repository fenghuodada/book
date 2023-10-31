package androidx.multidex;

import android.content.Context;
import android.util.Log;
import androidx.activity.result.C0063d;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.multidex.a */
/* loaded from: classes.dex */
public final class C1524a {

    /* renamed from: a */
    public static final HashSet f3518a = new HashSet();

    /* renamed from: b */
    public static final boolean f3519b;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r2 < 1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    static {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            androidx.multidex.C1524a.f3518a = r0
            java.lang.String r0 = "java.vm.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L42
            java.util.StringTokenizer r1 = new java.util.StringTokenizer
            java.lang.String r2 = "."
            r1.<init>(r0, r2)
            boolean r2 = r1.hasMoreTokens()
            r3 = 0
            if (r2 == 0) goto L22
            java.lang.String r2 = r1.nextToken()
            goto L23
        L22:
            r2 = r3
        L23:
            boolean r4 = r1.hasMoreTokens()
            if (r4 == 0) goto L2d
            java.lang.String r3 = r1.nextToken()
        L2d:
            if (r2 == 0) goto L42
            if (r3 == 0) goto L42
            int r1 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L42
            int r2 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L42
            r3 = 1
            r4 = 2
            if (r1 > r4) goto L43
            if (r1 != r4) goto L42
            if (r2 < r3) goto L42
            goto L43
        L42:
            r3 = 0
        L43:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "VM with version "
            r1.<init>(r2)
            r1.append(r0)
            if (r3 == 0) goto L52
            java.lang.String r0 = " has multidex support"
            goto L54
        L52:
            java.lang.String r0 = " does not have multidex support"
        L54:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "MultiDex"
            android.util.Log.i(r1, r0)
            androidx.multidex.C1524a.f3519b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.multidex.C1524a.<clinit>():void");
    }

    /* renamed from: a */
    public static void m10506a(Context context) throws Exception {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            Log.i("MultiDex", "Clearing old secondary dex dir (" + file.getPath() + ").");
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                Log.w("MultiDex", "Failed to list secondary dex dir content (" + file.getPath() + ").");
                return;
            }
            for (File file2 : listFiles) {
                Log.i("MultiDex", "Trying to delete old file " + file2.getPath() + " of size " + file2.length());
                if (file2.delete()) {
                    Log.i("MultiDex", "Deleted old file " + file2.getPath());
                } else {
                    Log.w("MultiDex", "Failed to delete old file " + file2.getPath());
                }
            }
            if (file.delete()) {
                Log.i("MultiDex", "Deleted old secondary dex dir " + file.getPath());
                return;
            }
            Log.w("MultiDex", "Failed to delete secondary dex dir " + file.getPath());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053 A[Catch: all -> 0x00ae, DONT_GENERATE, TRY_LEAVE, TryCatch #6 {, blocks: (B:4:0x0009, B:6:0x000f, B:8:0x0011, B:10:0x003b, B:11:0x003f, B:19:0x0053, B:25:0x0061, B:26:0x0068, B:29:0x0078, B:38:0x00a0, B:42:0x00a7, B:44:0x00a9, B:28:0x006c, B:14:0x0044, B:16:0x004b, B:21:0x0055, B:31:0x0086, B:32:0x008a, B:37:0x0091), top: B:57:0x0009, inners: #4, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[Catch: all -> 0x0059, TRY_ENTER, TRY_LEAVE, TryCatch #6 {, blocks: (B:4:0x0009, B:6:0x000f, B:8:0x0011, B:10:0x003b, B:11:0x003f, B:19:0x0053, B:25:0x0061, B:26:0x0068, B:29:0x0078, B:38:0x00a0, B:42:0x00a7, B:44:0x00a9, B:28:0x006c, B:14:0x0044, B:16:0x004b, B:21:0x0055, B:31:0x0086, B:32:0x008a, B:37:0x0091), top: B:57:0x0009, inners: #4, #7 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m10505b(android.content.Context r7, java.io.File r8, java.io.File r9) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.InstantiationException {
        /*
            java.lang.String r0 = "secondary-dexes"
            java.lang.String r1 = ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\""
            java.lang.String r2 = "MultiDex is not guaranteed to work in SDK version "
            java.util.HashSet r3 = androidx.multidex.C1524a.f3518a
            monitor-enter(r3)
            boolean r4 = r3.contains(r8)     // Catch: java.lang.Throwable -> Lae
            if (r4 == 0) goto L11
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lae
            return
        L11:
            r3.add(r8)     // Catch: java.lang.Throwable -> Lae
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lae
            java.lang.String r5 = "MultiDex"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lae
            r6.<init>(r2)     // Catch: java.lang.Throwable -> Lae
            r6.append(r4)     // Catch: java.lang.Throwable -> Lae
            r6.append(r1)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r1 = "java.vm.version"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.Throwable -> Lae
            r6.append(r1)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r1 = "\""
            r6.append(r1)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> Lae
            android.util.Log.w(r5, r1)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r1 = "MultiDex"
            r2 = 0
            java.lang.ClassLoader r4 = r7.getClassLoader()     // Catch: java.lang.RuntimeException -> L4a java.lang.Throwable -> Lae
            boolean r5 = r4 instanceof dalvik.system.BaseDexClassLoader     // Catch: java.lang.Throwable -> Lae
            if (r5 == 0) goto L44
            goto L51
        L44:
            java.lang.String r4 = "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching."
            android.util.Log.e(r1, r4)     // Catch: java.lang.Throwable -> Lae
            goto L50
        L4a:
            r4 = move-exception
            java.lang.String r5 = "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching."
            android.util.Log.w(r1, r5, r4)     // Catch: java.lang.Throwable -> Lae
        L50:
            r4 = r2
        L51:
            if (r4 != 0) goto L55
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lae
            return
        L55:
            m10506a(r7)     // Catch: java.lang.Throwable -> L59
            goto L61
        L59:
            r1 = move-exception
            java.lang.String r5 = "MultiDex"
            java.lang.String r6 = "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning."
            android.util.Log.w(r5, r6, r1)     // Catch: java.lang.Throwable -> Lae
        L61:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> Lae
            java.lang.String r5 = "code_cache"
            r1.<init>(r9, r5)     // Catch: java.lang.Throwable -> Lae
            m10502e(r1)     // Catch: java.io.IOException -> L6c java.lang.Throwable -> Lae
            goto L78
        L6c:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> Lae
            java.io.File r9 = r7.getFilesDir()     // Catch: java.lang.Throwable -> Lae
            r1.<init>(r9, r5)     // Catch: java.lang.Throwable -> Lae
            m10502e(r1)     // Catch: java.lang.Throwable -> Lae
        L78:
            java.io.File r9 = new java.io.File     // Catch: java.lang.Throwable -> Lae
            r9.<init>(r1, r0)     // Catch: java.lang.Throwable -> Lae
            m10502e(r9)     // Catch: java.lang.Throwable -> Lae
            androidx.multidex.c r0 = new androidx.multidex.c     // Catch: java.lang.Throwable -> Lae
            r0.<init>(r8, r9)     // Catch: java.lang.Throwable -> Lae
            r8 = 0
            java.util.ArrayList r8 = r0.m10497f(r7, r8)     // Catch: java.lang.Throwable -> L8e
            m10503d(r9, r4, r8)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            goto La0
        L8e:
            r7 = move-exception
            goto Laa
        L90:
            r8 = move-exception
            java.lang.String r1 = "MultiDex"
            java.lang.String r5 = "Failed to install extracted secondary dex files, retrying with forced extraction"
            android.util.Log.w(r1, r5, r8)     // Catch: java.lang.Throwable -> L8e
            r8 = 1
            java.util.ArrayList r7 = r0.m10497f(r7, r8)     // Catch: java.lang.Throwable -> L8e
            m10503d(r9, r4, r7)     // Catch: java.lang.Throwable -> L8e
        La0:
            r0.close()     // Catch: java.io.IOException -> La4 java.lang.Throwable -> Lae
            goto La5
        La4:
            r2 = move-exception
        La5:
            if (r2 != 0) goto La9
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lae
            return
        La9:
            throw r2     // Catch: java.lang.Throwable -> Lae
        Laa:
            r0.close()     // Catch: java.io.IOException -> Lad java.lang.Throwable -> Lae
        Lad:
            throw r7     // Catch: java.lang.Throwable -> Lae
        Lae:
            r7 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lae
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.multidex.C1524a.m10505b(android.content.Context, java.io.File, java.io.File):void");
    }

    /* renamed from: c */
    public static Field m10504c(Object obj, String str) throws NoSuchFieldException {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        StringBuilder m13052b = C0063d.m13052b("Field ", str, " not found in ");
        m13052b.append(obj.getClass());
        throw new NoSuchFieldException(m13052b.toString());
    }

    /* renamed from: d */
    public static void m10503d(File file, ClassLoader classLoader, ArrayList arrayList) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException, SecurityException, ClassNotFoundException, InstantiationException {
        IOException[] iOExceptionArr;
        if (!arrayList.isEmpty()) {
            Object obj = m10504c(classLoader, "pathList").get(classLoader);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList(arrayList);
            Class<?>[] clsArr = {ArrayList.class, File.class, ArrayList.class};
            for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
                try {
                    Method declaredMethod = cls.getDeclaredMethod("makeDexElements", clsArr);
                    if (!declaredMethod.isAccessible()) {
                        declaredMethod.setAccessible(true);
                    }
                    Object[] objArr = (Object[]) declaredMethod.invoke(obj, arrayList3, file, arrayList2);
                    Field m10504c = m10504c(obj, "dexElements");
                    Object[] objArr2 = (Object[]) m10504c.get(obj);
                    Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
                    System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
                    System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
                    m10504c.set(obj, objArr3);
                    if (arrayList2.size() > 0) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
                        }
                        Field m10504c2 = m10504c(obj, "dexElementsSuppressedExceptions");
                        IOException[] iOExceptionArr2 = (IOException[]) m10504c2.get(obj);
                        if (iOExceptionArr2 == null) {
                            iOExceptionArr = (IOException[]) arrayList2.toArray(new IOException[arrayList2.size()]);
                        } else {
                            IOException[] iOExceptionArr3 = new IOException[arrayList2.size() + iOExceptionArr2.length];
                            arrayList2.toArray(iOExceptionArr3);
                            System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList2.size(), iOExceptionArr2.length);
                            iOExceptionArr = iOExceptionArr3;
                        }
                        m10504c2.set(obj, iOExceptionArr);
                        IOException iOException = new IOException("I/O exception during makeDexElement");
                        iOException.initCause((Throwable) arrayList2.get(0));
                        throw iOException;
                    }
                    return;
                } catch (NoSuchMethodException unused) {
                }
            }
            throw new NoSuchMethodException("Method makeDexElements with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
        }
    }

    /* renamed from: e */
    public static void m10502e(File file) throws IOException {
        File parentFile;
        String str;
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        if (file.getParentFile() == null) {
            str = "Failed to create dir " + file.getPath() + ". Parent file is null.";
        } else {
            str = "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite();
        }
        Log.e("MultiDex", str);
        throw new IOException("Failed to create directory " + file.getPath());
    }
}
