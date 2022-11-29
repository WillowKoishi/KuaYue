package willow.train.kuayue.renderer;

import com.google.common.collect.ImmutableMap;
import com.mojang.blaze3d.platform.NativeImage;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Vector3f;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.client.resources.model.Material;
import net.minecraft.util.FormattedCharSequence;
import net.minecraft.util.Mth;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

import java.util.List;
import java.util.Map;

public class TrainPanelSignRenderer extends SignRenderer {

    private static final int LINE_HEIGHT = 10;
    //private static final String STICK = "stick";
    private static final int BLACK_TEXT_OUTLINE_COLOR = -988212;
    private static final int OUTLINE_RENDER_DISTANCE = Mth.square(16);
    private final Map<WoodType, SignModel> signModels;
    private final Font font;

    public TrainPanelSignRenderer(BlockEntityRendererProvider.Context pContext) {
        super(pContext);
        this.signModels = WoodType.values().collect(ImmutableMap.toImmutableMap((p_173645_) -> {
            return p_173645_;
        }, (p_173651_) -> {
            return new SignRenderer.SignModel(pContext.bakeLayer(ModelLayers.createSignModelName(p_173651_)));
        }));
        this.font = pContext.getFont();
    }

    @Override
    public void render(SignBlockEntity pBlockEntity, float pPartialTick, PoseStack pPoseStack, MultiBufferSource pBufferSource, int pPackedLight, int pPackedOverlay) {
        BlockState blockstate = pBlockEntity.getBlockState();
        pPoseStack.pushPose();

        WoodType woodtype = getWoodType(blockstate.getBlock());
        SignRenderer.SignModel signrenderer$signmodel = this.signModels.get(woodtype);
        if (blockstate.getBlock() instanceof StandingSignBlock) {
           pPoseStack.translate(0.5D, 0.5D, 0.5D);
           float f1 = -((float)(blockstate.getValue(StandingSignBlock.ROTATION) * 360) / 16.0F);
           pPoseStack.mulPose(Vector3f.YP.rotationDegrees(f1));
           pPoseStack.translate(0.0D, -0.3125D, -0.4375D);
            signrenderer$signmodel.stick.visible = false;
       } else {
             pPoseStack.translate(0.5D, 0.5D, 0.5D);
            float f4 = -blockstate.getValue(WallSignBlock.FACING).toYRot();
            pPoseStack.mulPose(Vector3f.YP.rotationDegrees(f4));
            pPoseStack.translate(0.0D, -0.3125D, -0.4375D);
            signrenderer$signmodel.stick.visible = false;
      }

        pPoseStack.pushPose();
         pPoseStack.scale(0.6666667F, -0.6666667F, -0.6666667F);
        pPoseStack.scale(1, -1, -1);
        Material material = Sheets.getSignMaterial(woodtype);
        VertexConsumer vertexconsumer = material.buffer(pBufferSource, signrenderer$signmodel::renderType);
        signrenderer$signmodel.root.render(pPoseStack, vertexconsumer, pPackedLight, pPackedOverlay);
        pPoseStack.popPose();
        //float f2 = 0.010416667F;
        pPoseStack.translate(0.0D, (double)0.33333334F, (double)0.046666667F);
        pPoseStack.scale(0.010416667F, -0.010416667F, 0.010416667F);
        int i = getDarkColor(pBlockEntity);
        //int j = 20;
        FormattedCharSequence[] aformattedcharsequence = pBlockEntity.getRenderMessages(Minecraft.getInstance().isTextFilteringEnabled(), (p_173653_) -> {
            List<FormattedCharSequence> list = this.font.split(p_173653_, 81);
            return list.isEmpty() ? FormattedCharSequence.EMPTY : list.get(0);
        });
        int k;
        boolean flag;
        int l;
//        if (pBlockEntity.hasGlowingText()) {
//            k = pBlockEntity.getColor().getTextColor();
//            flag = isOutlineVisible(pBlockEntity, k);
//            l = 15728880;
//        } else {
            k = i;
            //flag = false;
            l = pPackedLight;
//        }

        for(int i1 = 0; i1 < 4; ++i1) {
            FormattedCharSequence formattedcharsequence = aformattedcharsequence[i1];
            float f3 = (float)(-this.font.width(formattedcharsequence) / 2);
            this.font.drawInBatch(formattedcharsequence, f3, (float)(i1 * 10 - 20), k, false, pPoseStack.last().pose(), pBufferSource, false, 0, l);
        }

        pPoseStack.popPose();
    }

    public static LayerDefinition createSignLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        partdefinition.addOrReplaceChild("sign", CubeListBuilder.create().texOffs(0, 0).addBox(0, 0, 0F, 16.0F, 16.0F, 1.0F), PartPose.ZERO);
        //partdefinition.addOrReplaceChild("ss1223", CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), PartPose.ZERO);
        //partdefinition.addOrReplaceChild("stick", CubeListBuilder.create().texOffs(0, 14).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), PartPose.ZERO);
        return LayerDefinition.create(meshdefinition, 64, 32);
    }

    private static int getDarkColor(SignBlockEntity pBlockEntity) {
        int i = pBlockEntity.getColor().getTextColor();
        double d0 = 0.8D;
        int j = (int)((double) NativeImage.getR(i) * d0);
        int k = (int)((double)NativeImage.getG(i) * d0);
        int l = (int)((double)NativeImage.getB(i) * d0);
        return i == DyeColor.BLACK.getTextColor() && pBlockEntity.hasGlowingText() ? -988212 : NativeImage.combine(0, l, k, j);
    }


}
