package app.revanced.patches.ifunny.misc.noads

import app.revanced.patcher.fingerprint


// yk.b
// public boolean b() {
//    boolean a12 = this.adsCriterionApi.a();
//    if (this.isAdsDisabledOnStart == null) {
//        this.isAdsDisabledOnStart = Boolean.valueOf(a12);
//    }
//    return a12;
// }


internal val disableAdsFingerprint = fingerprint {
    custom { method, classDef ->
        classDef.endsWith("Lyk/c;") && method.name == "b"
    }
}
