package com.google.android.gms.internal.measurement;

import androidx.core.content.C0663f;
import androidx.core.p003os.C0740h;
import com.google.android.gms.internal.measurement.zzjj;
import com.google.android.gms.internal.measurement.zzjk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class zzjk<MessageType extends zzjk<MessageType, BuilderType>, BuilderType extends zzjj<MessageType, BuilderType>> implements zzmi {
    protected int zzb = 0;

    public static void zzbw(Iterable iterable, List list) {
        byte[] bArr = zzlj.zzd;
        iterable.getClass();
        if (iterable instanceof zzlq) {
            List zzh = ((zzlq) iterable).zzh();
            zzlq zzlqVar = (zzlq) list;
            int size = list.size();
            for (Object obj : zzh) {
                if (obj == null) {
                    String m11849a = C0740h.m11849a("Element at index ", zzlqVar.size() - size, " is null.");
                    int size2 = zzlqVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            break;
                        }
                        zzlqVar.remove(size2);
                    }
                    throw new NullPointerException(m11849a);
                } else if (obj instanceof zzka) {
                    zzlqVar.zzi((zzka) obj);
                } else {
                    zzlqVar.add((String) obj);
                }
            }
        } else if (!(iterable instanceof zzmp)) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
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
            list.addAll((Collection) iterable);
        }
    }

    public int zzbu(zzmt zzmtVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final zzka zzbv() {
        try {
            int zzbz = zzbz();
            zzka zzkaVar = zzka.zzb;
            byte[] bArr = new byte[zzbz];
            zzki zzz = zzki.zzz(bArr, 0, zzbz);
            zzbQ(zzz);
            zzz.zzA();
            return new zzjx(bArr);
        } catch (IOException e) {
            throw new RuntimeException(C0663f.m12005a("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
        }
    }

    public final byte[] zzbx() {
        try {
            int zzbz = zzbz();
            byte[] bArr = new byte[zzbz];
            zzki zzz = zzki.zzz(bArr, 0, zzbz);
            zzbQ(zzz);
            zzz.zzA();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(C0663f.m12005a("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}
