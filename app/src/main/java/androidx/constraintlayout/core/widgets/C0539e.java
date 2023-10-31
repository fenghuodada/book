package androidx.constraintlayout.core.widgets;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import java.util.List;

/* renamed from: androidx.constraintlayout.core.widgets.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C0539e implements ComponentRegistrarProcessor {
    /* renamed from: a */
    public static final String m12265a(int i) {
        return m12263c(i).toLowerCase();
    }

    /* renamed from: b */
    public static String m12264b(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: c */
    public static /* synthetic */ String m12263c(int i) {
        if (i == 1) {
            return "INIT";
        }
        if (i == 2) {
            return "INIT_END";
        }
        if (i == 3) {
            return "PLAY_AD";
        }
        if (i == 4) {
            return "APP_FOREGROUND";
        }
        if (i == 5) {
            return "APP_BACKGROUND";
        }
        if (i == 6) {
            return "AD_EXPIRED";
        }
        if (i == 7) {
            return "LOAD_AD";
        }
        if (i == 8) {
            return "LOAD_AD_END";
        }
        if (i == 9) {
            return "AD_AVAILABLE";
        }
        if (i == 10) {
            return "ANDROID_ID";
        }
        if (i == 11) {
            return "ADS_CACHED";
        }
        if (i == 12) {
            return "ORIENTATION";
        }
        if (i == 13) {
            return "MUTE";
        }
        if (i == 14) {
            return "REWARDED";
        }
        if (i == 15) {
            return "OM_SDK";
        }
        if (i == 16) {
            return "DID_CLOSE";
        }
        if (i == 17) {
            return "DISMISS_AD";
        }
        if (i == 18) {
            return "TPAT";
        }
        throw null;
    }

    /* renamed from: d */
    public static /* synthetic */ String m12262d(int i) {
        return i == 1 ? "INIT" : i == 2 ? "INIT_END" : i == 3 ? "PLAY_AD" : i == 4 ? "APP_FOREGROUND" : i == 5 ? "APP_BACKGROUND" : i == 6 ? "AD_EXPIRED" : i == 7 ? "LOAD_AD" : i == 8 ? "LOAD_AD_END" : i == 9 ? "AD_AVAILABLE" : i == 10 ? "ANDROID_ID" : i == 11 ? "ADS_CACHED" : i == 12 ? "ORIENTATION" : i == 13 ? "MUTE" : i == 14 ? "REWARDED" : i == 15 ? "OM_SDK" : i == 16 ? "DID_CLOSE" : i == 17 ? "DISMISS_AD" : i == 18 ? "TPAT" : "null";
    }

    @Override // com.google.firebase.components.ComponentRegistrarProcessor
    public List processRegistrar(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }
}
