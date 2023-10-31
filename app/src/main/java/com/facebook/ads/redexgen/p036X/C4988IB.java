package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.TreeSet;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.IB */
/* loaded from: assets/audience_network.dex */
public final class C4988IB {
    public static byte[] A05;
    public static String[] A06 = {"MBceJWRKAgeQJNY3ZRBdRhYJgpL3jkFQ", "518xlpwWcjlWASul8lHAahT8PqQVPF3u", "9RLjFZMlaqPSYVxgrCr3N29CAF4vaCFh", "Nd9PnywG3g8LluWsmNbg8PXBjZKSlX8G", "s", "C1TdeuC5gtnvKYkq95Rq", "MkXsOhuicHq9DXlwRCZefot2VxsvXJH1", "VJm3srbtmlXEw3gKHWc"};
    public boolean A01;
    public final int A02;
    public final String A03;
    public C5759Un A00 = C5759Un.A04;
    public final TreeSet<C5757Ul> A04 = new TreeSet<>();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 28);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{70, 0, 7, 15, 10, 3, 2, 72, 58, 110, 117, 58, 0, 55, 60, 51, Utf8.REPLACEMENT_BYTE, 59, 60, 53, 114, 61, 52, 114};
    }

    static {
        A02();
    }

    public C4988IB(int i, String str) {
        this.A02 = i;
        this.A03 = str;
    }

    public static C4988IB A00(int id, DataInputStream dataInputStream) throws IOException {
        C4988IB c4988ib = new C4988IB(dataInputStream.readInt(), dataInputStream.readUTF());
        if (id < 2) {
            long readLong = dataInputStream.readLong();
            C4993IG mutations = new C4993IG();
            C4992IF.A05(mutations, readLong);
            c4988ib.A0F(mutations);
        } else {
            C5759Un A00 = C5759Un.A00(dataInputStream);
            if (A06[4].length() == 13) {
                throw new RuntimeException();
            }
            A06[1] = "w2ExrNvXNhLYBLEt12rGyqcfRXmaXRhw";
            c4988ib.A00 = A00;
        }
        return c4988ib;
    }

    public final int A03(int result) {
        int hashCode = (this.A02 * 31) + this.A03.hashCode();
        if (result < 2) {
            long A00 = C4992IF.A00(this.A00);
            return (hashCode * 31) + ((int) ((A00 >>> 32) ^ A00));
        }
        return (hashCode * 31) + this.A00.hashCode();
    }

    public final long A04(long queryEndPosition, long currentEndPosition) {
        C5757Ul A062 = A06(queryEndPosition);
        if (A062.A01()) {
            long j = -Math.min(A062.A02() ? Long.MAX_VALUE : A062.A01, currentEndPosition);
            if (A06[3].charAt(14) != 'W') {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[7] = "ZNj15xTvoSD0UBJTiXr";
            strArr[5] = "u99g5dbJfvVcRXaISwTW";
            return j;
        }
        long j2 = queryEndPosition + currentEndPosition;
        long j3 = A062.A02 + A062.A01;
        if (j3 < j2) {
            for (C5757Ul c5757Ul : this.A04.tailSet(A062, false)) {
                if (c5757Ul.A02 > j3) {
                    break;
                }
                j3 = Math.max(j3, c5757Ul.A02 + c5757Ul.A01);
                if (j3 >= j2) {
                    break;
                }
            }
        }
        return Math.min(j3 - queryEndPosition, currentEndPosition);
    }

    public final InterfaceC4991IE A05() {
        return this.A00;
    }

    public final C5757Ul A06(long j) {
        C5757Ul A01 = C5757Ul.A01(this.A03, j);
        C5757Ul floor = this.A04.floor(A01);
        if (floor != null && floor.A02 + floor.A01 > j) {
            return floor;
        }
        C5757Ul ceiling = this.A04.ceiling(A01);
        if (ceiling == null) {
            return C5757Ul.A02(this.A03, j);
        }
        return C5757Ul.A03(this.A03, j, ceiling.A02 - j);
    }

    public final C5757Ul A07(C5757Ul c5757Ul) throws C4979I2 {
        C4997IK.A04(this.A04.remove(c5757Ul));
        C5757Ul A08 = c5757Ul.A08(this.A02);
        if (c5757Ul.A03.renameTo(A08.A03)) {
            this.A04.add(A08);
            return A08;
        }
        throw new C4979I2(A01(12, 12, 78) + c5757Ul.A03 + A01(8, 4, 6) + A08.A03 + A01(0, 8, 122));
    }

    public final TreeSet<C5757Ul> A08() {
        return this.A04;
    }

    public final void A09(C5757Ul c5757Ul) {
        this.A04.add(c5757Ul);
    }

    public final void A0A(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.A02);
        dataOutputStream.writeUTF(this.A03);
        this.A00.A09(dataOutputStream);
    }

    public final void A0B(boolean z) {
        this.A01 = z;
    }

    public final boolean A0C() {
        return this.A04.isEmpty();
    }

    public final boolean A0D() {
        return this.A01;
    }

    public final boolean A0E(C4985I8 c4985i8) {
        if (this.A04.remove(c4985i8)) {
            c4985i8.A03.delete();
            return true;
        }
        return false;
    }

    public final boolean A0F(C4993IG c4993ig) {
        C5759Un c5759Un = this.A00;
        this.A00 = this.A00.A08(c4993ig);
        return !this.A00.equals(c5759Un);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4988IB c4988ib = (C4988IB) obj;
        if (this.A02 == c4988ib.A02 && this.A03.equals(c4988ib.A03)) {
            TreeSet<C5757Ul> treeSet = this.A04;
            if (A06[4].length() == 13) {
                throw new RuntimeException();
            }
            A06[4] = "qw9AeUbTiw";
            if (treeSet.equals(c4988ib.A04) && this.A00.equals(c4988ib.A00)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (A03(Integer.MAX_VALUE) * 31) + this.A04.hashCode();
    }
}
