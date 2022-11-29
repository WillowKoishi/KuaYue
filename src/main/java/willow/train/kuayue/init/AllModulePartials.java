package willow.train.kuayue.init;

import java.util.EnumMap;
import java.util.Map;

import com.jozufozu.flywheel.core.PartialModel;
import com.simibubi.create.content.contraptions.fluids.FluidTransportBehaviour;

import net.minecraft.core.Direction;
import net.minecraft.world.item.DyeColor;
import willow.train.kuayue.Main;

public class AllModulePartials {
    public static final PartialModel
    DF11_FRONT_BLOCK = block("df11g/df11g_front_module");


    public static final Map<FluidTransportBehaviour.AttachmentTypes.ComponentPartials, Map<Direction, PartialModel>> PIPE_ATTACHMENTS =
            new EnumMap<>(FluidTransportBehaviour.AttachmentTypes.ComponentPartials.class);

    public static final Map<Direction, PartialModel> METAL_GIRDER_BRACKETS = new EnumMap<>(Direction.class);
    public static final Map<DyeColor, PartialModel> TOOLBOX_LIDS = new EnumMap<>(DyeColor.class);

//    static {
//        for (FluidTransportBehaviour.AttachmentTypes.ComponentPartials type : FluidTransportBehaviour.AttachmentTypes.ComponentPartials.values()) {
//            Map<Direction, PartialModel> map = new HashMap<>();
//            for (Direction d : Iterate.directions) {
//                String asId = Lang.asId(type.name());
//                map.put(d, block("fluid_pipe/" + asId + "/" + Lang.asId(d.getSerializedName())));
//            }
//            PIPE_ATTACHMENTS.put(type, map);
//        }
//        for (DyeColor color : DyeColor.values())
//            TOOLBOX_LIDS.put(color, block("toolbox/lid/" + Lang.asId(color.name())));
//        for (Direction d : Iterate.horizontalDirections)
//            METAL_GIRDER_BRACKETS.put(d, block("metal_girder/bracket_" + Lang.asId(d.name())));
//    }

    private static PartialModel block(String path) {

        return new PartialModel(Main.asResource("block/" + path));
    }

    private static PartialModel entity(String path) {
        return new PartialModel(Main.asResource("entity/" + path));
    }
    public static void init() {
        // init static fields
    }
}
