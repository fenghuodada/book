package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbzm {
    public static final Handler zza = new zzflv(Looper.getMainLooper());
    private static final String zzb = AdView.class.getName();
    private static final String zzc = InterstitialAd.class.getName();
    private static final String zzd = AdManagerAdView.class.getName();
    private static final String zze = AdManagerInterstitialAd.class.getName();
    private static final String zzf = SearchAdView.class.getName();
    private static final String zzg = AdLoader.class.getName();
    private float zzh = -1.0f;

    private final JSONArray zzA(Collection collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : collection) {
            zzB(jSONArray, obj);
        }
        return jSONArray;
    }

    private final void zzB(JSONArray jSONArray, @Nullable Object obj) throws JSONException {
        Object zzg2;
        if (obj instanceof Bundle) {
            zzg2 = zzh((Bundle) obj);
        } else if (obj instanceof Map) {
            zzg2 = zzi((Map) obj);
        } else if (obj instanceof Collection) {
            zzg2 = zzA((Collection) obj);
        } else if (!(obj instanceof Object[])) {
            jSONArray.put(obj);
            return;
        } else {
            zzg2 = zzg((Object[]) obj);
        }
        jSONArray.put(zzg2);
    }

    private final void zzC(JSONObject jSONObject, String str, @Nullable Object obj) throws JSONException {
        Boolean[] boolArr;
        Object zzg2;
        Long[] lArr;
        Double[] dArr;
        Integer[] numArr;
        Collection asList;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzt)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            zzg2 = zzh((Bundle) obj);
        } else if (obj instanceof Map) {
            zzg2 = zzi((Map) obj);
        } else {
            if (obj instanceof Collection) {
                str = String.valueOf(str);
                asList = (Collection) obj;
            } else if (obj instanceof Object[]) {
                asList = Arrays.asList((Object[]) obj);
            } else {
                int i = 0;
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    if (iArr == null) {
                        numArr = new Integer[0];
                    } else {
                        int length = iArr.length;
                        Integer[] numArr2 = new Integer[length];
                        while (i < length) {
                            numArr2[i] = Integer.valueOf(iArr[i]);
                            i++;
                        }
                        numArr = numArr2;
                    }
                    zzg2 = zzg(numArr);
                } else if (obj instanceof double[]) {
                    double[] dArr2 = (double[]) obj;
                    if (dArr2 == null) {
                        dArr = new Double[0];
                    } else {
                        int length2 = dArr2.length;
                        Double[] dArr3 = new Double[length2];
                        while (i < length2) {
                            dArr3[i] = Double.valueOf(dArr2[i]);
                            i++;
                        }
                        dArr = dArr3;
                    }
                    zzg2 = zzg(dArr);
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    if (jArr == null) {
                        lArr = new Long[0];
                    } else {
                        int length3 = jArr.length;
                        Long[] lArr2 = new Long[length3];
                        while (i < length3) {
                            lArr2[i] = Long.valueOf(jArr[i]);
                            i++;
                        }
                        lArr = lArr2;
                    }
                    zzg2 = zzg(lArr);
                } else if (!(obj instanceof boolean[])) {
                    jSONObject.put(str, obj);
                    return;
                } else {
                    boolean[] zArr = (boolean[]) obj;
                    if (zArr == null) {
                        boolArr = new Boolean[0];
                    } else {
                        int length4 = zArr.length;
                        Boolean[] boolArr2 = new Boolean[length4];
                        while (i < length4) {
                            boolArr2[i] = Boolean.valueOf(zArr[i]);
                            i++;
                        }
                        boolArr = boolArr2;
                    }
                    zzg2 = zzg(boolArr);
                }
            }
            zzg2 = zzA(asList);
        }
        jSONObject.put(str, zzg2);
    }

    private static final void zzD(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar, @Nullable String str, int i, int i2) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i);
        textView.setBackgroundColor(i2);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i);
        int zzx = zzx(context, 3);
        frameLayout.addView(textView, new FrameLayout.LayoutParams(zzqVar.zzf - zzx, zzqVar.zzc - zzx, 17));
        viewGroup.addView(frameLayout, zzqVar.zzf, zzqVar.zzc);
    }

    public static int zza(Context context, int i) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || (configuration = resources.getConfiguration()) == null) {
            return -1;
        }
        int i2 = configuration.orientation;
        if (i == 0) {
            i = i2;
        }
        return Math.round((i == i2 ? displayMetrics.heightPixels : displayMetrics.widthPixels) / displayMetrics.density);
    }

    public static AdSize zzc(Context context, int i, int i2, int i3) {
        float f;
        float f2;
        int i4;
        int zza2 = zza(context, i3);
        if (zza2 == -1) {
            return AdSize.INVALID;
        }
        int min = Math.min(90, Math.round(zza2 * 0.15f));
        if (i <= 655) {
            if (i > 632) {
                i4 = 81;
            } else if (i > 526) {
                f = i / 468.0f;
                f2 = 60.0f;
            } else if (i > 432) {
                i4 = 68;
            } else {
                f = i / 320.0f;
                f2 = 50.0f;
            }
            return new AdSize(i, Math.max(Math.min(i4, min), 50));
        }
        f = i / 728.0f;
        f2 = 90.0f;
        i4 = Math.round(f * f2);
        return new AdSize(i, Math.max(Math.min(i4, min), 50));
    }

    public static String zzd() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    @Nullable
    public static String zze(String str) {
        return zzz(str, "MD5");
    }

    @Nullable
    public static String zzf(String str) {
        return zzz(str, "SHA-256");
    }

    @VisibleForTesting
    public static boolean zzo(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) zzbdm.zzd.zze());
    }

    public static final int zzp(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, i, displayMetrics);
    }

    @Nullable
    @VisibleForTesting
    public static final String zzq(StackTraceElement[] stackTraceElementArr, String str) {
        int i;
        int i2;
        String str2;
        while (true) {
            i2 = i + 1;
            if (i2 >= stackTraceElementArr.length) {
                str2 = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i];
            String className = stackTraceElement.getClassName();
            i = ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (zzb.equalsIgnoreCase(className) || zzc.equalsIgnoreCase(className) || zzd.equalsIgnoreCase(className) || zze.equalsIgnoreCase(className) || zzf.equalsIgnoreCase(className) || zzg.equalsIgnoreCase(className))) ? 0 : i2;
        }
        str2 = stackTraceElementArr[i2].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                for (int i3 = 2; i3 > 0 && stringTokenizer.hasMoreElements(); i3--) {
                    sb.append(".");
                    sb.append(stringTokenizer.nextToken());
                }
                str = sb.toString();
            }
            if (str2 != null && !str2.contains(str)) {
                return str2;
            }
        }
        return null;
    }

    public static final boolean zzr() {
        if (Build.VERSION.SDK_INT >= 31) {
            String str = Build.FINGERPRINT;
            return str.contains("generic") || str.contains("emulator");
        }
        return Build.DEVICE.startsWith("generic");
    }

    public static final boolean zzs(Context context, int i) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, i) == 0;
    }

    public static final boolean zzt(Context context) {
        int isGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        return isGooglePlayServicesAvailable == 0 || isGooglePlayServicesAvailable == 2;
    }

    public static final boolean zzu() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static final int zzv(DisplayMetrics displayMetrics, int i) {
        return Math.round(i / displayMetrics.density);
    }

    public static final void zzw(Context context, @Nullable String str, String str2, Bundle bundle, boolean z, zzbzl zzbzlVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString(VungleMediationAdapter.KEY_APP_ID, applicationContext.getPackageName());
        if (str == null) {
            str = GoogleApiAvailabilityLight.getInstance().getApkVersion(context) + ".231700000";
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter(FacebookAdapter.KEY_ID, "gmob-apps");
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        zzbzlVar.zza(appendQueryParameter.toString());
    }

    public static final int zzx(Context context, int i) {
        return zzp(context.getResources().getDisplayMetrics(), i);
    }

    @Nullable
    public static final String zzy(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        return zzz(((contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id")) == null || zzr()) ? "emulator" : "emulator", "MD5");
    }

    @Nullable
    private static String zzz(String str, String str2) {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    public final int zzb(Context context, int i) {
        if (this.zzh < 0.0f) {
            synchronized (this) {
                if (this.zzh < 0.0f) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager == null) {
                        return 0;
                    }
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    this.zzh = displayMetrics.density;
                }
            }
        }
        return Math.round(i / this.zzh);
    }

    @VisibleForTesting
    public final JSONArray zzg(Object[] objArr) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            zzB(jSONArray, obj);
        }
        return jSONArray;
    }

    public final JSONObject zzh(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            zzC(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final JSONObject zzi(Map map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                zzC(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e.getMessage())));
        }
    }

    public final JSONObject zzj(@Nullable Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return zzh(bundle);
            } catch (JSONException e) {
                zzbzt.zzh("Error converting Bundle to JSON", e);
                return null;
            }
        }
        return null;
    }

    public final void zzk(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject2.get(next);
            try {
                Object obj2 = jSONObject.get(next);
                if (JSONObject.class.isInstance(obj2) && JSONObject.class.isInstance(obj)) {
                    zzk((JSONObject) obj2, (JSONObject) obj);
                }
            } catch (JSONException unused) {
                jSONObject.put(next, obj);
            }
        }
    }

    public final void zzl(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar, @Nullable String str, @Nullable String str2) {
        if (str2 != null) {
            zzbzt.zzj(str2);
        }
        zzD(viewGroup, zzqVar, str, -65536, -16777216);
    }

    public final void zzm(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar, @Nullable String str) {
        zzD(viewGroup, zzqVar, "Ads by Google", -16777216, -1);
    }

    public final void zzn(Context context, @Nullable String str, String str2, Bundle bundle, boolean z) {
        zzw(context, str, "gmob-apps", bundle, true, new zzbzl() { // from class: com.google.android.gms.internal.ads.zzbzj
            @Override // com.google.android.gms.internal.ads.zzbzl
            public final boolean zza(String str3) {
                new zzbzk(zzbzm.this, str3).start();
                return true;
            }
        });
    }
}
