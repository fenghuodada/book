package com.google.android.gms.internal.ads;

import androidx.appcompat.view.menu.C0235r;
import com.google.android.gms.internal.ads.zzgos;
import com.google.android.gms.internal.ads.zzgow;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p060j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class zzgow<MessageType extends zzgow<MessageType, BuilderType>, BuilderType extends zzgos<MessageType, BuilderType>> extends zzgmx<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzgrr zzc = zzgrr.zzc();

    private final int zza(zzgqz zzgqzVar) {
        if (zzgqzVar == null) {
            return zzgqo.zza().zzb(getClass()).zza(this);
        }
        return zzgqzVar.zza(this);
    }

    public static zzgow zzaC(Class cls) {
        Map map = zzb;
        zzgow zzgowVar = (zzgow) map.get(cls);
        if (zzgowVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgowVar = (zzgow) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzgowVar == null) {
            zzgowVar = (zzgow) ((zzgow) zzgsa.zzg(cls)).zzb(6, null, null);
            if (zzgowVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzgowVar);
        }
        return zzgowVar;
    }

    public static zzgow zzaE(zzgow zzgowVar, zzgno zzgnoVar) throws zzgpi {
        zzgoi zzgoiVar = zzgoi.zza;
        zzgnw zzl = zzgnoVar.zzl();
        zzgow zzaD = zzgowVar.zzaD();
        try {
            zzgqz zzb2 = zzgqo.zza().zzb(zzaD.getClass());
            zzb2.zzh(zzaD, zzgnx.zzq(zzl), zzgoiVar);
            zzb2.zzf(zzaD);
            try {
                zzl.zzz(0);
                zzc(zzaD);
                zzc(zzaD);
                return zzaD;
            } catch (zzgpi e) {
                e.zzh(zzaD);
                throw e;
            }
        } catch (zzgpi e2) {
            e = e2;
            if (e.zzl()) {
                e = new zzgpi(e);
            }
            e.zzh(zzaD);
            throw e;
        } catch (zzgrp e3) {
            zzgpi zza = e3.zza();
            zza.zzh(zzaD);
            throw zza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzgpi) {
                throw ((zzgpi) e4.getCause());
            }
            zzgpi zzgpiVar = new zzgpi(e4);
            zzgpiVar.zzh(zzaD);
            throw zzgpiVar;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzgpi) {
                throw ((zzgpi) e5.getCause());
            }
            throw e5;
        }
    }

    public static zzgow zzaF(zzgow zzgowVar, byte[] bArr) throws zzgpi {
        zzgow zzd = zzd(zzgowVar, bArr, 0, bArr.length, zzgoi.zza);
        zzc(zzd);
        return zzd;
    }

    public static zzgow zzaG(zzgow zzgowVar, zzgno zzgnoVar, zzgoi zzgoiVar) throws zzgpi {
        zzgnw zzl = zzgnoVar.zzl();
        zzgow zzaD = zzgowVar.zzaD();
        try {
            zzgqz zzb2 = zzgqo.zza().zzb(zzaD.getClass());
            zzb2.zzh(zzaD, zzgnx.zzq(zzl), zzgoiVar);
            zzb2.zzf(zzaD);
            try {
                zzl.zzz(0);
                zzc(zzaD);
                return zzaD;
            } catch (zzgpi e) {
                e.zzh(zzaD);
                throw e;
            }
        } catch (zzgpi e2) {
            e = e2;
            if (e.zzl()) {
                e = new zzgpi(e);
            }
            e.zzh(zzaD);
            throw e;
        } catch (zzgrp e3) {
            zzgpi zza = e3.zza();
            zza.zzh(zzaD);
            throw zza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzgpi) {
                throw ((zzgpi) e4.getCause());
            }
            zzgpi zzgpiVar = new zzgpi(e4);
            zzgpiVar.zzh(zzaD);
            throw zzgpiVar;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzgpi) {
                throw ((zzgpi) e5.getCause());
            }
            throw e5;
        }
    }

    public static zzgow zzaH(zzgow zzgowVar, InputStream inputStream, zzgoi zzgoiVar) throws zzgpi {
        zzgnw zzH = zzgnw.zzH(inputStream, 4096);
        zzgow zzaD = zzgowVar.zzaD();
        try {
            zzgqz zzb2 = zzgqo.zza().zzb(zzaD.getClass());
            zzb2.zzh(zzaD, zzgnx.zzq(zzH), zzgoiVar);
            zzb2.zzf(zzaD);
            zzc(zzaD);
            return zzaD;
        } catch (zzgpi e) {
            e = e;
            if (e.zzl()) {
                e = new zzgpi(e);
            }
            e.zzh(zzaD);
            throw e;
        } catch (zzgrp e2) {
            zzgpi zza = e2.zza();
            zza.zzh(zzaD);
            throw zza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzgpi) {
                throw ((zzgpi) e3.getCause());
            }
            zzgpi zzgpiVar = new zzgpi(e3);
            zzgpiVar.zzh(zzaD);
            throw zzgpiVar;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzgpi) {
                throw ((zzgpi) e4.getCause());
            }
            throw e4;
        }
    }

    public static zzgow zzaI(zzgow zzgowVar, byte[] bArr, zzgoi zzgoiVar) throws zzgpi {
        zzgow zzd = zzd(zzgowVar, bArr, 0, bArr.length, zzgoiVar);
        zzc(zzd);
        return zzd;
    }

    public static zzgpb zzaJ() {
        return zzgox.zzf();
    }

    public static zzgpb zzaK(zzgpb zzgpbVar) {
        int size = zzgpbVar.size();
        return zzgpbVar.zzg(size == 0 ? 10 : size + size);
    }

    public static zzgpe zzaL() {
        return zzgpv.zzf();
    }

    public static zzgpe zzaM(zzgpe zzgpeVar) {
        int size = zzgpeVar.size();
        return zzgpeVar.zza(size == 0 ? 10 : size + size);
    }

    public static zzgpf zzaN() {
        return zzgqp.zze();
    }

    public static zzgpf zzaO(zzgpf zzgpfVar) {
        int size = zzgpfVar.size();
        return zzgpfVar.zzd(size == 0 ? 10 : size + size);
    }

    public static Object zzaQ(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static Object zzaR(zzgqg zzgqgVar, String str, Object[] objArr) {
        return new zzgqq(zzgqgVar, str, objArr);
    }

    public static void zzaU(Class cls, zzgow zzgowVar) {
        zzgowVar.zzaT();
        zzb.put(cls, zzgowVar);
    }

    private static zzgow zzc(zzgow zzgowVar) throws zzgpi {
        if (zzgowVar == null || zzgowVar.zzaX()) {
            return zzgowVar;
        }
        zzgpi zza = new zzgrp(zzgowVar).zza();
        zza.zzh(zzgowVar);
        throw zza;
    }

    private static zzgow zzd(zzgow zzgowVar, byte[] bArr, int i, int i2, zzgoi zzgoiVar) throws zzgpi {
        zzgow zzaD = zzgowVar.zzaD();
        try {
            zzgqz zzb2 = zzgqo.zza().zzb(zzaD.getClass());
            zzb2.zzi(zzaD, bArr, 0, i2, new zzgna(zzgoiVar));
            zzb2.zzf(zzaD);
            return zzaD;
        } catch (zzgpi e) {
            e = e;
            if (e.zzl()) {
                e = new zzgpi(e);
            }
            e.zzh(zzaD);
            throw e;
        } catch (zzgrp e2) {
            zzgpi zza = e2.zza();
            zza.zzh(zzaD);
            throw zza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzgpi) {
                throw ((zzgpi) e3.getCause());
            }
            zzgpi zzgpiVar = new zzgpi(e3);
            zzgpiVar.zzh(zzaD);
            throw zzgpiVar;
        } catch (IndexOutOfBoundsException unused) {
            zzgpi zzj = zzgpi.zzj();
            zzj.zzh(zzaD);
            throw zzj;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzgqo.zza().zzb(getClass()).zzj(this, (zzgow) obj);
        }
        return false;
    }

    public final int hashCode() {
        if (zzaY()) {
            return zzay();
        }
        int i = this.zza;
        if (i == 0) {
            int zzay = zzay();
            this.zza = zzay;
            return zzay;
        }
        return i;
    }

    public final String toString() {
        return zzgqi.zza(this, super.toString());
    }

    public final zzgos zzaA() {
        return (zzgos) zzb(5, null, null);
    }

    public final zzgos zzaB() {
        zzgos zzgosVar = (zzgos) zzb(5, null, null);
        zzgosVar.zzaj(this);
        return zzgosVar;
    }

    public final zzgow zzaD() {
        return (zzgow) zzb(4, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgqg
    public final /* synthetic */ zzgqf zzaP() {
        return (zzgos) zzb(5, null, null);
    }

    public final void zzaS() {
        zzgqo.zza().zzb(getClass()).zzf(this);
        zzaT();
    }

    public final void zzaT() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void zzaV(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzgqg
    public final void zzaW(zzgod zzgodVar) throws IOException {
        zzgqo.zza().zzb(getClass()).zzm(this, zzgoe.zza(zzgodVar));
    }

    public final boolean zzaX() {
        byte byteValue = ((Byte) zzb(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzgqo.zza().zzb(getClass()).zzk(this);
        zzb(2, true != zzk ? null : this, null);
        return zzk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzaY() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgmx
    public final int zzat(zzgqz zzgqzVar) {
        if (zzaY()) {
            int zza = zza(zzgqzVar);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException(C0235r.m12816a("serialized size must be non-negative, was ", zza));
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int zza2 = zza(zzgqzVar);
        if (zza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | zza2;
            return zza2;
        }
        throw new IllegalStateException(C0235r.m12816a("serialized size must be non-negative, was ", zza2));
    }

    public final int zzay() {
        return zzgqo.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgqg
    public final int zzaz() {
        int i;
        if (zzaY()) {
            i = zza(null);
            if (i < 0) {
                throw new IllegalStateException(C0235r.m12816a("serialized size must be non-negative, was ", i));
            }
        } else {
            i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = zza(null);
                if (i >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i;
                } else {
                    throw new IllegalStateException(C0235r.m12816a("serialized size must be non-negative, was ", i));
                }
            }
        }
        return i;
    }

    public abstract Object zzb(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* synthetic */ zzgqg zzbf() {
        return (zzgow) zzb(6, null, null);
    }
}
