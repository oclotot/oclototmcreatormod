
package net.mcreator.oclotium.client.particle;

@OnlyIn(Dist.CLIENT)
public class GunshotParticle extends TextureSheetParticle {
	public static GunshotParticleProvider provider(SpriteSet spriteSet) {
		return new GunshotParticleProvider(spriteSet);
	}

	public static class GunshotParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public GunshotParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
			return new GunshotParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

	private final SpriteSet spriteSet;

	protected GunshotParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;
		this.setSize(0.2f, 0.2f);
		this.lifetime = 7;
		this.gravity = 1f;
		this.hasPhysics = true;
		this.xd = vx * 0.2;
		this.yd = vy * 0.2;
		this.zd = vz * 0.2;
		this.pickSprite(spriteSet);
	}

	@Override
	public int getLightColor(float partialTick) {
		return 15728880;
	}

	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.PARTICLE_SHEET_LIT;
	}

	@Override
	public void tick() {
		super.tick();
	}
}