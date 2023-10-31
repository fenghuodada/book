package com.qmuiteam.qmui.arch;

/* renamed from: com.qmuiteam.qmui.arch.p */
/* loaded from: classes3.dex */
public final class C9048p {

    /* renamed from: a */
    public static boolean f17300a = false;

    /* renamed from: b */
    public static boolean f17301b = false;

    /* renamed from: com.qmuiteam.qmui.arch.p$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC9049a {
        /* renamed from: a */
        String mo2765a();

        /* renamed from: b */
        boolean mo2764b();

        /* renamed from: c */
        boolean mo2763c(Object obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002d A[Catch: IllegalAccessException -> 0x007d, TRY_ENTER, TRY_LEAVE, TryCatch #4 {IllegalAccessException -> 0x007d, blocks: (B:11:0x0011, B:14:0x001f, B:16:0x0025, B:20:0x002d, B:21:0x002f, B:23:0x0039, B:24:0x0043, B:26:0x0049, B:28:0x004f, B:29:0x0051, B:31:0x005b, B:33:0x0066, B:34:0x006c, B:36:0x0072), top: B:54:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039 A[Catch: IllegalAccessException -> 0x007d, TRY_ENTER, TryCatch #4 {IllegalAccessException -> 0x007d, blocks: (B:11:0x0011, B:14:0x001f, B:16:0x0025, B:20:0x002d, B:21:0x002f, B:23:0x0039, B:24:0x0043, B:26:0x0049, B:28:0x004f, B:29:0x0051, B:31:0x005b, B:33:0x0066, B:34:0x006c, B:36:0x0072), top: B:54:0x0011 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m2767a(androidx.fragment.app.FragmentManager r6, com.qmuiteam.qmui.arch.C9048p.InterfaceC9049a r7) {
        /*
            if (r6 == 0) goto L81
            int r0 = r6.getBackStackEntryCount()
            if (r0 <= 0) goto L81
            r1 = -1
            if (r1 >= r0) goto L81
            int r2 = -r0
            if (r1 >= r2) goto L10
            goto L81
        L10:
            int r1 = r1 + r0
            androidx.fragment.app.FragmentManager$BackStackEntry r6 = r6.getBackStackEntryAt(r1)     // Catch: java.lang.IllegalAccessException -> L7d
            boolean r0 = r7.mo2764b()     // Catch: java.lang.IllegalAccessException -> L7d
            java.lang.Class<androidx.fragment.app.FragmentTransaction> r1 = androidx.fragment.app.FragmentTransaction.class
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L43
            java.lang.String r0 = "mName"
            boolean r4 = com.qmuiteam.qmui.arch.C9048p.f17300a     // Catch: java.lang.IllegalAccessException -> L7d
            if (r4 != 0) goto L2a
            java.lang.reflect.Field r4 = r1.getDeclaredField(r0)     // Catch: java.lang.NoSuchFieldException -> L2a java.lang.IllegalAccessException -> L7d
            goto L2b
        L2a:
            r4 = r2
        L2b:
            if (r4 != 0) goto L37
            com.qmuiteam.qmui.arch.C9048p.f17300a = r3     // Catch: java.lang.IllegalAccessException -> L7d
            java.lang.Class r5 = r6.getClass()     // Catch: java.lang.NoSuchFieldException -> L37 java.lang.IllegalAccessException -> L7d
            java.lang.reflect.Field r4 = r5.getDeclaredField(r0)     // Catch: java.lang.NoSuchFieldException -> L37 java.lang.IllegalAccessException -> L7d
        L37:
            if (r4 == 0) goto L43
            r4.setAccessible(r3)     // Catch: java.lang.IllegalAccessException -> L7d
            java.lang.String r0 = r7.mo2765a()     // Catch: java.lang.IllegalAccessException -> L7d
            r4.set(r6, r0)     // Catch: java.lang.IllegalAccessException -> L7d
        L43:
            java.lang.String r0 = "mOps"
            boolean r4 = com.qmuiteam.qmui.arch.C9048p.f17300a     // Catch: java.lang.IllegalAccessException -> L7d
            if (r4 != 0) goto L4d
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch: java.lang.NoSuchFieldException -> L4d java.lang.IllegalAccessException -> L7d
        L4d:
            if (r2 != 0) goto L59
            com.qmuiteam.qmui.arch.C9048p.f17300a = r3     // Catch: java.lang.IllegalAccessException -> L7d
            java.lang.Class r1 = r6.getClass()     // Catch: java.lang.NoSuchFieldException -> L59 java.lang.IllegalAccessException -> L7d
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch: java.lang.NoSuchFieldException -> L59 java.lang.IllegalAccessException -> L7d
        L59:
            if (r2 == 0) goto L81
            r2.setAccessible(r3)     // Catch: java.lang.IllegalAccessException -> L7d
            java.lang.Object r6 = r2.get(r6)     // Catch: java.lang.IllegalAccessException -> L7d
            boolean r0 = r6 instanceof java.util.List     // Catch: java.lang.IllegalAccessException -> L7d
            if (r0 == 0) goto L81
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.IllegalAccessException -> L7d
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.IllegalAccessException -> L7d
        L6c:
            boolean r0 = r6.hasNext()     // Catch: java.lang.IllegalAccessException -> L7d
            if (r0 == 0) goto L81
            java.lang.Object r0 = r6.next()     // Catch: java.lang.IllegalAccessException -> L7d
            boolean r0 = r7.mo2763c(r0)     // Catch: java.lang.IllegalAccessException -> L7d
            if (r0 == 0) goto L6c
            return
        L7d:
            r6 = move-exception
            r6.printStackTrace()
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qmuiteam.qmui.arch.C9048p.m2767a(androidx.fragment.app.FragmentManager, com.qmuiteam.qmui.arch.p$a):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0010  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.reflect.Field m2766b(java.lang.Object r1, java.lang.String r2, java.lang.String r3) {
        /*
            boolean r0 = com.qmuiteam.qmui.arch.C9048p.f17301b
            if (r0 != 0) goto Ld
            java.lang.Class r0 = r1.getClass()     // Catch: java.lang.NoSuchFieldException -> Ld
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> Ld
            goto Le
        Ld:
            r2 = 0
        Le:
            if (r2 != 0) goto L1b
            r0 = 1
            com.qmuiteam.qmui.arch.C9048p.f17301b = r0
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.NoSuchFieldException -> L1b
            java.lang.reflect.Field r2 = r1.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L1b
        L1b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qmuiteam.qmui.arch.C9048p.m2766b(java.lang.Object, java.lang.String, java.lang.String):java.lang.reflect.Field");
    }
}
