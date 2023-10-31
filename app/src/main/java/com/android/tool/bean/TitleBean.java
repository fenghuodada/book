package com.android.tool.bean;

import com.google.gson.C8686j;
import com.google.gson.reflect.C8696a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TitleBean {
    private List<ResultsBean> results;

    /* loaded from: classes.dex */
    public static class ResultsBean {
        private Boolean alaweays;
        private String appVersion;
        private Boolean changeInsert;
        private String cnAdTipsText;
        private String cnUpdateText;
        private String cntitle;
        private String enAdTipsText;
        private String enUpdateText;
        private String englishtitle;
        private String gameId;
        private Boolean ignoreTime;
        private Boolean includeApp;
        private Boolean isForceUpdate;
        private Boolean isNeedAD;
        private Boolean stopRequest;
        private Integer titleversion;
        private Integer versioncode;

        public static List<ResultsBean> arrayResultsBeanFromData(String str) {
            return (List) new C8686j().m3234d(str, new C8696a<ArrayList<ResultsBean>>() { // from class: com.android.tool.bean.TitleBean.ResultsBean.1
            }.getType());
        }

        public static List<ResultsBean> arrayResultsBeanFromData(String str, String str2) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                return (List) new C8686j().m3234d(jSONObject.getString(str), new C8696a<ArrayList<ResultsBean>>() { // from class: com.android.tool.bean.TitleBean.ResultsBean.2
                }.getType());
            } catch (JSONException e) {
                e.printStackTrace();
                return new ArrayList();
            }
        }

        public static ResultsBean objectFromData(String str) {
            return (ResultsBean) new C8686j().m3235c(ResultsBean.class, str);
        }

        public static ResultsBean objectFromData(String str, String str2) {
            try {
                return (ResultsBean) new C8686j().m3235c(ResultsBean.class, new JSONObject(str).getString(str));
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        }

        public Boolean getAlaweays() {
            return this.alaweays;
        }

        public String getAppVersion() {
            return this.appVersion;
        }

        public Boolean getChangeInsert() {
            return this.changeInsert;
        }

        public String getCnAdTipsText() {
            return this.cnAdTipsText;
        }

        public String getCnUpdateText() {
            return this.cnUpdateText;
        }

        public String getCntitle() {
            return this.cntitle;
        }

        public String getEnAdTipsText() {
            return this.enAdTipsText;
        }

        public String getEnUpdateText() {
            return this.enUpdateText;
        }

        public String getEnglishtitle() {
            return this.englishtitle;
        }

        public Boolean getForceUpdate() {
            return this.isForceUpdate;
        }

        public String getGameId() {
            return this.gameId;
        }

        public Boolean getIgnoreTime() {
            return this.ignoreTime;
        }

        public Boolean getIncludeApp() {
            return this.includeApp;
        }

        public Boolean getIsForceUpdate() {
            return this.isForceUpdate;
        }

        public Boolean getIsNeedAD() {
            return this.isNeedAD;
        }

        public Boolean getNeedAD() {
            return this.isNeedAD;
        }

        public Boolean getStopRequest() {
            return this.stopRequest;
        }

        public Integer getTitleversion() {
            return this.titleversion;
        }

        public Integer getVersioncode() {
            return this.versioncode;
        }

        public void setAlaweays(Boolean bool) {
            this.alaweays = bool;
        }

        public void setAppVersion(String str) {
            this.appVersion = str;
        }

        public void setChangeInsert(Boolean bool) {
            this.changeInsert = bool;
        }

        public void setCnAdTipsText(String str) {
            this.cnAdTipsText = str;
        }

        public void setCnUpdateText(String str) {
            this.cnUpdateText = str;
        }

        public void setCntitle(String str) {
            this.cntitle = str;
        }

        public void setEnAdTipsText(String str) {
            this.enAdTipsText = str;
        }

        public void setEnUpdateText(String str) {
            this.enUpdateText = str;
        }

        public void setEnglishtitle(String str) {
            this.englishtitle = str;
        }

        public void setForceUpdate(Boolean bool) {
            this.isForceUpdate = bool;
        }

        public void setGameId(String str) {
            this.gameId = str;
        }

        public void setIgnoreTime(Boolean bool) {
            this.ignoreTime = bool;
        }

        public void setIncludeApp(Boolean bool) {
            this.includeApp = bool;
        }

        public void setIsForceUpdate(Boolean bool) {
            this.isForceUpdate = bool;
        }

        public void setIsNeedAD(Boolean bool) {
            this.isNeedAD = bool;
        }

        public void setNeedAD(Boolean bool) {
            this.isNeedAD = bool;
        }

        public void setStopRequest(Boolean bool) {
            this.stopRequest = bool;
        }

        public void setTitleversion(Integer num) {
            this.titleversion = num;
        }

        public void setVersioncode(Integer num) {
            this.versioncode = num;
        }
    }

    public static List<TitleBean> arrayTitleBeanFromData(String str) {
        return (List) new C8686j().m3234d(str, new C8696a<ArrayList<TitleBean>>() { // from class: com.android.tool.bean.TitleBean.1
        }.getType());
    }

    public static List<TitleBean> arrayTitleBeanFromData(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return (List) new C8686j().m3234d(jSONObject.getString(str), new C8696a<ArrayList<TitleBean>>() { // from class: com.android.tool.bean.TitleBean.2
            }.getType());
        } catch (JSONException e) {
            e.printStackTrace();
            return new ArrayList();
        }
    }

    public static TitleBean objectFromData(String str) {
        return (TitleBean) new C8686j().m3235c(TitleBean.class, str);
    }

    public static TitleBean objectFromData(String str, String str2) {
        try {
            return (TitleBean) new C8686j().m3235c(TitleBean.class, new JSONObject(str).getString(str));
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<ResultsBean> getResults() {
        return this.results;
    }

    public void setResults(List<ResultsBean> list) {
        this.results = list;
    }
}
