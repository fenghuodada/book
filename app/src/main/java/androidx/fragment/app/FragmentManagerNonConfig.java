package androidx.fragment.app;

import androidx.annotation.Nullable;
import androidx.lifecycle.C1478j0;
import java.util.Collection;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public class FragmentManagerNonConfig {
    @Nullable
    private final Map<String, FragmentManagerNonConfig> mChildNonConfigs;
    @Nullable
    private final Collection<Fragment> mFragments;
    @Nullable
    private final Map<String, C1478j0> mViewModelStores;

    public FragmentManagerNonConfig(@Nullable Collection<Fragment> collection, @Nullable Map<String, FragmentManagerNonConfig> map, @Nullable Map<String, C1478j0> map2) {
        this.mFragments = collection;
        this.mChildNonConfigs = map;
        this.mViewModelStores = map2;
    }

    @Nullable
    public Map<String, FragmentManagerNonConfig> getChildNonConfigs() {
        return this.mChildNonConfigs;
    }

    @Nullable
    public Collection<Fragment> getFragments() {
        return this.mFragments;
    }

    @Nullable
    public Map<String, C1478j0> getViewModelStores() {
        return this.mViewModelStores;
    }

    public boolean isRetaining(Fragment fragment) {
        Collection<Fragment> collection = this.mFragments;
        if (collection == null) {
            return false;
        }
        return collection.contains(fragment);
    }
}
