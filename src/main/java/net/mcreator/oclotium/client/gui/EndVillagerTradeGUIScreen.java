package net.mcreator.oclotium.client.gui;

public class EndVillagerTradeGUIScreen extends AbstractContainerScreen<EndVillagerTradeGUIMenu> {

	private final static HashMap<String, Object> guistate = EndVillagerTradeGUIMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	Button button_trade;

	public EndVillagerTradeGUIScreen(EndVillagerTradeGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 192;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("niewiem:textures/screens/end_villager_trade_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);

		super.render(guiGraphics, mouseX, mouseY, partialTicks);

		this.renderTooltip(guiGraphics, mouseX, mouseY);

	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}

		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.niewiem.end_villager_trade_gui.label_1_emerald_3_end_flowers"), 32, 2, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.niewiem.end_villager_trade_gui.label_1_enderiorite_2_emeralds"), 32, 37, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();

		button_trade = Button.builder(Component.translatable("gui.niewiem.end_villager_trade_gui.button_trade"), e -> {
			if (true) {
				NiewiemMod.PACKET_HANDLER.sendToServer(new EndVillagerTradeGUIButtonMessage(0, x, y, z));
				EndVillagerTradeGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 70, this.topPos + 62, 51, 20).build();

		guistate.put("button:button_trade", button_trade);
		this.addRenderableWidget(button_trade);

	}

}
