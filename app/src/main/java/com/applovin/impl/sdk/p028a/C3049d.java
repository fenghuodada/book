package com.applovin.impl.sdk.p028a;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* renamed from: com.applovin.impl.sdk.a.d */
/* loaded from: classes.dex */
public class C3049d {

    /* renamed from: a */
    private final View f7586a;

    /* renamed from: b */
    private final FriendlyObstructionPurpose f7587b;

    /* renamed from: c */
    private final String f7588c;

    public C3049d(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f7586a = view;
        this.f7587b = friendlyObstructionPurpose;
        this.f7588c = str;
    }

    /* renamed from: a */
    public View m8058a() {
        return this.f7586a;
    }

    /* renamed from: b */
    public FriendlyObstructionPurpose m8057b() {
        return this.f7587b;
    }

    /* renamed from: c */
    public String m8056c() {
        return this.f7588c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3049d c3049d = (C3049d) obj;
        View view = this.f7586a;
        if (view == null ? c3049d.f7586a == null : view.equals(c3049d.f7586a)) {
            if (this.f7587b != c3049d.f7587b) {
                return false;
            }
            String str = this.f7588c;
            String str2 = c3049d.f7588c;
            return str != null ? str.equals(str2) : str2 == null;
        }
        return false;
    }

    public int hashCode() {
        View view = this.f7586a;
        int hashCode = (view != null ? view.hashCode() : 0) * 31;
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.f7587b;
        int hashCode2 = (hashCode + (friendlyObstructionPurpose != null ? friendlyObstructionPurpose.hashCode() : 0)) * 31;
        String str = this.f7588c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }
}
