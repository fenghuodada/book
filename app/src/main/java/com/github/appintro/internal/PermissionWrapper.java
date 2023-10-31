package com.github.appintro.internal;

import java.io.Serializable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J2\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020\u0006H\u0016J\t\u0010 \u001a\u00020\u0004HÖ\u0001R\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006!"}, m508d2 = {"Lcom/github/appintro/internal/PermissionWrapper;", "Ljava/io/Serializable;", "permissions", "", "", "position", "", "required", "", "([Ljava/lang/String;IZ)V", "getPermissions", "()[Ljava/lang/String;", "setPermissions", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "getPosition", "()I", "setPosition", "(I)V", "getRequired", "()Z", "setRequired", "(Z)V", "component1", "component2", "component3", "copy", "([Ljava/lang/String;IZ)Lcom/github/appintro/internal/PermissionWrapper;", "equals", "other", "", "hashCode", "toString", "appintro_release"}, m507k = 1, m506mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class PermissionWrapper implements Serializable {
    @NotNull
    private String[] permissions;
    private int position;
    private boolean required;

    public PermissionWrapper(@NotNull String[] permissions, int i, boolean z) {
        C10843j.m430f(permissions, "permissions");
        this.permissions = permissions;
        this.position = i;
        this.required = z;
    }

    public /* synthetic */ PermissionWrapper(String[] strArr, int i, boolean z, int i2, C10839f c10839f) {
        this(strArr, i, (i2 & 4) != 0 ? true : z);
    }

    public static /* synthetic */ PermissionWrapper copy$default(PermissionWrapper permissionWrapper, String[] strArr, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            strArr = permissionWrapper.permissions;
        }
        if ((i2 & 2) != 0) {
            i = permissionWrapper.position;
        }
        if ((i2 & 4) != 0) {
            z = permissionWrapper.required;
        }
        return permissionWrapper.copy(strArr, i, z);
    }

    @NotNull
    public final String[] component1() {
        return this.permissions;
    }

    public final int component2() {
        return this.position;
    }

    public final boolean component3() {
        return this.required;
    }

    @NotNull
    public final PermissionWrapper copy(@NotNull String[] permissions, int i, boolean z) {
        C10843j.m430f(permissions, "permissions");
        return new PermissionWrapper(permissions, i, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C10843j.m435a(PermissionWrapper.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            PermissionWrapper permissionWrapper = (PermissionWrapper) obj;
            return Arrays.equals(this.permissions, permissionWrapper.permissions) && this.position == permissionWrapper.position && this.required == permissionWrapper.required;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.github.appintro.internal.PermissionWrapper");
    }

    @NotNull
    public final String[] getPermissions() {
        return this.permissions;
    }

    public final int getPosition() {
        return this.position;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public int hashCode() {
        return Boolean.valueOf(this.required).hashCode() + (((Arrays.hashCode(this.permissions) * 31) + this.position) * 31);
    }

    public final void setPermissions(@NotNull String[] strArr) {
        C10843j.m430f(strArr, "<set-?>");
        this.permissions = strArr;
    }

    public final void setPosition(int i) {
        this.position = i;
    }

    public final void setRequired(boolean z) {
        this.required = z;
    }

    @NotNull
    public String toString() {
        return "PermissionWrapper(permissions=" + Arrays.toString(this.permissions) + ", position=" + this.position + ", required=" + this.required + ")";
    }
}
