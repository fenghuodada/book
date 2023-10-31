package com.github.appintro;

import kotlin.Metadata;

@Metadata(m509d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0004H&¨\u0006\u0007"}, m508d2 = {"Lcom/github/appintro/AppIntroViewPagerListener;", "", "", "onCanRequestNextPage", "Lkotlin/p;", "onIllegallyRequestedNextPage", "onUserRequestedPermissionsDialog", "appintro_release"}, m507k = 1, m506mv = {1, 4, 1})
/* loaded from: classes.dex */
public interface AppIntroViewPagerListener {
    boolean onCanRequestNextPage();

    void onIllegallyRequestedNextPage();

    void onUserRequestedPermissionsDialog();
}
