package com.google.android.gms.internal.ads;

import androidx.core.content.C0663f;
import androidx.core.p003os.C0740h;
import com.google.android.gms.internal.ads.zzgmw;
import com.google.android.gms.internal.ads.zzgmx;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzgmx<MessageType extends zzgmx<MessageType, BuilderType>, BuilderType extends zzgmw<MessageType, BuilderType>> implements zzgqg {
    protected int zza = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static void zzav(Iterable iterable, List list) {
        byte[] bArr = zzgpg.zzd;
        iterable.getClass();
        if (iterable instanceof zzgpo) {
            List zzh = ((zzgpo) iterable).zzh();
            zzgpo zzgpoVar = (zzgpo) list;
            int size = list.size();
            for (Object obj : zzh) {
                if (obj == null) {
                    String m11849a = C0740h.m11849a("Element at index ", zzgpoVar.size() - size, " is null.");
                    int size2 = zzgpoVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            break;
                        }
                        zzgpoVar.remove(size2);
                    }
                    throw new NullPointerException(m11849a);
                } else if (obj instanceof zzgno) {
                    zzgpoVar.zzi((zzgno) obj);
                } else {
                    zzgpoVar.add((String) obj);
                }
            }
        } else if (!(iterable instanceof zzgqn)) {
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(iterable.size() + list.size());
            }
            int size3 = list.size();
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    String m11849a2 = C0740h.m11849a("Element at index ", list.size() - size3, " is null.");
                    int size4 = list.size();
                    while (true) {
                        size4--;
                        if (size4 < size3) {
                            break;
                        }
                        list.remove(size4);
                    }
                    throw new NullPointerException(m11849a2);
                }
                list.add(obj2);
            }
        } else {
            list.addAll(iterable);
        }
    }

    public int zzat(zzgqz zzgqzVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgqg
    public final zzgno zzau() {
        try {
            int zzaz = zzaz();
            zzgno zzgnoVar = zzgno.zzb;
            byte[] bArr = new byte[zzaz];
            zzgod zzC = zzgod.zzC(bArr, 0, zzaz);
            zzaW(zzC);
            zzC.zzD();
            return new zzgnk(bArr);
        } catch (IOException e) {
            throw new RuntimeException(C0663f.m12005a("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
        }
    }

    public final void zzaw(OutputStream outputStream) throws IOException {
        int zzaz = zzaz();
        int i = zzgod.zzf;
        if (zzaz > 4096) {
            zzaz = 4096;
        }
        zzgob zzgobVar = new zzgob(outputStream, zzaz);
        zzaW(zzgobVar);
        zzgobVar.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzgqg
    public final byte[] zzax() {
        try {
            int zzaz = zzaz();
            byte[] bArr = new byte[zzaz];
            zzgod zzC = zzgod.zzC(bArr, 0, zzaz);
            zzaW(zzC);
            zzC.zzD();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(C0663f.m12005a("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}
