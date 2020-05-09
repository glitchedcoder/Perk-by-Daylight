package dev.glitchedcode.pbd.dbd;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

import static dev.glitchedcode.pbd.dbd.Killer.*;

public enum Addon implements Icon {

    AWARDWINNING_CHILI("awardwinningChili", "Cannibal", CANNIBAL),
    CHILI("chili", "Cannibal", CANNIBAL),
    KNIFE_SCRATCHES("knifeScratches", "Cannibal", CANNIBAL),
    THE_BEASTS_MARK("theBeastsMark", "Cannibal", CANNIBAL),
    THE_GREASE("theGrease", "Cannibal", CANNIBAL),
    BLONDE_HAIR("blondeHair", "DLC2", SHAPE),
    BOYFRIENDS_MEMO("boyfriendsMemo", "DLC2", SHAPE),
    DEAD_RABBIT("deadRabbit", "DLC2", SHAPE),
    GLASS_FRAGMENT("glassFragment", "DLC2", SHAPE),
    HAIR_BOW("hairBow", "DLC2", SHAPE),
    HAIR_BRUSH("hairBrush", "DLC2", SHAPE),
    JEWELRY("jewelry", "DLC2", SHAPE),
    JEWELRY_BOX("jewelryBox", "DLC2", SHAPE),
    J_MYERS_MEMORIAL("jMyersMemorial", "DLC2", SHAPE),
    JUDITHS_JOURNAL("judithsJournal", "DLC2", SHAPE),
    JUDITHS_TOMBSTONE("judithsTombstone", "DLC2", SHAPE),
    LOCK_OF_HAIR("lockOfHair", "DLC2", SHAPE),
    MEMORIAL_FLOWER("memorialFlower", "DLC2", SHAPE),
    MIRROR_SHARD("mirrorShard", "DLC2", SHAPE),
    REFLECTIVE_FRAGMENT("reflectiveFragment", "DLC2", SHAPE),
    SCRATCHED_MIRROR("scratchedMirror", "DLC2", SHAPE),
    TACKY_EARRINGS("tackyEarrings", "DLC2", SHAPE),
    TOMBSTONE_PIECE("tombstonePiece", "DLC2", SHAPE),
    TUFT_OF_HAIR("tuftOfHair", "DLC2", SHAPE),
    VANITY_MIRROR("vanityMirror", "DLC2", SHAPE),
    BLOODIED_MUD("bloodiedMud", "DLC3", HAG),
    BLOODIED_WATER("bloodiedWater", "DLC3", HAG),
    BOG_WATER("bogWater", "DLC3", HAG),
    CRACKED_TURTLE_EGG("crackedTurtleEgg", "DLC3", HAG),
    CYPRESS_NECKLET("cypressNecklet", "DLC3", HAG),
    DEAD_FLY_MUD("deadFlyMud", "DLC3", HAG),
    DISFIGURED_EAR("disfiguredEar", "DLC3", HAG),
    DRAGONFLY_WINGS("dragonflyWings", "DLC3", HAG),
    DRIED_CICADA("driedCicada", "DLC3", HAG),
    GRANMAS_HEART("granmasHeart", "DLC3", HAG),
    HALF_EGGSHELL("halfEggshell", "DLC3", HAG),
    MINT_RAG("mintRag", "DLC3", HAG),
    POWDERED_EGGSHELL("powderedEggshell", "DLC3", HAG),
    PUSSY_WILLOW_CATKINS("pussyWillowCatkins", "DLC3", HAG),
    ROPE_NECKLET("ropeNecklet", "DLC3", HAG),
    RUSTY_SHACKLES("rustyShackles", "DLC3", HAG),
    SCARRED_HAND("scarredHand", "DLC3", HAG),
    SWAMP_ORCHID_NECKLET("swampOrchidNecklet", "DLC3", HAG),
    WATERLOGGED_SHOE("waterloggedShoe", "DLC3", HAG),
    WILLOW_WREATH("willowWreath", "DLC3", HAG),
    CALM_CARTERS_NOTES("calmCartersNotes", "DLC4", DOCTOR),
    CALM_CLASS_I("calmClassI", "DLC4", DOCTOR),
    CALM_CLASS_I_I("calmClassII", "DLC4", DOCTOR),
    DICIPLINE_CARTERS_NOTES("diciplineCartersNotes", "DLC4", DOCTOR),
    DICIPLINE_CLASS_I_I("diciplineClassII", "DLC4", DOCTOR),
    DICIPLINE_CLASS_I_I_I("diciplineClassIII", "DLC4", DOCTOR),
    HIGH_STIMULUS_ELECTRODE("highStimulusElectrode", "DLC4", DOCTOR),
    INTERVIEW_TAPE("interviewTape", "DLC4", DOCTOR),
    IRIDESCENT_KING("iridescentKing", "DLC4", DOCTOR),
    IRIDESCENT_QUEEN("iridescentQueen", "DLC4", DOCTOR),
    MAPLE_KNIGHT("mapleKnight", "DLC4", DOCTOR),
    MOLDY_ELECTRODE("moldyElectrode", "DLC4", DOCTOR),
    ORDER_CARTERS_NOTES("orderCartersNotes", "DLC4", DOCTOR),
    ORDER_CLASS_I("orderClassI", "DLC4", DOCTOR),
    ORDER_CLASS_I_I("orderClassII", "DLC4", DOCTOR),
    POLISHED_ELECTRODE("polishedElectrode", "DLC4", DOCTOR),
    RESTRAINT_CARTERS_NOTES("restraintCartersNotes", "DLC4", DOCTOR),
    RESTRAINT_CLASS_I_I("restraintClassII", "DLC4", DOCTOR),
    RESTRAINT_CLASS_I_I_I("restraintClassIII", "DLC4", DOCTOR),
    SCRAPPED_TAPE("scrappedTape", "DLC4", DOCTOR),
    AMANITA_TOXIN("amanitaToxin", "DLC5", HUNTRESS),
    BANDAGED_HAFT("bandagedHaft", "DLC5", HUNTRESS),
    BEGRIMED_HEAD("begrimedHead", "DLC5", HUNTRESS),
    BERUS_TOXIN("berusToxin", "DLC5", HUNTRESS),
    COARSE_STONE("coarseStone", "DLC5", HUNTRESS),
    DEERSKIN_GLOVES("deerskinGloves", "DLC5", HUNTRESS),
    FINE_STONE("fineStone", "DLC5", HUNTRESS),
    FLOWER_BABUSHKA("flowerBabushka", "DLC5", HUNTRESS),
    GLOWING_CONCOCTION("glowingConcoction", "DLC5", HUNTRESS),
    INFANTRY_BELT("infantryBelt", "DLC5", HUNTRESS),
    IRIDESCENT_HEAD("iridescentHead", "DLC5", HUNTRESS),
    LEATHER_LOOP("leatherLoop", "DLC5", HUNTRESS),
    MANNA_GRASS_BRAID("mannaGrassBraid", "DLC5", HUNTRESS),
    OAK_HAFT("oakHaft", "DLC5", HUNTRESS),
    PUNGENT_FIALE("pungentFiale", "DLC5", HUNTRESS),
    RUSTY_HEAD("rustyHead", "DLC5", HUNTRESS),
    SHINY_PIN("shinyPin", "DLC5", HUNTRESS),
    VENOMOUS_CONCOCTION("venomousConcoction", "DLC5", HUNTRESS),
    YEW_SEED_BREW("yewSeedBrew", "DLC5", HUNTRESS),
    YEW_SEED_CONCOCTION("yewSeedConcoction", "DLC5", HUNTRESS),
    BLACK_BOX("blackBox", "England", NIGHTMARE),
    BLUE_DRESS("blueDress", "England", NIGHTMARE),
    CAT_BLOCK("catBlock", "England", NIGHTMARE),
    CLASS_PHOTO("classPhoto", "England", NIGHTMARE),
    GARDEN_RAKE("gardenRake", "England", NIGHTMARE),
    GREEN_DRESS("greenDress", "England", NIGHTMARE),
    JUMP_ROPE("jumpRope", "England", NIGHTMARE),
    KIDS_DRAWING("kidsDrawing", "England", NIGHTMARE),
    NANCYS_MASTERPIECE("nancysMasterpiece", "England", NIGHTMARE),
    NANCYS_SKETCH("nancysSketch", "England", NIGHTMARE),
    OUTDOOR_ROPE("outdoorRope", "England", NIGHTMARE),
    PAINT_THINNER("paintThinner", "England", NIGHTMARE),
    PILL_BOTTLE("pillBottle", "England", NIGHTMARE),
    PROTOTYPE_CLAW("prototypeClaw", "England", NIGHTMARE),
    RED_PAINT_BRUSH("redPaintBrush", "England", NIGHTMARE),
    SHEEP_BLOCK("sheepBlock", "England", NIGHTMARE),
    SWING_CHAINS("swingChains", "England", NIGHTMARE),
    UNICORN_BLOCK("unicornBlock", "England", NIGHTMARE),
    WOOL_SHIRT("woolShirt", "England", NIGHTMARE),
    Z_BLOCK("zBlock", "England", NIGHTMARE),
    AMANDAS_LETTER("amandasLetter", "Finland", PIG),
    AMANDAS_SECRET("amandasSecret", "Finland", PIG),
    BAG_OF_GEARS("bagOfGears", "Finland", PIG),
    COMBAT_STRAPS("combatStraps", "Finland", PIG),
    CRATE_OF_GEARS("crateOfGears", "Finland", PIG),
    FACE_MASK("faceMask", "Finland", PIG),
    INTERLOCKING_RAZOR("interlockingRazor", "Finland", PIG),
    JIGSAWS_ANNOTATED_PLAN("jigsawsAnnotatedPlan", "Finland", PIG),
    JIGSAWS_SKETCH("jigsawsSketch", "Finland", PIG),
    JOHNS_MEDICAL_FILE("johnsMedicalFile", "Finland", PIG),
    LAST_WILL("lastWill", "Finland", PIG),
    RAZER_WIRE("razerWire", "Finland", PIG),
    RULES_SET_N2("rulesSetN2", "Finland", PIG),
    RUSTY_ATTACHMENTS("rustyAttachments", "Finland", PIG),
    SHATTERED_SYRINGE("shatteredSyringe", "Finland", PIG),
    SLOW_RELEASE_TOXIN("slowReleaseToxin", "Finland", PIG),
    TAMPERED_TIMER("tamperedTimer", "Finland", PIG),
    UTILITY_BLADES("utilityBlades", "Finland", PIG),
    VIDEO_TAPE("videoTape", "Finland", PIG),
    WORKSHOP_GREASE("workshopGrease", "Finland", PIG),
    BOTTLE_OF_CHLOROFORM("bottleOfChloroform", "Guam", CLOWN),
    CHEAP_GIN_BOTTLE("cheapGinBottle", "Guam", CLOWN),
    CIGAR_BOX("cigarBox", "Guam", CLOWN),
    ETHER10("ether10", "Guam", CLOWN),
    ETHER15("ether15", "Guam", CLOWN),
    ETHER5("ether5", "Guam", CLOWN),
    FINGERLESS_PARADE_GLOVES("fingerlessParadeGloves", "Guam", CLOWN),
    FLASK_OF_BLEACH("flaskOfBleach", "Guam", CLOWN),
    GARISH_MAKEUP_KIT("garishMakeupKit", "Guam", CLOWN),
    KEROSENE_CAN("keroseneCan", "Guam", CLOWN),
    REDHEADS_PINKY_FINGER("redheadsPinkyFinger", "Guam", CLOWN),
    ROBIN_FEATHER("robinFeather", "Guam", CLOWN),
    SMELLY_INNER_SOLES("smellyInnerSoles", "Guam", CLOWN),
    SOLVENT_JUG("solventJug", "Guam", CLOWN),
    STARLING_FEATHER("starlingFeather", "Guam", CLOWN),
    STICKY_SODA_BOTTLE("stickySodaBottle", "Guam", CLOWN),
    SULFURIC_ACID_VIAL("sulfuricAcidVial", "Guam", CLOWN),
    TATTOOS_MIDDLE_FINGER("tattoosMiddleFinger", "Guam", CLOWN),
    THICK_CORK_STOPPER("thickCorkStopper", "Guam", CLOWN),
    VHS_PORN("vhsPorn", "Guam", CLOWN),
    BLOODY_HAIR_BROOCHI("bloodyHairBroochi", "Haiti", SPIRIT),
    DIRTY_UWABAKI("dirtyUwabaki", "Haiti", SPIRIT),
    DRIED_CHERRY_BLOSSOM("driedCherryBlossom", "Haiti", SPIRIT),
    FATHERS_GLASSES("fathersGlasses", "Haiti", SPIRIT),
    GIFTED_BAMBOO_COMB("giftedBambooComb", "Haiti", SPIRIT),
    JUNIPER_BONZAI("juniperBonzai", "Haiti", SPIRIT),
    KAIUN_TALISMAN("kaiunTalisman", "Haiti", SPIRIT),
    KATANA_TSUBA("katanaTsuba", "Haiti", SPIRIT),
    KATSUMORI_TALISMAN("katsumoriTalisman", "Haiti", SPIRIT),
    MOTHER_DAUGHTER_RING("motherDaughterRing", "Haiti", SPIRIT),
    MUDDY_SPORT_CAP("muddySportCap", "Haiti", SPIRIT),
    ORIGAMI_CRANE("origamiCrane", "Haiti", SPIRIT),
    PRAYERS_BEADS("prayersBeads", "Haiti", SPIRIT),
    RINS_BROKEN_WATCH("rinsBrokenWatch", "Haiti", SPIRIT),
    RUSTY_FLUTE("rustyFlute", "Haiti", SPIRIT),
    SHIAWASE_AMULET("ShiawaseAmulet", "Haiti", SPIRIT),
    WAKIZASHI_SAYA("wakizashiSaya", "Haiti", SPIRIT),
    WHITE_HAIR_RIBBON("whiteHairRibbon", "Haiti", SPIRIT),
    YAKUYOKE_AMULET("yakuyokeAmulet", "Haiti", SPIRIT),
    ZORI("zori", "Haiti", SPIRIT),
    ABDOMINAL_DRESSING("abdominalDressing"),
    ANXIOUS_GASP("anxiousGasp"),
    ATAXIC_RESPIRATION("ataxicRespiration"),
    BAD_MAN_KEEPSAKE("badManKeepsake"),
    BAD_MANS_LAST_BREATH("badMansLastBreath"),
    BANDAGES("bandages"),
    BATTERY("battery"),
    BEAD_CRYSTAL("beadCrystal"),
    BEAD_GLASS("beadGlass"),
    BLOOD_AMBER("bloodAmber"),
    BLOOD_KRA_FABAI("bloodKraFabai"),
    BLOOD_SHADOW_DANCE("bloodShadowDance"),
    BLOOD_SWIFT_HUNT("bloodSwiftHunt"),
    BLOOD_WINDSTORM("bloodWindstorm"),
    BLOODY_COIL("bloodyCoil"),
    BONE_CLAPPER("boneClapper"),
    BRAND_NEW_PART("brandNewPart"),
    BUTTERFLY_TAPE("butterflyTape"),
    CAMPBELLS_LAST_BREATH("campbellsLastBreath"),
    CARBURETOR_TUNING_GUIDE("carburetorTuningGuide"),
    CATATONIC_TREASURE("catatonicTreasure"),
    CHAINSAW_FILE("chainsawFile"),
    CHAINS_BLOODY("chainsBloody"),
    CHAINS_GRISLY("chainsGrisly"),
    CHAINS_RUSTED("chainsRusted"),
    CLEAN_RAG("cleanRag"),
    COILS_KIT4("coilsKit4"),
    COIL_SPRING("coilSpring"),
    COXCOMBED_CLAPPER("coxcombedClapper"),
    CUTTING_WIRE("cuttingWire"),
    DARK_CINCTURE("darkCincture"),
    DEATH_ENGRAVINGS("deathEngravings"),
    DEPTH_GAUGE_RAKE("depthGaugeRake"),
    DIAMOND_STONE("diamondStone"),
    DOOM_ENGRAVINGS("doomEngravings"),
    DULL_BRACELET("dullBracelet"),
    FASTENING_TOOLS("fasteningTools"),
    FOCUS_LENS("focusLens"),
    FRAGILE_WHEEZE("fragileWheeze"),
    GAUSE_ROLL("gauseRoll"),
    GEL_DRESSINGS("gelDressings"),
    GLOVES("gloves"),
    GRIP_WRENCH("gripWrench"),
    GUM("gum"),
    HEAVY_DUTY_BATTERY("heavyDutyBattery"),
    HEAVY_PANTING("heavyPanting"),
    HIGH_END_SAPPHIRE_LENS("highEndSapphireLens"),
    HOMEMADE_MUFFLER("homemadeMuffler"),
    HONING_STONE("honingStone"),
    INHALER("inhaler"),
    INSTRUCTIONS("instructions"),
    INTENSE_HALOGEN("intenseHalogen"),
    JENNERS_LAST_BREATH("jennersLastBreath"),
    KAVANAGHS_LAST_BREATH("kavanaghsLastBreath"),
    LEATHER_GRIP("leatherGrip"),
    LIGHT_CHASSIS("lightChassis"),
    LOGWOOD_DYE("logwoodDye"),
    LONG_GUIDE_BAR("longGuideBar"),
    LONG_LIFE_BATTERY("longLifeBattery"),
    MAP_ADDENDUM("mapAddendum"),
    MATCH_BOX("matchBox"),
    METAL_SAW("metalSaw"),
    METAL_SPOON("metalSpoon"),
    MILKY_GLASS("milkyGlass"),
    MUD_BAIKRA_KAEUG("mudBaikraKaeug"),
    MUD_BLINK("mudBlink"),
    MUD_SWIFT_HUNT("mudSwiftHunt"),
    MUD_WINDSTORM("mudWindstorm"),
    NEED_AND_THREAD("needAndThread"),
    ODD_BULB("oddBulb"),
    OILY_COIL("oilyCoil"),
    PADDED_JAWS("paddedJaws"),
    PLAID_FLANNEL("plaidFlannel"),
    POCKET_WATCH("pocketWatch"),
    POWER_BULB("powerBulb"),
    PRAYER_BEADS("prayerBeads"),
    PRAYER_ROPE("prayerRope"),
    PRIMER_BULB("primerBulb"),
    PROTECTIVE_GLOVES("protectiveGloves"),
    RETARDANT_JELLY("retardantJelly"),
    ROPE_BLACK("ropeBlack"),
    ROPE_RED("ropeRed"),
    ROPE_YELLOW("ropeYellow"),
    RUBBER_GRIP("rubberGrip"),
    RUSTED_JAWS("rustedJaws"),
    SCISSORS("scissors"),
    SCRAPS("scraps"),
    SCRATCHED_PEARL("scratchedPearl"),
    SECONDARY_COIL("secondaryCoil"),
    SELF_ADHERENT_WRAP("selfAdherentWrap"),
    SERRATED_JAWS("serratedJaws"),
    SETTING_TOOLS("settingTools"),
    SHOP_LUBRICANT("shopLubricant"),
    SOCKET_SWIVELS("socketSwivels"),
    SOOT_SHADOW_DANCE("sootShadowDance"),
    SOOT_THE_BEAST("sootTheBeast"),
    SOOT_THE_GHOST("sootTheGhost"),
    SOOT_THE_HOUND("sootTheHound"),
    SOOT_THE_SERPENT("sootTheSerpent"),
    SPARK_PLUG("sparkPlug"),
    SPASMODIC_BREATH("spasmodicBreath"),
    SPEED_LIMITER("speedLimiter"),
    SPIKED_BOOTS("spikedBoots"),
    SPIRIT_ALL_SEEING("spiritAllSeeing"),
    SPONGE("sponge"),
    SPOOL_OF_WIRE("spoolOfWire"),
    SPRING_CLAMP("springClamp"),
    STAMP_ODD("stampOdd"),
    STAMP_UNUSUAL("stampUnusual"),
    STICHED_BAG("stichedBag"),
    STYPTIC_AGENT("stypticAgent"),
    SURGICAL_SUTURE("surgicalSuture"),
    SYRINGE("syringe"),
    TAP_SETTERS("tapSetters"),
    TAR_BOTTLE("tarBottle"),
    THE_THOMPSONS_MIX("theThompsonsMix"),
    THOMPSONS_MOONSHINE("thompsonsMoonshine"),
    THREADED_FILAMENT("threadedFilament"),
    TIR_OPTIC("tirOptic"),
    TOKEN_ERRODED("tokenErroded"),
    TOKEN_GOLD("tokenGold"),
    TORN_BOOKMARK("tornBookmark"),
    TRAPPER_BAG("trapperBag"),
    TRAPPER_GLOVES("trapperGloves"),
    TRAPPER_SACK("trapperSack"),
    UNIQUE_RING("uniqueRing"),
    VEGETABLE_OIL("vegetableOil"),
    WAX_BRICK("waxBrick"),
    WEAVED_RING("weavedRing"),
    WHITE_BLIND_WARRIOR("whiteBlindWarrior"),
    WHITE_BLINK("whiteBlink"),
    WHITE_KUNTIN_TAKKHO("whiteKuntinTakkho"),
    WHITE_NIT_COMB("whiteNitComb"),
    WHITE_SHADOW_DANCE("whiteShadowDance"),
    WHITE_WINDSTORM("whiteWindstorm"),
    WIDE_LENS("wideLens"),
    WOODEN_HORSE("woodenHorse"),
    COLD_DIRT("coldDirt", "Kenya", LEGION),
    DEFACED_SMILEY_BUTTON("defacedSmileyButton", "Kenya", LEGION),
    ETCHED_RULER("etchedRuler", "Kenya", LEGION),
    FILTHY_BLADE("filthyBlade", "Kenya", LEGION),
    FRANKS_MIXTAPE("franksMixtape", "Kenya", LEGION),
    FRIENDSHIP_BRACELET("friendshipBracelet", "Kenya", LEGION),
    FUMING_MIXTAPE("fumingMixtape", "Kenya", LEGION),
    IRIDESCENT_BUTTON("iridescentButton", "Kenya", LEGION),
    JOEYS_MIXTAPE("joeysMixtape", "Kenya", LEGION),
    JULIES_MIXTAPE("juliesMixtape", "Kenya", LEGION),
    MISCHIEF_LIST("mischiefList", "Kenya", LEGION),
    MURAL_SKETCH("muralSketch", "Kenya", LEGION),
    NASTY_BLADE("nastyBlade", "Kenya", LEGION),
    NEVER_SLEEP_PILLS("neverSleepPills", "Kenya", LEGION),
    SCRATCHED_RULER("scratchedRuler", "Kenya", LEGION),
    SMILEY_FACE_BUTTON("smileyFaceButton", "Kenya", LEGION),
    STAB_WOUNDS_STUDY("stabWoundsStudy", "Kenya", LEGION),
    STOLEN_SKETCHBOOK("stolenSketchbook", "Kenya", LEGION),
    SUZIES_MIXTAPE("suziesMixtape", "Kenya", LEGION),
    THE_LEGION_BUTTON("theLegionButton", "Kenya", LEGION),
    ASHEN_APPLE("ashenApple", "Mali", PLAGUE),
    BLACK_INCENSE("blackIncense", "Mali", PLAGUE),
    DEVOTEES_AMULET("devoteesAmulet", "Mali", PLAGUE),
    EMETIC_POTION("emeticPotion", "Mali", PLAGUE),
    EXORCISM_AMULET("exorcismAmulet", "Mali", PLAGUE),
    HEALING_SALVE("healingSalve", "Mali", PLAGUE),
    HEMATITE_SEAL("hematiteSeal", "Mali", PLAGUE),
    INCENSED_OINTMENT("incensedOintment", "Mali", PLAGUE),
    INFECTED_EMETIC("infectedEmetic", "Mali", PLAGUE),
    IRIDESCENT_SEAL("IridescentSeal", "Mali", PLAGUE),
    LIMESTONE_SEAL("limestoneSeal", "Mali", PLAGUE),
    OLIBANUM_INCENSE("olibanumIncense", "Mali", PLAGUE),
    POTENT_TINCTURE("potentTincture", "Mali", PLAGUE),
    PRAYER_APPLE("prayerApple", "Mali", PLAGUE),
    PRAYER_TABLET_FRAGMENT("prayerTabletFragment", "Mali", PLAGUE),
    PROPHYLACTIC_AMULET("prophylacticAmulet", "Mali", PLAGUE),
    RUBBING_OIL("rubbingOil", "Mali", PLAGUE),
    SEVERED_TOE("severedToe", "Mali", PLAGUE),
    VILE_EMETIC("vileEmetic", "Mali", PLAGUE),
    WORSHIP_TABLET("worshipTablet", "Mali", PLAGUE),
    CAUGHT_ON_TAPE("caughtOnTape", "Oman", GHOST_FACE),
    CHEAP_COLOGNE("cheapCologne", "Oman", GHOST_FACE),
    CHEWED_PEN("chewedPen", "Oman", GHOST_FACE),
    DRIVERS_LICENSE("driversLicense", "Oman", GHOST_FACE),
    DROP_LEG_KNIFE_SHEATH("dropLegKnifeSheath", "Oman", GHOST_FACE),
    HEADLINES_CUTOUTS("headlinesCutouts", "Oman", GHOST_FACE),
    KNIFE_BELT_CLIP("knifeBeltClip", "Oman", GHOST_FACE),
    LASTING_PERFUME("lastingPerfume", "Oman", GHOST_FACE),
    LEATHER_KNIFE_SHEATH("leatherKnifeSheath", "Oman", GHOST_FACE),
    MARKED_MAP("markedMap", "Oman", GHOST_FACE),
    NIGHTVISION_MONCULAR("nightvisionMoncular", "Oman", GHOST_FACE),
    OLSENS_ADDRESS_BOOK("olsensAddressBook", "Oman", GHOST_FACE),
    OLSENS_JOURNAL("olsensJournal", "Oman", GHOST_FACE),
    OLSENS_WALLET("olsensWallet", "Oman", GHOST_FACE),
    OUTDOOR_SECURITY_CAMERA("outdoorSecurityCamera", "Oman", GHOST_FACE),
    PHILLY("philly", "Oman", GHOST_FACE),
    REUSUABLE_CINCH_STRAPS("reusuableCinchStraps", "Oman", GHOST_FACE),
    TELEPHOTO_LENS("telephotoLens", "Oman", GHOST_FACE),
    VICTIMS_DETAILED_ROUTINE("victimsDetailedRoutine", "Oman", GHOST_FACE),
    WALLEYES_MATCHBOOK("walleyesMatchbook", "Oman", GHOST_FACE),
    BARBS_GLASSES("barbsGlasses", "Qatar", DEMOGORGON),
    BLACK_HEART("blackHeart", "Qatar", DEMOGORGON),
    BRASS_CASE_LIGHTER("brassCaseLighter", "Qatar", DEMOGORGON),
    DEER_LUNG("deerLung", "Qatar", DEMOGORGON),
    ELEVENS_SODA("elevensSoda", "Qatar", DEMOGORGON),
    LEPROSE_LICHEN("leproseLichen", "Qatar", DEMOGORGON),
    LIFEGUARD_WHISTLE("lifeguardWhistle", "Qatar", DEMOGORGON),
    MEWS_GUTS("mewsGuts", "Qatar", DEMOGORGON),
    RAT_LIVER("ratLiver", "Qatar", DEMOGORGON),
    RAT_TAIL("ratTail", "Qatar", DEMOGORGON),
    RED_MOSS("redMoss", "Qatar", DEMOGORGON),
    ROTTEN_GREEN_TRIPE("rottenGreenTripe", "Qatar", DEMOGORGON),
    ROTTEN_PUMPKIN("rottenPumpkin", "Qatar", DEMOGORGON),
    STICKY_LINING("stickyLining", "Qatar", DEMOGORGON),
    THORNY_VINES("thornyVines", "Qatar", DEMOGORGON),
    UNKNOWN_EGG("unknownEgg", "Qatar", DEMOGORGON),
    UPSIDEDOWN_RESIN("upsidedownResin", "Qatar", DEMOGORGON),
    VERMILLION_WEBCAP("vermillionWebcap", "Qatar", DEMOGORGON),
    VIOLET_WAXCAP("violetWaxcap", "Qatar", DEMOGORGON),
    VISCOUS_WEBBING("viscousWebbing", "Qatar", DEMOGORGON),
    AKITOS_CRUTCH("akitosCrutch", "Sweden"),
    BLACKENED_TOENAIL("blackenedToenail", "Sweden"),
    BLOODY_SASH("bloodySash", "Sweden"),
    CHILDS_WOODEN_SWORD("childsWoodenSword", "Sweden"),
    CHIPPED_SAIHAI("chippedSaihai", "Sweden"),
    CRACKED_SAKAZUKI("crackedSakazuki", "Sweden"),
    INK_LION("inkLion", "Sweden"),
    IRIDESCENT_FAMILY_CREST("IridescentFamilyCrest", "Sweden"),
    KANAIANZEN_TALISMAN("kanaianzenTalisman", "Sweden"),
    LION_FANG("lionFang", "Sweden"),
    PAPER_LANTERN("paperLantern", "Sweden"),
    POLISHED_MAEDATE("polishedMaedate", "Sweden"),
    RENIROS_BLOODY_GLOVE("renirosBloodyGlove", "Sweden"),
    ROTTING_ROPE("rottingRope", "Sweden"),
    SCALPED_TOPKNOT("scalpedTopknot", "Sweden"),
    SHATTERED_WAKIZASHI("shatteredWakizashi", "Sweden"),
    SPLINTERED_HULL("splinteredHull", "Sweden"),
    TEAR_SOAKED_TENUGUI("tearSoakedTenugui", "Sweden"),
    WOODEN_ONI_MASK("woodenOniMask", "Sweden"),
    YAMAOKA_SASHIMONO("yamaokaSashimono", "Sweden"),
    BARBED_WIRE("barbedWire", "Ukraine"),
    BAYSHORES_CIGAR("bayshoresCigar", "Ukraine"),
    BAYSHORES_GOLD_TOOTH("bayshoresGoldTooth", "Ukraine"),
    CHEWING_TOBACCO("chewingTobacco", "Ukraine"),
    CLEAR_CREEK_WHISKEY("clearCreekWhiskey", "Ukraine"),
    HELLSHIRE_IRON("hellshireIron", "Ukraine"),
    HONEY_LOCUST_THORNS("honeyLocustThorns", "Ukraine"),
    IRIDESCENT_COIN("iridescentCoin", "Ukraine"),
    JAW_SMASHER("jawSmasher", "Ukraine"),
    MARSHALS_BADGE("marshalsBadge", "Ukraine"),
    MODIFIED_AMMO_BELT("modifiedAmmoBelt", "Ukraine"),
    POISON_OAK_LEAVES("poisonOakLeaves", "Ukraine"),
    PRISON_CHAIN("prisonChain", "Ukraine"),
    RICKETY_CHAIN("ricketyChain", "Ukraine"),
    RUSTED_SPIKE("rustedSpike", "Ukraine"),
    SNAKE_OIL("snakeOil", "Ukraine"),
    SPIT_POLISH_RAG("spitPolishRag", "Ukraine"),
    TIN_OIL_CAN("tinOilCan", "Ukraine"),
    WANTED_POSTER("wantedPoster", "Ukraine"),
    WARDENS_KEYS("wardensKeys", "Ukraine");

    private final String name;
    private final String subFolder;
    private final Character character;
    public static final Addon[] VALUES = values();

    Addon(@Nonnull String name) {
        this(name, "");
    }

    Addon(@Nonnull String name, @Nonnull String subFolder) {
        this(name, subFolder, null);
    }

    Addon(@Nonnull String name, @Nonnull String subFolder, @Nullable Character character) {
        this.name = name;
        this.subFolder = subFolder;
        this.character = character;
    }

    @Nonnull
    @Override
    public String getName() {
        return name;
    }

    @Nonnull
    @Override
    public String getFileAdditive() {
        return "iconAddon_";
    }

    @Nonnull
    @Override
    public String getSubfolderName() {
        return "ItemAddons\\" + subFolder;
    }

    @Nullable
    @Override
    public Character getCharacter() {
        return character;
    }

    @Nullable
    public static Addon fromName(@Nonnull String name) {
        for (Addon addon : VALUES) {
            if (addon.name.equalsIgnoreCase(name))
                return addon;
        }
        return null;
    }

    @Nonnull
    @ParametersAreNonnullByDefault
    public static Addon fromName(String name, Addon defaultVal) {
        for (Addon addon : VALUES) {
            if (addon.name.equalsIgnoreCase(name))
                return addon;
        }
        return defaultVal;
    }
}