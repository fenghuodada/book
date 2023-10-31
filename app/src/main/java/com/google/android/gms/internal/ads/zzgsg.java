package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzc uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class zzgsg {
    public static final zzgsg zza;
    public static final zzgsg zzb;
    public static final zzgsg zzc;
    public static final zzgsg zzd;
    public static final zzgsg zze;
    public static final zzgsg zzf;
    public static final zzgsg zzg;
    public static final zzgsg zzh;
    public static final zzgsg zzi;
    public static final zzgsg zzj;
    public static final zzgsg zzk;
    public static final zzgsg zzl;
    public static final zzgsg zzm;
    public static final zzgsg zzn;
    public static final zzgsg zzo;
    public static final zzgsg zzp;
    public static final zzgsg zzq;
    public static final zzgsg zzr;
    private static final /* synthetic */ zzgsg[] zzs;
    private final zzgsh zzt;

    static {
        zzgsg zzgsgVar = new zzgsg("DOUBLE", 0, zzgsh.DOUBLE, 1);
        zza = zzgsgVar;
        zzgsg zzgsgVar2 = new zzgsg("FLOAT", 1, zzgsh.FLOAT, 5);
        zzb = zzgsgVar2;
        zzgsh zzgshVar = zzgsh.LONG;
        zzgsg zzgsgVar3 = new zzgsg("INT64", 2, zzgshVar, 0);
        zzc = zzgsgVar3;
        zzgsg zzgsgVar4 = new zzgsg("UINT64", 3, zzgshVar, 0);
        zzd = zzgsgVar4;
        zzgsh zzgshVar2 = zzgsh.INT;
        zzgsg zzgsgVar5 = new zzgsg("INT32", 4, zzgshVar2, 0);
        zze = zzgsgVar5;
        zzgsg zzgsgVar6 = new zzgsg("FIXED64", 5, zzgshVar, 1);
        zzf = zzgsgVar6;
        zzgsg zzgsgVar7 = new zzgsg("FIXED32", 6, zzgshVar2, 5);
        zzg = zzgsgVar7;
        zzgsg zzgsgVar8 = new zzgsg("BOOL", 7, zzgsh.BOOLEAN, 0);
        zzh = zzgsgVar8;
        zzgsg zzgsgVar9 = new zzgsg("STRING", 8, zzgsh.STRING, 2);
        zzi = zzgsgVar9;
        zzgsh zzgshVar3 = zzgsh.MESSAGE;
        zzgsg zzgsgVar10 = new zzgsg("GROUP", 9, zzgshVar3, 3);
        zzj = zzgsgVar10;
        zzgsg zzgsgVar11 = new zzgsg("MESSAGE", 10, zzgshVar3, 2);
        zzk = zzgsgVar11;
        zzgsg zzgsgVar12 = new zzgsg("BYTES", 11, zzgsh.BYTE_STRING, 2);
        zzl = zzgsgVar12;
        zzgsg zzgsgVar13 = new zzgsg("UINT32", 12, zzgshVar2, 0);
        zzm = zzgsgVar13;
        zzgsg zzgsgVar14 = new zzgsg("ENUM", 13, zzgsh.ENUM, 0);
        zzn = zzgsgVar14;
        zzgsg zzgsgVar15 = new zzgsg("SFIXED32", 14, zzgshVar2, 5);
        zzo = zzgsgVar15;
        zzgsg zzgsgVar16 = new zzgsg("SFIXED64", 15, zzgshVar, 1);
        zzp = zzgsgVar16;
        zzgsg zzgsgVar17 = new zzgsg("SINT32", 16, zzgshVar2, 0);
        zzq = zzgsgVar17;
        zzgsg zzgsgVar18 = new zzgsg("SINT64", 17, zzgshVar, 0);
        zzr = zzgsgVar18;
        zzs = new zzgsg[]{zzgsgVar, zzgsgVar2, zzgsgVar3, zzgsgVar4, zzgsgVar5, zzgsgVar6, zzgsgVar7, zzgsgVar8, zzgsgVar9, zzgsgVar10, zzgsgVar11, zzgsgVar12, zzgsgVar13, zzgsgVar14, zzgsgVar15, zzgsgVar16, zzgsgVar17, zzgsgVar18};
    }

    private zzgsg(String str, int i, zzgsh zzgshVar, int i2) {
        this.zzt = zzgshVar;
    }

    public static zzgsg[] values() {
        return (zzgsg[]) zzs.clone();
    }

    public final zzgsh zza() {
        return this.zzt;
    }
}
