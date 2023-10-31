package androidx.core.p003os;

import android.os.LocaleList;
import androidx.annotation.RequiresApi;
import java.util.Locale;

@RequiresApi(24)
/* renamed from: androidx.core.os.p */
/* loaded from: classes.dex */
public final class C0748p implements InterfaceC0742j {

    /* renamed from: a */
    public final LocaleList f2430a;

    public C0748p(Object obj) {
        this.f2430a = (LocaleList) obj;
    }

    @Override // androidx.core.p003os.InterfaceC0742j
    /* renamed from: a */
    public final String mo11835a() {
        String languageTags;
        languageTags = this.f2430a.toLanguageTags();
        return languageTags;
    }

    @Override // androidx.core.p003os.InterfaceC0742j
    /* renamed from: b */
    public final Object mo11834b() {
        return this.f2430a;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        equals = this.f2430a.equals(((InterfaceC0742j) obj).mo11834b());
        return equals;
    }

    @Override // androidx.core.p003os.InterfaceC0742j
    public final Locale get(int i) {
        Locale locale;
        locale = this.f2430a.get(i);
        return locale;
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f2430a.hashCode();
        return hashCode;
    }

    @Override // androidx.core.p003os.InterfaceC0742j
    public final boolean isEmpty() {
        boolean isEmpty;
        isEmpty = this.f2430a.isEmpty();
        return isEmpty;
    }

    @Override // androidx.core.p003os.InterfaceC0742j
    public final int size() {
        int size;
        size = this.f2430a.size();
        return size;
    }

    public final String toString() {
        String localeList;
        localeList = this.f2430a.toString();
        return localeList;
    }
}
