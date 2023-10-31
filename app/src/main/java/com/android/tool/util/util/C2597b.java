package com.android.tool.util.util;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.math.BigDecimal;

/* renamed from: com.android.tool.util.util.b */
/* loaded from: classes.dex */
public final class C2597b {
    /* renamed from: a */
    public static boolean m9345a(File file) {
        if (file != null && file.isDirectory()) {
            for (String str : file.list()) {
                if (!m9345a(new File(file, str))) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    /* renamed from: b */
    public static long m9344b(File file) throws Exception {
        long j = 0;
        try {
            File[] listFiles = file.listFiles();
            for (int i = 0; i < listFiles.length; i++) {
                j += listFiles[i].isDirectory() ? m9344b(listFiles[i]) : listFiles[i].length();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return j;
    }

    /* renamed from: c */
    public static String m9343c(Context context) throws Exception {
        StringBuilder sb;
        String str;
        long m9344b = m9344b(context.getCacheDir());
        if (Environment.getExternalStorageState().equals("mounted")) {
            m9344b += m9344b(context.getExternalCacheDir());
        }
        double d = m9344b / 1024.0d;
        if (d < 1.0d) {
            return "0K";
        }
        double d2 = d / 1024.0d;
        if (d2 < 1.0d) {
            BigDecimal bigDecimal = new BigDecimal(Double.toString(d));
            sb = new StringBuilder();
            sb.append(bigDecimal.setScale(2, 4).toPlainString());
            str = "K";
        } else {
            double d3 = d2 / 1024.0d;
            if (d3 < 1.0d) {
                BigDecimal bigDecimal2 = new BigDecimal(Double.toString(d2));
                sb = new StringBuilder();
                sb.append(bigDecimal2.setScale(2, 4).toPlainString());
                str = "M";
            } else {
                double d4 = d3 / 1024.0d;
                if (d4 < 1.0d) {
                    BigDecimal bigDecimal3 = new BigDecimal(Double.toString(d3));
                    sb = new StringBuilder();
                    sb.append(bigDecimal3.setScale(2, 4).toPlainString());
                    str = "GB";
                } else {
                    BigDecimal bigDecimal4 = new BigDecimal(d4);
                    sb = new StringBuilder();
                    sb.append(bigDecimal4.setScale(2, 4).toPlainString());
                    str = "TB";
                }
            }
        }
        sb.append(str);
        return sb.toString();
    }
}
