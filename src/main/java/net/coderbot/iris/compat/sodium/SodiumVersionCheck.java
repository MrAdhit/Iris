package net.coderbot.iris.compat.sodium;

import com.google.common.collect.ImmutableList;

public class SodiumVersionCheck {
	// The allowed versions of Sodium for use with Iris
	private static final ImmutableList<AllowedSodiumVersion> ALLOWED_SODIUM_VERSIONS = ImmutableList.of(
			// Sodium 1.18.1 version with proper fog, actions build
			AllowedSodiumVersion.exact("0.4.0-alpha5+build.816"),

			// Sodium 1.18.1 version with proper fog found on our discord
			AllowedSodiumVersion.exact("0.4.0-alpha5+rev.63aafcd"),

			// Custom Sodium 1.18.1 version used in Universe with FREX Flawless Frames support (needed for ReplayMod render exporting with sodium)
			AllowedSodiumVersion.exact("0.4.0-alpha5+rev.d3a2a28")
	);

	public static boolean isAllowedVersion(String sodiumVersion) {
		for (AllowedSodiumVersion allowed : ALLOWED_SODIUM_VERSIONS) {
			if (allowed.matches(sodiumVersion)) {
				return true;
			}
		}

		return false;
	}
}
