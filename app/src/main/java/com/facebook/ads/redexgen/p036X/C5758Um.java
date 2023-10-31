package com.facebook.ads.redexgen.p036X;

import android.os.ConditionVariable;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.Um */
/* loaded from: assets/audience_network.dex */
public final class C5758Um implements InterfaceC4981I4 {
    public static boolean A06;
    public static byte[] A07;
    public static final HashSet<File> A08;
    public long A00;
    public boolean A01;
    public final InterfaceC5760Uo A02;
    public final C4989IC A03;
    public final File A04;
    public final HashMap<String, ArrayList<InterfaceC4980I3>> A05;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 71);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A07 = new byte[]{106, 69, 68, 95, 67, 78, 89, 11, 120, 66, 70, 91, 71, 78, 104, 74, 72, 67, 78, 11, 66, 69, 88, 95, 74, 69, 72, 78, 11, 94, 88, 78, 88, 11, 95, 67, 78, 11, 77, 68, 71, 79, 78, 89, 17, 11, 82, 104, 108, 113, 109, 100, 66, 96, 98, 105, 100, 94, 100, 96, 125, 97, 104, 78, 108, 110, 101, 104, 35, 100, 99, 100, 121, 100, 108, 97, 100, 119, 104, 37, 36, 0, 39, 60, 33, 58, 61, 52, 115, 58, 61, 55, 54, 43, 115, 53, 58, Utf8.REPLACEMENT_BYTE, 54, 115, 53, 50, 58, Utf8.REPLACEMENT_BYTE, 54, 55, 28, 30, 28, 23, 26, 27, 32, 28, 16, 17, 11, 26, 17, 11, 32, 22, 17, 27, 26, 7, 81, 26, 7, 22};
    }

    static {
        A06();
        A08 = new HashSet<>();
    }

    public C5758Um(File file, InterfaceC5760Uo interfaceC5760Uo) {
        this(file, interfaceC5760Uo, null, false);
    }

    public C5758Um(File file, InterfaceC5760Uo interfaceC5760Uo, C4989IC c4989ic) {
        if (A0D(file)) {
            this.A04 = file;
            this.A02 = interfaceC5760Uo;
            this.A03 = c4989ic;
            this.A05 = new HashMap<>();
            ConditionVariable conditionVariable = new ConditionVariable();
            new C4994IH(this, A03(57, 24, 74), conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException(A03(0, 46, 108) + file);
    }

    public C5758Um(File file, InterfaceC5760Uo interfaceC5760Uo, byte[] bArr, boolean z) {
        this(file, interfaceC5760Uo, new C4989IC(file, bArr, z));
    }

    private C5757Ul A00(String str, long j) throws C4979I2 {
        C5757Ul A062;
        C4988IB A09 = this.A03.A09(str);
        if (A09 == null) {
            return C5757Ul.A02(str, j);
        }
        while (true) {
            A062 = A09.A06(j);
            if (!A062.A05 || A062.A03.exists()) {
                break;
            }
            A05();
        }
        return A062;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4981I4
    /* renamed from: A01 */
    public final synchronized C5757Ul AEz(String str, long j) throws InterruptedException, C4979I2 {
        C5757Ul AF0;
        while (true) {
            AF0 = AF0(str, j);
            if (AF0 == null) {
                wait();
            }
        }
        return AF0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4981I4
    /* renamed from: A02 */
    public final synchronized C5757Ul AF0(String str, long j) throws C4979I2 {
        C4997IK.A04(!this.A01);
        C5757Ul A00 = A00(str, j);
        if (A00.A05) {
            C5757Ul A072 = this.A03.A09(str).A07(A00);
            A0C(A00, A072);
            return A072;
        }
        C4988IB A0A = this.A03.A0A(str);
        if (!A0A.A0D()) {
            A0A.A0B(true);
            return A00;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if (!this.A04.exists()) {
            this.A04.mkdirs();
            return;
        }
        this.A03.A0E();
        File[] listFiles = this.A04.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (!file.getName().equals(A03(106, 24, 56))) {
                C5757Ul span = file.length() > 0 ? C5757Ul.A00(file, this.A03) : null;
                if (span != null) {
                    A0A(span);
                } else {
                    file.delete();
                }
            }
        }
        this.A03.A0F();
        try {
            this.A03.A0G();
        } catch (C4979I2 e) {
            Log.e(A03(46, 11, 70), A03(81, 25, 20), e);
        }
    }

    private void A05() throws C4979I2 {
        ArrayList arrayList = new ArrayList();
        for (C4988IB cachedContent : this.A03.A0D()) {
            Iterator<C5757Ul> it = cachedContent.A08().iterator();
            while (it.hasNext()) {
                C5757Ul next = it.next();
                if (!next.A03.exists()) {
                    arrayList.add(next);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            A08((C4985I8) arrayList.get(i), false);
        }
        this.A03.A0F();
        this.A03.A0G();
    }

    private void A07(C4985I8 c4985i8) {
        ArrayList<InterfaceC4980I3> arrayList = this.A05.get(c4985i8.A04);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).ACO(this, c4985i8);
            }
        }
        this.A02.ACO(this, c4985i8);
    }

    private void A08(C4985I8 c4985i8, boolean z) throws C4979I2 {
        C4988IB A09 = this.A03.A09(c4985i8.A04);
        if (A09 == null || !A09.A0E(c4985i8)) {
            return;
        }
        this.A00 -= c4985i8.A01;
        if (z) {
            try {
                this.A03.A0H(A09.A03);
                this.A03.A0G();
            } finally {
                A07(c4985i8);
            }
        }
    }

    private void A0A(C5757Ul c5757Ul) {
        this.A03.A0A(c5757Ul.A04).A09(c5757Ul);
        this.A00 += c5757Ul.A01;
        A0B(c5757Ul);
    }

    private void A0B(C5757Ul c5757Ul) {
        ArrayList<InterfaceC4980I3> arrayList = this.A05.get(c5757Ul.A04);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).ACN(this, c5757Ul);
            }
        }
        this.A02.ACN(this, c5757Ul);
    }

    private void A0C(C5757Ul c5757Ul, C4985I8 c4985i8) {
        ArrayList<InterfaceC4980I3> arrayList = this.A05.get(c5757Ul.A04);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).ACP(this, c5757Ul, c4985i8);
            }
        }
        this.A02.ACP(this, c5757Ul, c4985i8);
    }

    public static synchronized boolean A0D(File file) {
        synchronized (C5758Um.class) {
            if (A06) {
                return true;
            }
            return A08.add(file.getAbsoluteFile());
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4981I4
    public final synchronized void A3P(String str, C4993IG c4993ig) throws C4979I2 {
        C4997IK.A04(!this.A01);
        this.A03.A0I(str, c4993ig);
        this.A03.A0G();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4981I4
    public final synchronized void A44(File file) throws C4979I2 {
        C4997IK.A04(!this.A01);
        C5757Ul A00 = C5757Ul.A00(file, this.A03);
        C4997IK.A04(A00 != null);
        C4988IB A09 = this.A03.A09(A00.A04);
        C4997IK.A01(A09);
        C4997IK.A04(A09.A0D());
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
                return;
            }
            long A002 = C4992IF.A00(A09.A05());
            if (A002 != -1) {
                long j = A00.A02;
                long length = A00.A01;
                C4997IK.A04(j + length <= A002);
            }
            A0A(A00);
            this.A03.A0G();
            notifyAll();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4981I4
    public final synchronized long A5v() {
        C4997IK.A04(!this.A01);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4981I4
    public final synchronized long A5w(String str, long j, long j2) {
        C4988IB A09;
        C4997IK.A04(!this.A01);
        A09 = this.A03.A09(str);
        return A09 != null ? A09.A04(j, j2) : -j2;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4981I4
    @NonNull
    public final synchronized NavigableSet<C4985I8> A5x(String str) {
        TreeSet treeSet;
        C4997IK.A04(!this.A01);
        C4988IB A09 = this.A03.A09(str);
        if (A09 == null || A09.A0C()) {
            treeSet = new TreeSet();
        } else {
            treeSet = new TreeSet((Collection) A09.A08());
        }
        return treeSet;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4981I4
    public final synchronized long A68(String str) {
        return C4992IF.A00(A69(str));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4981I4
    public final synchronized InterfaceC4991IE A69(String str) {
        C4997IK.A04(!this.A01);
        return this.A03.A0B(str);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4981I4
    public final synchronized void ADq(C4985I8 c4985i8) {
        C4997IK.A04(!this.A01);
        C4988IB A09 = this.A03.A09(c4985i8.A04);
        C4997IK.A01(A09);
        C4997IK.A04(A09.A0D());
        A09.A0B(false);
        this.A03.A0H(A09.A03);
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4981I4
    public final synchronized void ADx(C4985I8 c4985i8) throws C4979I2 {
        C4997IK.A04(!this.A01);
        A08(c4985i8, true);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4981I4
    public final synchronized void AEW(String str, long j) throws C4979I2 {
        C4993IG c4993ig = new C4993IG();
        C4992IF.A05(c4993ig, j);
        A3P(str, c4993ig);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4981I4
    public final synchronized File AEx(String str, long j, long j2) throws C4979I2 {
        C4988IB A09;
        C4997IK.A04(!this.A01);
        A09 = this.A03.A09(str);
        C4997IK.A01(A09);
        C4997IK.A04(A09.A0D());
        if (!this.A04.exists()) {
            this.A04.mkdirs();
            A05();
        }
        this.A02.ACQ(this, str, j, j2);
        return C5757Ul.A04(this.A04, A09.A02, j, System.currentTimeMillis());
    }
}
