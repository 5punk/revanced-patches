package app.revanced.patches.ifunny.misc.pro

import app.revanced.patcher.fingerprint

internal val checkProFingerprint = fingerprint {
    custom { method, classDef ->
        classDef.endsWith("rest/content/User;") && method.name == "isUserPremium"
    }
}
