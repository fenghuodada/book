package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.activity.result.a */
/* loaded from: classes.dex */
public final class C0054a implements Parcelable {
    @NonNull
    public static final Parcelable.Creator<C0054a> CREATOR = new C0055a();

    /* renamed from: a */
    public final int f106a;
    @Nullable

    /* renamed from: b */
    public final Intent f107b;

    /* renamed from: androidx.activity.result.a$a */
    /* loaded from: classes.dex */
    public class C0055a implements Parcelable.Creator<C0054a> {
        @Override // android.os.Parcelable.Creator
        public final C0054a createFromParcel(@NonNull Parcel parcel) {
            return new C0054a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C0054a[] newArray(int i) {
            return new C0054a[i];
        }
    }

    public C0054a(int i, @Nullable Intent intent) {
        this.f106a = i;
        this.f107b = intent;
    }

    public C0054a(Parcel parcel) {
        this.f106a = parcel.readInt();
        this.f107b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f106a;
        if (i != -1) {
            if (i != 0) {
                str = String.valueOf(i);
            } else {
                str = "RESULT_CANCELED";
            }
        } else {
            str = "RESULT_OK";
        }
        sb.append(str);
        sb.append(", data=");
        sb.append(this.f107b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeInt(this.f106a);
        Intent intent = this.f107b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
