package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.activity.result.i */
/* loaded from: classes.dex */
public final class C0070i implements Parcelable {
    @JvmField
    @NotNull
    public static final Parcelable.Creator<C0070i> CREATOR = new C0071a();
    @NotNull

    /* renamed from: a */
    public final IntentSender f127a;
    @Nullable

    /* renamed from: b */
    public final Intent f128b;

    /* renamed from: c */
    public final int f129c;

    /* renamed from: d */
    public final int f130d;

    /* renamed from: androidx.activity.result.i$a */
    /* loaded from: classes.dex */
    public static final class C0071a implements Parcelable.Creator<C0070i> {
        @Override // android.os.Parcelable.Creator
        public final C0070i createFromParcel(Parcel inParcel) {
            C10843j.m430f(inParcel, "inParcel");
            Parcelable readParcelable = inParcel.readParcelable(IntentSender.class.getClassLoader());
            C10843j.m433c(readParcelable);
            return new C0070i((IntentSender) readParcelable, (Intent) inParcel.readParcelable(Intent.class.getClassLoader()), inParcel.readInt(), inParcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final C0070i[] newArray(int i) {
            return new C0070i[i];
        }
    }

    public C0070i(@NotNull IntentSender intentSender, @Nullable Intent intent, int i, int i2) {
        C10843j.m430f(intentSender, "intentSender");
        this.f127a = intentSender;
        this.f128b = intent;
        this.f129c = i;
        this.f130d = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i) {
        C10843j.m430f(dest, "dest");
        dest.writeParcelable(this.f127a, i);
        dest.writeParcelable(this.f128b, i);
        dest.writeInt(this.f129c);
        dest.writeInt(this.f130d);
    }
}
