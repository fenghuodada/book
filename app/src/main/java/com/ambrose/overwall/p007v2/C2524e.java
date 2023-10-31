package com.ambrose.overwall.p007v2;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import androidx.core.p003os.C0740h;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.C10752h;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C10925n;
import kotlin.text.C10929r;
import kotlin.text.C10930s;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncom/ambrose/overwall/v2/Utils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,241:1\n766#2:242\n857#2,2:243\n766#2:245\n857#2,2:246\n766#2:248\n857#2,2:249\n1855#2,2:253\n37#3,2:251\n*S KotlinDebug\n*F\n+ 1 Utils.kt\ncom/ambrose/overwall/v2/Utils\n*L\n23#1:242\n23#1:243,2\n68#1:245\n68#1:246,2\n78#1:248\n78#1:249,2\n221#1:253,2\n136#1:251,2\n*E\n"})
/* renamed from: com.ambrose.overwall.v2.e */
/* loaded from: classes.dex */
public final class C2524e {
    @NotNull

    /* renamed from: a */
    public static final C2524e f6008a = new C2524e();
    @NotNull

    /* renamed from: b */
    public static final ArrayList<Socket> f6009b = new ArrayList<>();

    @NotNull
    /* renamed from: a */
    public static String m9396a(@NotNull String str) {
        try {
            byte[] decode = Base64.decode(str, 2);
            C10843j.m431e(decode, "decode(text, Base64.NO_WRAP)");
            Charset forName = Charset.forName("UTF-8");
            C10843j.m431e(forName, "forName(charsetName)");
            return new String(decode, forName);
        } catch (Exception e) {
            Log.i("com.ambrose.overwall", "Parse base64 standard failed " + e);
            try {
                byte[] decode2 = Base64.decode(str, 10);
                C10843j.m431e(decode2, "decode(text, Base64.NO_WRAP.or(Base64.URL_SAFE))");
                Charset forName2 = Charset.forName("UTF-8");
                C10843j.m431e(forName2, "forName(charsetName)");
                return new String(decode2, forName2);
            } catch (Exception e2) {
                Log.i("com.ambrose.overwall", "Parse base64 url safe failed " + e2);
                return "";
            }
        }
    }

    @NotNull
    /* renamed from: b */
    public static List m9395b() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (Object obj : C10929r.m386F("223.5.5.5", new String[]{","})) {
            String value = (String) obj;
            C10843j.m430f(value, "value");
            Pattern compile = Pattern.compile("^([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])$");
            C10843j.m431e(compile, "compile(pattern)");
            boolean z2 = false;
            if (!compile.matcher(value).matches() && !m9392e(value)) {
                z = false;
            } else {
                z = true;
            }
            if ((z || C10925n.m392k(value, "https", false)) ? true : true) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return C10752h.m486c("223.5.5.5");
        }
        return arrayList;
    }

    @NotNull
    /* renamed from: c */
    public static List m9394c() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (Object obj : C10929r.m386F("1.1.1.1", new String[]{","})) {
            String value = (String) obj;
            C10843j.m430f(value, "value");
            Pattern compile = Pattern.compile("^([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])$");
            C10843j.m431e(compile, "compile(pattern)");
            boolean z2 = false;
            if (!compile.matcher(value).matches() && !m9392e(value)) {
                z = false;
            } else {
                z = true;
            }
            if ((z || C10925n.m392k(value, "https", false)) ? true : true) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return C10752h.m486c("1.1.1.1");
        }
        return arrayList;
    }

    /* renamed from: d */
    public static boolean m9393d(@NotNull String value) {
        boolean z;
        C10843j.m430f(value, "value");
        try {
            if (value.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !C10925n.m396g(value)) {
                if (C10929r.m373s(value, RemoteSettings.FORWARD_SLASH_STRING, 0, false, 6) > 0) {
                    List m386F = C10929r.m386F(value, new String[]{RemoteSettings.FORWARD_SLASH_STRING});
                    if (m386F.size() == 2 && Integer.parseInt((String) m386F.get(1)) > 0) {
                        value = (String) m386F.get(0);
                    }
                }
                if (C10925n.m392k(value, "::ffff:", false) && C10929r.m380l(value, '.')) {
                    value = C10930s.m365L(7, value);
                } else if (C10925n.m392k(value, "[::ffff:", false) && C10929r.m380l(value, '.')) {
                    value = C10925n.m394i(C10930s.m365L(8, value), "]", "");
                }
                String[] strArr = (String[]) C10929r.m387E(value, new char[]{'.'}).toArray(new String[0]);
                if (strArr.length == 4) {
                    if (C10929r.m373s(strArr[3], ":", 0, false, 6) > 0) {
                        value = value.substring(0, C10929r.m373s(value, ":", 0, false, 6));
                        C10843j.m431e(value, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    Pattern compile = Pattern.compile("^([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])$");
                    C10843j.m431e(compile, "compile(pattern)");
                    return compile.matcher(value).matches();
                }
                return m9392e(value);
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m9392e(@NotNull String value) {
        C10843j.m430f(value, "value");
        int i = 0;
        if (C10929r.m373s(value, "[", 0, false, 6) == 0 && C10929r.m370v(value, "]", 6) > 0) {
            boolean z = true;
            String m365L = C10930s.m365L(1, value);
            int length = m365L.length() - C10929r.m370v(m365L, "]", 6);
            if (length < 0) {
                z = false;
            }
            if (z) {
                int length2 = m365L.length() - length;
                if (length2 >= 0) {
                    i = length2;
                }
                value = C10930s.m364M(i, m365L);
            } else {
                throw new IllegalArgumentException(C0740h.m11849a("Requested character count ", length, " is less than zero.").toString());
            }
        }
        Pattern compile = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}))?((?::[0-9A-Fa-f]{1,4}))*::((?:[0-9A-Fa-f]{1,4}))?((?::[0-9A-Fa-f]{1,4}))*|((?:[0-9A-Fa-f]{1,4}))((?::[0-9A-Fa-f]{1,4})){7}$");
        C10843j.m431e(compile, "compile(pattern)");
        return compile.matcher(value).matches();
    }

    @NotNull
    /* renamed from: f */
    public static String m9391f(@NotNull Context context) {
        String file = context.getFilesDir().toString();
        C10843j.m431e(file, "context.filesDir.toString()");
        return C10925n.m394i(file, "files", "");
    }
}
