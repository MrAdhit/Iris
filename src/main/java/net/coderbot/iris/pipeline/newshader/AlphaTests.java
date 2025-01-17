package net.coderbot.iris.pipeline.newshader;

import net.coderbot.iris.gl.blending.AlphaTest;
import net.coderbot.iris.gl.blending.AlphaTestFunction;

public class AlphaTests {
	public static final AlphaTest OFF = AlphaTest.ALWAYS;
	public static final AlphaTest NON_ZERO_ALPHA = new AlphaTest(AlphaTestFunction.GREATER, 0.0001F);
	public static final AlphaTest ONE_TENTH_ALPHA = new AlphaTest(AlphaTestFunction.GREATER, 0.1F);
}
