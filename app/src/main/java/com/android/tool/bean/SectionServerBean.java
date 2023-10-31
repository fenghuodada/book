package com.android.tool.bean;

import androidx.core.p003os.C0740h;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public class SectionServerBean {
    public static Comparator<SectionServerBean> comparator = new Comparator<SectionServerBean>() { // from class: com.android.tool.bean.SectionServerBean.1
        @Override // java.util.Comparator
        public int compare(SectionServerBean sectionServerBean, SectionServerBean sectionServerBean2) {
            return sectionServerBean.getOrder().compareTo(sectionServerBean2.getOrder());
        }
    };

    /* renamed from: id */
    private String f6044id;
    private String order;
    private String photoUrl;
    private List<ResultsBean> resultsBeanList;
    private String title;

    public SectionServerBean(String str, String str2, String str3, String str4, List<ResultsBean> list) {
        this.title = str;
        this.f6044id = str2;
        this.photoUrl = str3;
        this.order = str4;
        this.resultsBeanList = list;
    }

    public SectionServerBean(String str, String str2, String str3, List<ResultsBean> list) {
        this.title = str;
        this.f6044id = str2;
        this.photoUrl = str3;
        this.resultsBeanList = list;
    }

    public String getId() {
        return this.f6044id;
    }

    public String getOrder() {
        return this.order;
    }

    public String getPhotoUrl() {
        return this.photoUrl;
    }

    public List<ResultsBean> getResultsBeanList() {
        return this.resultsBeanList;
    }

    public String getTitle() {
        return this.title;
    }

    public void setId(String str) {
        this.f6044id = str;
    }

    public void setOrder(String str) {
        this.order = str;
    }

    public void setPhotoUrl(String str) {
        this.photoUrl = str;
    }

    public void setResultsBeanList(List<ResultsBean> list) {
        this.resultsBeanList = list;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SectionServerBean{title='");
        sb.append(this.title);
        sb.append("', id='");
        sb.append(this.f6044id);
        sb.append("', photoUrl='");
        sb.append(this.photoUrl);
        sb.append("', order=");
        return C0740h.m11848b(sb, this.order, '}');
    }
}
