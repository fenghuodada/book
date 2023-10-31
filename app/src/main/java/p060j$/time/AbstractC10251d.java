package p060j$.time;

import p060j$.time.temporal.EnumC10286a;
import p060j$.time.temporal.EnumC10287b;

/* renamed from: j$.time.d */
/* loaded from: classes2.dex */
abstract /* synthetic */ class AbstractC10251d {

    /* renamed from: a */
    static final /* synthetic */ int[] f20597a;

    /* renamed from: b */
    static final /* synthetic */ int[] f20598b;

    static {
        int[] iArr = new int[EnumC10287b.values().length];
        f20598b = iArr;
        try {
            iArr[EnumC10287b.NANOS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f20598b[EnumC10287b.MICROS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f20598b[EnumC10287b.MILLIS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f20598b[EnumC10287b.SECONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f20598b[EnumC10287b.MINUTES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f20598b[EnumC10287b.HOURS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f20598b[EnumC10287b.HALF_DAYS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f20598b[EnumC10287b.DAYS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        int[] iArr2 = new int[EnumC10286a.values().length];
        f20597a = iArr2;
        try {
            iArr2[EnumC10286a.NANO_OF_SECOND.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f20597a[EnumC10286a.MICRO_OF_SECOND.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f20597a[EnumC10286a.MILLI_OF_SECOND.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f20597a[EnumC10286a.INSTANT_SECONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
