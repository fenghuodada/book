package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.annotation.RestrictTo;
import androidx.collection.C0470b;
import androidx.concurrent.futures.C0484a;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
/* renamed from: androidx.versionedparcelable.b */
/* loaded from: classes.dex */
public final class C1803b extends AbstractC1802a {

    /* renamed from: d */
    public final SparseIntArray f4389d;

    /* renamed from: e */
    public final Parcel f4390e;

    /* renamed from: f */
    public final int f4391f;

    /* renamed from: g */
    public final int f4392g;

    /* renamed from: h */
    public final String f4393h;

    /* renamed from: i */
    public int f4394i;

    /* renamed from: j */
    public int f4395j;

    /* renamed from: k */
    public int f4396k;

    public C1803b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0470b(), new C0470b(), new C0470b());
    }

    public C1803b(Parcel parcel, int i, int i2, String str, C0470b<String, Method> c0470b, C0470b<String, Method> c0470b2, C0470b<String, Class> c0470b3) {
        super(c0470b, c0470b2, c0470b3);
        this.f4389d = new SparseIntArray();
        this.f4394i = -1;
        this.f4396k = -1;
        this.f4390e = parcel;
        this.f4391f = i;
        this.f4392g = i2;
        this.f4395j = i;
        this.f4393h = str;
    }

    @Override // androidx.versionedparcelable.AbstractC1802a
    /* renamed from: a */
    public final C1803b mo9928a() {
        Parcel parcel = this.f4390e;
        int dataPosition = parcel.dataPosition();
        int i = this.f4395j;
        if (i == this.f4391f) {
            i = this.f4392g;
        }
        return new C1803b(parcel, dataPosition, i, C0484a.m12392a(new StringBuilder(), this.f4393h, "  "), this.f4386a, this.f4387b, this.f4388c);
    }

    @Override // androidx.versionedparcelable.AbstractC1802a
    /* renamed from: e */
    public final boolean mo9927e() {
        return this.f4390e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.AbstractC1802a
    /* renamed from: f */
    public final byte[] mo9926f() {
        Parcel parcel = this.f4390e;
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.AbstractC1802a
    /* renamed from: g */
    public final CharSequence mo9925g() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f4390e);
    }

    @Override // androidx.versionedparcelable.AbstractC1802a
    /* renamed from: h */
    public final boolean mo9924h(int i) {
        while (this.f4395j < this.f4392g) {
            int i2 = this.f4396k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f4395j;
            Parcel parcel = this.f4390e;
            parcel.setDataPosition(i3);
            int readInt = parcel.readInt();
            this.f4396k = parcel.readInt();
            this.f4395j += readInt;
        }
        return this.f4396k == i;
    }

    @Override // androidx.versionedparcelable.AbstractC1802a
    /* renamed from: i */
    public final int mo9923i() {
        return this.f4390e.readInt();
    }

    @Override // androidx.versionedparcelable.AbstractC1802a
    /* renamed from: k */
    public final <T extends Parcelable> T mo9922k() {
        return (T) this.f4390e.readParcelable(C1803b.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.AbstractC1802a
    /* renamed from: m */
    public final String mo9921m() {
        return this.f4390e.readString();
    }

    @Override // androidx.versionedparcelable.AbstractC1802a
    /* renamed from: o */
    public final void mo9920o(int i) {
        m9913x();
        this.f4394i = i;
        this.f4389d.put(i, this.f4390e.dataPosition());
        mo9916s(0);
        mo9916s(i);
    }

    @Override // androidx.versionedparcelable.AbstractC1802a
    /* renamed from: p */
    public final void mo9919p(boolean z) {
        this.f4390e.writeInt(z ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.AbstractC1802a
    /* renamed from: q */
    public final void mo9918q(byte[] bArr) {
        Parcel parcel = this.f4390e;
        if (bArr == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(bArr.length);
        parcel.writeByteArray(bArr);
    }

    @Override // androidx.versionedparcelable.AbstractC1802a
    /* renamed from: r */
    public final void mo9917r(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f4390e, 0);
    }

    @Override // androidx.versionedparcelable.AbstractC1802a
    /* renamed from: s */
    public final void mo9916s(int i) {
        this.f4390e.writeInt(i);
    }

    @Override // androidx.versionedparcelable.AbstractC1802a
    /* renamed from: u */
    public final void mo9915u(Parcelable parcelable) {
        this.f4390e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.AbstractC1802a
    /* renamed from: v */
    public final void mo9914v(String str) {
        this.f4390e.writeString(str);
    }

    /* renamed from: x */
    public final void m9913x() {
        int i = this.f4394i;
        if (i >= 0) {
            int i2 = this.f4389d.get(i);
            Parcel parcel = this.f4390e;
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i2);
            parcel.writeInt(dataPosition - i2);
            parcel.setDataPosition(dataPosition);
        }
    }
}
