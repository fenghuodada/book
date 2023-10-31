package com.facebook.ads.redexgen.p036X;

import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.PM */
/* loaded from: assets/audience_network.dex */
public class C5423PM {
    public final String A00;
    public final String A01;
    public final ArrayList<String> A02;
    public final ArrayList<String> A03;
    public final ArrayList<String> A04;
    public final JSONObject A05;
    public final boolean A06;

    public C5423PM(JSONObject jSONObject, String str, String str2, ArrayList<String> imageUrls, ArrayList<String> videoUrls, ArrayList<String> fileUrls, boolean z) {
        this.A05 = jSONObject;
        this.A01 = str;
        this.A00 = str2;
        this.A03 = imageUrls;
        this.A04 = videoUrls;
        this.A02 = fileUrls;
        this.A06 = z;
    }
}
