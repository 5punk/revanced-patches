package app.revanced.patches.ifunny.misc.savevideos

import app.revanced.patcher.extensions.InstructionExtensions.replaceInstructions
import app.revanced.patcher.patch.bytecodePatch

@Suppress("unused")
val unlockSavePatch = bytecodePatch(
    name = "Save Videos",
    description = "Unlocks ability to save iFunny videos"
) {
    compatibleWith("mobi.ifunny")

    execute {
        checkSaveFingerprint.method.replaceInstructions(
            0,
            """
                 const/4 v0, 0x1
                 return v0
            """,
        )
    }
}
