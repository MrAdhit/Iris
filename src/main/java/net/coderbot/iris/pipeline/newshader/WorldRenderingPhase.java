package net.coderbot.iris.pipeline.newshader;

public enum WorldRenderingPhase {
	SKY,
	TERRAIN,
	ENTITIES,
	TRANSLUCENT_TERRAIN,
	TRANSLUCENT_ENTITIES,
	CLOUDS,
	WEATHER,
	OTHER,
	NOT_RENDERING_WORLD
}