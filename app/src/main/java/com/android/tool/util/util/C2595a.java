package com.android.tool.util.util;

import com.android.tool.bean.ResultsBean;
import java.util.Comparator;

/* renamed from: com.android.tool.util.util.a */
/* loaded from: classes.dex */
public final class C2595a {

    /* renamed from: a */
    public static final C2596a f6117a = new C2596a();

    /* renamed from: com.android.tool.util.util.a$a */
    /* loaded from: classes.dex */
    public class C2596a implements Comparator<ResultsBean> {
        @Override // java.util.Comparator
        public final int compare(ResultsBean resultsBean, ResultsBean resultsBean2) {
            ResultsBean resultsBean3 = resultsBean;
            ResultsBean resultsBean4 = resultsBean2;
            if (resultsBean3.getMs() != null && resultsBean4.getMs() != null) {
                return resultsBean3.getMs().compareTo(resultsBean4.getMs());
            }
            if (resultsBean3.getMs() == null) {
                return 1;
            }
            return -1;
        }
    }
}
