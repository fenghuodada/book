package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.google.android.datatransport.cct.internal.o */
/* loaded from: classes.dex */
public abstract class AbstractC6460o {

    /* renamed from: com.google.android.datatransport.cct.internal.o$a */
    /* loaded from: classes.dex */
    public enum EnumC6461a {
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN_MOBILE_SUBTYPE(0),
        /* JADX INFO: Fake field, exist only in values array */
        GPRS(1),
        /* JADX INFO: Fake field, exist only in values array */
        EDGE(2),
        /* JADX INFO: Fake field, exist only in values array */
        UMTS(3),
        /* JADX INFO: Fake field, exist only in values array */
        CDMA(4),
        /* JADX INFO: Fake field, exist only in values array */
        EVDO_0(5),
        /* JADX INFO: Fake field, exist only in values array */
        EVDO_A(6),
        /* JADX INFO: Fake field, exist only in values array */
        RTT(7),
        /* JADX INFO: Fake field, exist only in values array */
        HSDPA(8),
        /* JADX INFO: Fake field, exist only in values array */
        HSUPA(9),
        /* JADX INFO: Fake field, exist only in values array */
        HSPA(10),
        /* JADX INFO: Fake field, exist only in values array */
        IDEN(11),
        /* JADX INFO: Fake field, exist only in values array */
        EVDO_B(12),
        /* JADX INFO: Fake field, exist only in values array */
        LTE_CA(13),
        /* JADX INFO: Fake field, exist only in values array */
        TD_SCDMA(14),
        /* JADX INFO: Fake field, exist only in values array */
        IWLAN(15),
        /* JADX INFO: Fake field, exist only in values array */
        LTE_CA(16),
        /* JADX INFO: Fake field, exist only in values array */
        TD_SCDMA(17),
        /* JADX INFO: Fake field, exist only in values array */
        IWLAN(18),
        /* JADX INFO: Fake field, exist only in values array */
        LTE_CA(19),
        /* JADX INFO: Fake field, exist only in values array */
        COMBINED(100);
        

        /* renamed from: a */
        public static final SparseArray<EnumC6461a> f10158a;

        static {
            EnumC6461a enumC6461a;
            EnumC6461a enumC6461a2;
            EnumC6461a enumC6461a3;
            EnumC6461a enumC6461a4;
            EnumC6461a enumC6461a5;
            EnumC6461a enumC6461a6;
            EnumC6461a enumC6461a7;
            EnumC6461a enumC6461a8;
            EnumC6461a enumC6461a9;
            EnumC6461a enumC6461a10;
            EnumC6461a enumC6461a11;
            EnumC6461a enumC6461a12;
            EnumC6461a enumC6461a13;
            EnumC6461a enumC6461a14;
            EnumC6461a enumC6461a15;
            EnumC6461a enumC6461a16;
            EnumC6461a enumC6461a17;
            EnumC6461a enumC6461a18;
            EnumC6461a enumC6461a19;
            EnumC6461a enumC6461a20;
            SparseArray<EnumC6461a> sparseArray = new SparseArray<>();
            f10158a = sparseArray;
            sparseArray.put(0, enumC6461a);
            sparseArray.put(1, enumC6461a2);
            sparseArray.put(2, enumC6461a3);
            sparseArray.put(3, enumC6461a4);
            sparseArray.put(4, enumC6461a5);
            sparseArray.put(5, enumC6461a6);
            sparseArray.put(6, enumC6461a7);
            sparseArray.put(7, enumC6461a8);
            sparseArray.put(8, enumC6461a9);
            sparseArray.put(9, enumC6461a10);
            sparseArray.put(10, enumC6461a11);
            sparseArray.put(11, enumC6461a12);
            sparseArray.put(12, enumC6461a13);
            sparseArray.put(13, enumC6461a14);
            sparseArray.put(14, enumC6461a15);
            sparseArray.put(15, enumC6461a16);
            sparseArray.put(16, enumC6461a17);
            sparseArray.put(17, enumC6461a18);
            sparseArray.put(18, enumC6461a19);
            sparseArray.put(19, enumC6461a20);
        }

        EnumC6461a(int i) {
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.o$b */
    /* loaded from: classes.dex */
    public enum EnumC6462b {
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE(0),
        /* JADX INFO: Fake field, exist only in values array */
        WIFI(1),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_MMS(2),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_SUPL(3),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_DUN(4),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_HIPRI(5),
        /* JADX INFO: Fake field, exist only in values array */
        WIMAX(6),
        /* JADX INFO: Fake field, exist only in values array */
        BLUETOOTH(7),
        /* JADX INFO: Fake field, exist only in values array */
        DUMMY(8),
        /* JADX INFO: Fake field, exist only in values array */
        ETHERNET(9),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_FOTA(10),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_IMS(11),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_CBS(12),
        /* JADX INFO: Fake field, exist only in values array */
        PROXY(13),
        /* JADX INFO: Fake field, exist only in values array */
        VPN(14),
        /* JADX INFO: Fake field, exist only in values array */
        NONE(15),
        /* JADX INFO: Fake field, exist only in values array */
        PROXY(16),
        /* JADX INFO: Fake field, exist only in values array */
        VPN(17),
        /* JADX INFO: Fake field, exist only in values array */
        NONE(-1);
        

        /* renamed from: a */
        public static final SparseArray<EnumC6462b> f10160a;

        static {
            EnumC6462b enumC6462b;
            EnumC6462b enumC6462b2;
            EnumC6462b enumC6462b3;
            EnumC6462b enumC6462b4;
            EnumC6462b enumC6462b5;
            EnumC6462b enumC6462b6;
            EnumC6462b enumC6462b7;
            EnumC6462b enumC6462b8;
            EnumC6462b enumC6462b9;
            EnumC6462b enumC6462b10;
            EnumC6462b enumC6462b11;
            EnumC6462b enumC6462b12;
            EnumC6462b enumC6462b13;
            EnumC6462b enumC6462b14;
            EnumC6462b enumC6462b15;
            EnumC6462b enumC6462b16;
            EnumC6462b enumC6462b17;
            EnumC6462b enumC6462b18;
            EnumC6462b enumC6462b19;
            SparseArray<EnumC6462b> sparseArray = new SparseArray<>();
            f10160a = sparseArray;
            sparseArray.put(0, enumC6462b);
            sparseArray.put(1, enumC6462b2);
            sparseArray.put(2, enumC6462b3);
            sparseArray.put(3, enumC6462b4);
            sparseArray.put(4, enumC6462b5);
            sparseArray.put(5, enumC6462b6);
            sparseArray.put(6, enumC6462b7);
            sparseArray.put(7, enumC6462b8);
            sparseArray.put(8, enumC6462b9);
            sparseArray.put(9, enumC6462b10);
            sparseArray.put(10, enumC6462b11);
            sparseArray.put(11, enumC6462b12);
            sparseArray.put(12, enumC6462b13);
            sparseArray.put(13, enumC6462b14);
            sparseArray.put(14, enumC6462b15);
            sparseArray.put(15, enumC6462b16);
            sparseArray.put(16, enumC6462b17);
            sparseArray.put(17, enumC6462b18);
            sparseArray.put(-1, enumC6462b19);
        }

        EnumC6462b(int i) {
        }
    }

    @Nullable
    /* renamed from: a */
    public abstract EnumC6461a mo6318a();

    @Nullable
    /* renamed from: b */
    public abstract EnumC6462b mo6317b();
}
