package com.unity3d.services.core.request.metrics;

import java.util.Map;

/* renamed from: com.unity3d.services.core.request.metrics.j */
/* loaded from: classes3.dex */
public class C9606j {
    /* renamed from: a */
    public static C9597d m1830a() {
        return new C9597d("native_emergency_switch_off", null, null);
    }

    /* renamed from: a */
    public static C9597d m1829a(Long l) {
        return new C9597d("native_device_info_collection_latency", l, null);
    }

    /* renamed from: a */
    public static C9597d m1828a(Long l, Map<String, String> map) {
        return new C9597d("native_initialization_time_failure", l, map);
    }

    /* renamed from: a */
    public static C9597d m1827a(Map<String, String> map) {
        return new C9597d("native_async_token_available", null, map);
    }

    /* renamed from: b */
    public static C9597d m1826b() {
        return new C9597d("native_initialization_started", null, null);
    }

    /* renamed from: b */
    public static C9597d m1825b(Long l) {
        return new C9597d("native_device_info_compression_latency", l, null);
    }

    /* renamed from: b */
    public static C9597d m1824b(Long l, Map<String, String> map) {
        return new C9597d("native_initialization_time_success", l, map);
    }

    /* renamed from: b */
    public static C9597d m1823b(Map<String, String> map) {
        return new C9597d("native_async_token_null", null, map);
    }

    /* renamed from: c */
    public static C9597d m1822c() {
        return new C9597d("native_missing_game_session_id", null, null);
    }

    /* renamed from: c */
    public static C9597d m1821c(Long l) {
        return new C9597d("native_privacy_resolution_request_latency_failure", l, null);
    }

    /* renamed from: c */
    public static C9597d m1820c(Long l, Map<String, String> map) {
        return new C9597d("native_token_availability_latency_config", l, map);
    }

    /* renamed from: c */
    public static C9597d m1819c(Map<String, String> map) {
        return new C9597d("native_generated_token_available", null, map);
    }

    /* renamed from: d */
    public static C9597d m1818d() {
        return new C9597d("native_missing_state_id", null, null);
    }

    /* renamed from: d */
    public static C9597d m1817d(Long l) {
        return new C9597d("native_privacy_resolution_request_latency_success", l, null);
    }

    /* renamed from: d */
    public static C9597d m1816d(Long l, Map<String, String> map) {
        return new C9597d("native_token_availability_latency_webview", l, map);
    }

    /* renamed from: d */
    public static C9597d m1815d(Map<String, String> map) {
        return new C9597d("native_generated_token_null", null, map);
    }

    /* renamed from: e */
    public static C9597d m1814e() {
        return new C9597d("native_missing_token", null, null);
    }

    /* renamed from: e */
    public static C9597d m1813e(Long l, Map<String, String> map) {
        return new C9597d("native_token_resolution_request_latency", l, map);
    }
}
