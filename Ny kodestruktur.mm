<map version="freeplane 1.9.13">
<!--To view this file, download free mind mapping software Freeplane from https://www.freeplane.org -->
<node LOCALIZED_TEXT="new_mindmap" FOLDED="false" ID="ID_696401721" CREATED="1610381621824" MODIFIED="1610381621824" STYLE="oval">
<font SIZE="18"/>
<hook NAME="MapStyle">
    <properties edgeColorConfiguration="#808080ff,#ff0000ff,#0000ffff,#00ff00ff,#ff00ffff,#00ffffff,#7c0000ff,#00007cff,#007c00ff,#7c007cff,#007c7cff,#7c7c00ff" fit_to_viewport="false" associatedTemplateLocation="template:/standard-1.6.mm"/>

<map_styles>
<stylenode LOCALIZED_TEXT="styles.root_node" STYLE="oval" UNIFORM_SHAPE="true" VGAP_QUANTITY="24 pt">
<font SIZE="24"/>
<stylenode LOCALIZED_TEXT="styles.predefined" POSITION="right" STYLE="bubble">
<stylenode LOCALIZED_TEXT="default" ID="ID_271890427" ICON_SIZE="12 pt" COLOR="#000000" STYLE="fork">
<arrowlink SHAPE="CUBIC_CURVE" COLOR="#000000" WIDTH="2" TRANSPARENCY="200" DASH="" FONT_SIZE="9" FONT_FAMILY="SansSerif" DESTINATION="ID_271890427" STARTARROW="NONE" ENDARROW="DEFAULT"/>
<font NAME="SansSerif" SIZE="10" BOLD="false" ITALIC="false"/>
<richcontent CONTENT-TYPE="plain/auto" TYPE="DETAILS"/>
<richcontent TYPE="NOTE" CONTENT-TYPE="plain/auto"/>
</stylenode>
<stylenode LOCALIZED_TEXT="defaultstyle.details"/>
<stylenode LOCALIZED_TEXT="defaultstyle.attributes">
<font SIZE="9"/>
</stylenode>
<stylenode LOCALIZED_TEXT="defaultstyle.note" COLOR="#000000" BACKGROUND_COLOR="#ffffff" TEXT_ALIGN="LEFT"/>
<stylenode LOCALIZED_TEXT="defaultstyle.floating">
<edge STYLE="hide_edge"/>
<cloud COLOR="#f0f0f0" SHAPE="ROUND_RECT"/>
</stylenode>
<stylenode LOCALIZED_TEXT="defaultstyle.selection" BACKGROUND_COLOR="#afd3f7" BORDER_COLOR_LIKE_EDGE="false" BORDER_COLOR="#afd3f7"/>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.user-defined" POSITION="right" STYLE="bubble">
<stylenode LOCALIZED_TEXT="styles.topic" COLOR="#18898b" STYLE="fork">
<font NAME="Liberation Sans" SIZE="10" BOLD="true"/>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.subtopic" COLOR="#cc3300" STYLE="fork">
<font NAME="Liberation Sans" SIZE="10" BOLD="true"/>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.subsubtopic" COLOR="#669900">
<font NAME="Liberation Sans" SIZE="10" BOLD="true"/>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.important" ID="ID_67550811">
<icon BUILTIN="yes"/>
<arrowlink COLOR="#003399" TRANSPARENCY="255" DESTINATION="ID_67550811"/>
</stylenode>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.AutomaticLayout" POSITION="right" STYLE="bubble">
<stylenode LOCALIZED_TEXT="AutomaticLayout.level.root" COLOR="#000000" STYLE="oval" SHAPE_HORIZONTAL_MARGIN="10 pt" SHAPE_VERTICAL_MARGIN="10 pt">
<font SIZE="18"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,1" COLOR="#0033ff">
<font SIZE="16"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,2" COLOR="#00b439">
<font SIZE="14"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,3" COLOR="#990000">
<font SIZE="12"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,4" COLOR="#111111">
<font SIZE="10"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,5"/>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,6"/>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,7"/>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,8"/>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,9"/>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,10"/>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,11"/>
</stylenode>
</stylenode>
</map_styles>
</hook>
<hook NAME="AutomaticEdgeColor" COUNTER="99" RULE="ON_BRANCH_CREATION"/>
<node TEXT="BaseAssertionGenerator" ID="ID_1268334146" CREATED="1690714471363" MODIFIED="1690714471380">
<edge COLOR="#ff0000"/>
</node>
<node TEXT="BaseAssertionGenerator" ID="ID_82741603" CREATED="1690714471363" MODIFIED="1690714471380">
<edge COLOR="#0000ff"/>
</node>
<node TEXT="Testrig" ID="ID_1558616578" CREATED="1690714883614" MODIFIED="1690714893691">
<edge COLOR="#00ffff"/>
<node TEXT="createAssertionsFileFor" ID="ID_1969579657" CREATED="1690714471406" MODIFIED="1690714896893"/>
<node TEXT="generateAssertionsEntryPointClassFor" ID="ID_520567877" CREATED="1690714471420" MODIFIED="1690714919552"/>
</node>
<node TEXT="BaseAssertionGenerator" ID="ID_714409875" CREATED="1690714471380" MODIFIED="1690714471380">
<edge COLOR="#00ff00"/>
<node TEXT="buildDirectory" ID="ID_1284365606" CREATED="1690714471394" MODIFIED="1690714536960"/>
</node>
<node TEXT="GeneratorConfig" FOLDED="true" ID="ID_182246616" CREATED="1690714584398" MODIFIED="1690714586915">
<edge COLOR="#00ff00"/>
<node TEXT="checkGivenPackageIsValid" ID="ID_320092518" CREATED="1690714471397" MODIFIED="1690714587701"/>
</node>
<node TEXT="AssertionTemplatePopulator" FOLDED="true" ID="ID_1708311728" CREATED="1690714491083" MODIFIED="1690718805827">
<edge COLOR="#0000ff"/>
<node TEXT="assertionContentForField" ID="ID_1793626072" CREATED="1690714471380" MODIFIED="1690714498210"/>
<node TEXT="assertionContentForProperty" ID="ID_795522722" CREATED="1690714471380" MODIFIED="1690714499990"/>
<node TEXT="baseAssertionContentFor" ID="ID_1749340657" CREATED="1690714471391" MODIFIED="1690714531754"/>
<node TEXT="declareExceptions" ID="ID_533610819" CREATED="1690714471408" MODIFIED="1690715247025"/>
<node TEXT="determinePredicateType" ID="ID_1358029280" CREATED="1690714471413" MODIFIED="1690718196092"/>
<node TEXT="fillAssertClassTemplate" ID="ID_1205010546" CREATED="1690714471414" MODIFIED="1690718384813"/>
<node TEXT="fillAssertionContentForPredicateField" ID="ID_1357690743" CREATED="1690714471415" MODIFIED="1690718446334"/>
<node TEXT="fillConcreteAssertClassTemplate" ID="ID_1641108473" CREATED="1690714471416" MODIFIED="1690718538946"/>
<node TEXT="Flat" ID="ID_217281118" CREATED="1690718395315" MODIFIED="1690718396498"/>
<node TEXT="Hierarcical" ID="ID_513221352" CREATED="1690718315028" MODIFIED="1690718317846">
<node TEXT="fillAbstractAssertClassTemplate" ID="ID_1333655126" CREATED="1690714471413" MODIFIED="1690718307671"/>
</node>
<node TEXT="Mulig mykje her bør ligge i ein eigen type som metodane kan jobbe på" ID="ID_1627132182" CREATED="1690718553884" MODIFIED="1690718582766"/>
<node TEXT="Navnekonvensjon" ID="ID_1705539330" CREATED="1690718610355" MODIFIED="1690718620214">
<node TEXT="fillAbstractClass" ID="ID_643761958" CREATED="1690718620214" MODIFIED="1690718627906"/>
<node TEXT="fillConcreteClass" ID="ID_1209678941" CREATED="1690718628604" MODIFIED="1690718632707"/>
</node>
</node>
<node TEXT="EntryPointTemplatePopulator" ID="ID_1685921947" CREATED="1690718806304" MODIFIED="1690718814499">
<edge COLOR="#007c7c"/>
<node TEXT="generateAssertionEntryPointMethodsFor" ID="ID_569580650" CREATED="1690714471417" MODIFIED="1690718820342"/>
<node TEXT="generateAssertionsEntryPointClassContent" ID="ID_1888234101" CREATED="1690714471418" MODIFIED="1690718885400"/>
</node>
<node TEXT="EntryPointGenerator" FOLDED="true" ID="ID_74835137" CREATED="1690714631047" MODIFIED="1690714650857">
<edge COLOR="#ff00ff"/>
<node TEXT="chooseAssertionEntryPointClassTemplate" ID="ID_1292964935" CREATED="1690714471400" MODIFIED="1690714652198"/>
<node TEXT="chooseAssertionEntryPointMethodTemplate" ID="ID_975663484" CREATED="1690714471404" MODIFIED="1690714652215"/>
<node TEXT="determineFileName" ID="ID_912579768" CREATED="1690714471410" MODIFIED="1690717434256"/>
<node TEXT="generateAssertionsEntryPointClassContentFor" ID="ID_232560952" CREATED="1690714471419" MODIFIED="1690718971924"/>
</node>
<node TEXT="FileWriter" ID="ID_1821496835" CREATED="1690715092776" MODIFIED="1690715098624">
<edge COLOR="#7c0000"/>
<node TEXT="createFile" ID="ID_551500583" CREATED="1690714471408" MODIFIED="1690715102656"/>
<node TEXT="fillFile" ID="ID_882526866" CREATED="1690714471416" MODIFIED="1690718711992"/>
</node>
<node TEXT="ClassDescription" FOLDED="true" POSITION="right" ID="ID_588460553" CREATED="1690716058857" MODIFIED="1690716411901">
<edge COLOR="#007c00"/>
<node TEXT="determineBestEntryPointsAssertionsClassPackage" ID="ID_1171560126" CREATED="1690714471409" MODIFIED="1690716407686">
<node TEXT="Blir brukt både for" ID="ID_1269601655" CREATED="1690715933446" MODIFIED="1690715942916">
<node TEXT="generering av pathen der fil skal bli skriven" ID="ID_1630137273" CREATED="1690715942926" MODIFIED="1690715982524"/>
<node TEXT="generering av pakkenavn for entrypoint-klasser" ID="ID_1210801598" CREATED="1690715983221" MODIFIED="1690715991558"/>
</node>
<node TEXT="" ID="ID_196684230" CREATED="1690716004984" MODIFIED="1690716004984"/>
</node>
<node TEXT="determinePackageName" ID="ID_485855083" CREATED="1690714471411" MODIFIED="1690718127135"/>
<node TEXT="Vurder lage decorator for CD med metodar brukt av TemplatePopulator og ved skriving til fil." ID="ID_1686624126" CREATED="1690716435827" MODIFIED="1690716510393"/>
</node>
<node TEXT="----------------------" POSITION="right" ID="ID_883222613" CREATED="1690718687209" MODIFIED="1690718690987">
<edge COLOR="#7c007c"/>
</node>
<node TEXT="generateAssertionsForDeclaredFieldsOf" ID="ID_430855340" CREATED="1690714471420" MODIFIED="1690714471423">
<edge COLOR="#00ffff"/>
</node>
<node TEXT="generateAssertionsForDeclaredGettersOf" ID="ID_8595692" CREATED="1690714471421" MODIFIED="1690714471423">
<edge COLOR="#7c0000"/>
</node>
<node TEXT="generateAssertionsForFields" ID="ID_1426475735" CREATED="1690714471423" MODIFIED="1690714471424">
<edge COLOR="#00007c"/>
</node>
<node TEXT="generateAssertionsForFieldsOf" ID="ID_830914326" CREATED="1690714471424" MODIFIED="1690714471425">
<edge COLOR="#007c00"/>
</node>
<node TEXT="generateAssertionsForGetters" ID="ID_786546532" CREATED="1690714471424" MODIFIED="1690714471425">
<edge COLOR="#7c007c"/>
</node>
<node TEXT="generateAssertionsForGettersOf" ID="ID_303570519" CREATED="1690714471425" MODIFIED="1690714471426">
<edge COLOR="#007c7c"/>
</node>
<node TEXT="generateCustomAssertionContentFor" ID="ID_678473061" CREATED="1690714471425" MODIFIED="1690714471426">
<edge COLOR="#7c7c00"/>
</node>
<node TEXT="generateCustomAssertionFor" ID="ID_374000338" CREATED="1690714471426" MODIFIED="1690714471427">
<edge COLOR="#ff0000"/>
</node>
<node TEXT="generateHierarchicalCustomAssertionContentFor" ID="ID_1256943961" CREATED="1690714471427" MODIFIED="1690714471429">
<edge COLOR="#0000ff"/>
</node>
<node TEXT="generateHierarchicalCustomAssertionFor" ID="ID_900776426" CREATED="1690714471427" MODIFIED="1690714471429">
<edge COLOR="#00ff00"/>
</node>
<node TEXT="getDirectoryPathCorrespondingToPackage" ID="ID_428663814" CREATED="1690714471429" MODIFIED="1690714471429">
<edge COLOR="#ff00ff"/>
</node>
<node TEXT="getDirectoryWhereToCreateAssertFilesFor" ID="ID_1193042252" CREATED="1690714471429" MODIFIED="1690714471432">
<edge COLOR="#00ffff"/>
</node>
<node TEXT="getTypeName" ID="ID_1399877820" CREATED="1690714471429" MODIFIED="1690714471432">
<edge COLOR="#7c0000"/>
</node>
<node TEXT="hasAlreadyNegativePredicate" ID="ID_226286377" CREATED="1690714471432" MODIFIED="1690714471432">
<edge COLOR="#00007c"/>
</node>
<node TEXT="isImportNeeded" ID="ID_1270683553" CREATED="1690714471432" MODIFIED="1690714471432">
<edge COLOR="#007c00"/>
</node>
<node TEXT="listNeededImports" ID="ID_108505077" CREATED="1690714471432" MODIFIED="1690714471432">
<edge COLOR="#7c007c"/>
</node>
<node TEXT="noClassDescriptionsGiven" ID="ID_1804718833" CREATED="1690714471432" MODIFIED="1690714471432">
<edge COLOR="#007c7c"/>
</node>
<node TEXT="register" ID="ID_1837605658" CREATED="1690714471432" MODIFIED="1690714471432">
<edge COLOR="#7c7c00"/>
</node>
<node TEXT="setDirectoryWhereAssertionFilesAreGenerated" ID="ID_857600907" CREATED="1690714471432" MODIFIED="1690714471432">
<edge COLOR="#ff0000"/>
</node>
<node TEXT="setGenerateAssertionsForAllFields" ID="ID_1269738643" CREATED="1690714471432" MODIFIED="1690714471432">
<edge COLOR="#0000ff"/>
</node>
<node TEXT="setGeneratedAssertionsPackage" ID="ID_1178579918" CREATED="1690714471432" MODIFIED="1690714471432">
<edge COLOR="#00ff00"/>
</node>
<node TEXT="switchToComparableAssertIfPossible" ID="ID_242212259" CREATED="1690714471432" MODIFIED="1690714471439">
<edge COLOR="#ff00ff"/>
</node>
<node TEXT="unclashName" ID="ID_1032703691" CREATED="1690714471432" MODIFIED="1690714471439">
<edge COLOR="#00ffff"/>
</node>
<node TEXT="ABSTRACT_ASSERT_SELF_TYPE" ID="ID_10252387" CREATED="1690714471439" MODIFIED="1690714471445">
<edge COLOR="#7c0000"/>
</node>
<node TEXT="ABSTRACT_SUPER_ASSERTION_CLASS" ID="ID_301239620" CREATED="1690714471439" MODIFIED="1690714471447">
<edge COLOR="#00007c"/>
</node>
<node TEXT="ALL_ASSERTIONS_ENTRY_POINTS" ID="ID_1169695695" CREATED="1690714471445" MODIFIED="1690714471447">
<edge COLOR="#007c00"/>
</node>
<node TEXT="CLASS_NAME_PATTERN" ID="ID_1842864653" CREATED="1690714471447" MODIFIED="1690714471447">
<edge COLOR="#7c007c"/>
</node>
<node TEXT="CLASS_TO_ASSERT" ID="ID_739041071" CREATED="1690714471447" MODIFIED="1690714471447">
<edge COLOR="#007c7c"/>
</node>
<node TEXT="CUSTOM_ASSERTION_CLASS" ID="ID_1615381962" CREATED="1690714471447" MODIFIED="1690714471447">
<edge COLOR="#7c7c00"/>
</node>
<node TEXT="ELEMENT_ASSERT_TYPE" ID="ID_181700672" CREATED="1690714471447" MODIFIED="1690714471447">
<edge COLOR="#ff0000"/>
</node>
<node TEXT="ELEMENT_TYPE" ID="ID_1912035069" CREATED="1690714471447" MODIFIED="1690714471447">
<edge COLOR="#0000ff"/>
</node>
<node TEXT="EMPTY_HIERARCHY" ID="ID_1595117764" CREATED="1690714471447" MODIFIED="1690714471447">
<edge COLOR="#00ff00"/>
</node>
<node TEXT="generateAssertionsForAllFields" ID="ID_243164900" CREATED="1690714471447" MODIFIED="1690714471447">
<edge COLOR="#ff00ff"/>
</node>
<node TEXT="generatedAssertionsPackage" ID="ID_1336113018" CREATED="1690714471447" MODIFIED="1690714471457">
<edge COLOR="#00ffff"/>
</node>
<node TEXT="IMPORT_LINE" ID="ID_1616165096" CREATED="1690714471447" MODIFIED="1690714471457">
<edge COLOR="#7c0000"/>
</node>
<node TEXT="IMPORTS" ID="ID_1407084714" CREATED="1690714471457" MODIFIED="1690714471457">
<edge COLOR="#00007c"/>
</node>
<node TEXT="JAVA_KEYWORDS" ID="ID_996087732" CREATED="1690714471457" MODIFIED="1690714471461">
<edge COLOR="#007c00"/>
</node>
<node TEXT="LINE_SEPARATOR" ID="ID_1444572520" CREATED="1690714471457" MODIFIED="1690714471461">
<edge COLOR="#7c007c"/>
</node>
<node TEXT="MYSELF" ID="ID_942468184" CREATED="1690714471461" MODIFIED="1690714471463">
<edge COLOR="#007c7c"/>
</node>
<node TEXT="NEGATIVE_PREDICATE_FOR_FOR_ERROR_MESSAGE_PART1" ID="ID_1470869593" CREATED="1690714471463" MODIFIED="1690714471474">
<edge COLOR="#7c7c00"/>
</node>
<node TEXT="NEGATIVE_PREDICATE_FOR_FOR_ERROR_MESSAGE_PART2" ID="ID_353888624" CREATED="1690714471464" MODIFIED="1690714471480">
<edge COLOR="#ff0000"/>
</node>
<node TEXT="NEGATIVE_PREDICATE_FOR_JAVADOC" ID="ID_1077742102" CREATED="1690714471474" MODIFIED="1690714471480">
<edge COLOR="#0000ff"/>
</node>
<node TEXT="NON_PUBLIC_FIELD_VALUE_EXTRACTION" ID="ID_159985253" CREATED="1690714471480" MODIFIED="1690714471483">
<edge COLOR="#00ff00"/>
</node>
<node TEXT="ORDER_BY_INCREASING_LENGTH" ID="ID_1992056078" CREATED="1690714471480" MODIFIED="1690714471483">
<edge COLOR="#ff00ff"/>
</node>
<node TEXT="PACKAGE" ID="ID_1985557811" CREATED="1690714471483" MODIFIED="1690714471483">
<edge COLOR="#00ffff"/>
</node>
<node TEXT="PREDICATE" ID="ID_1375399345" CREATED="1690714471483" MODIFIED="1690714471483">
<edge COLOR="#7c0000"/>
</node>
<node TEXT="PREDICATE_FOR_FOR_ERROR_MESSAGE_PART1" ID="ID_1819043302" CREATED="1690714471483" MODIFIED="1690714471483">
<edge COLOR="#00007c"/>
</node>
<node TEXT="PREDICATE_FOR_FOR_ERROR_MESSAGE_PART2" ID="ID_430089077" CREATED="1690714471483" MODIFIED="1690714471483">
<edge COLOR="#007c00"/>
</node>
<node TEXT="PREDICATE_FOR_JAVADOC" ID="ID_14313970" CREATED="1690714471483" MODIFIED="1690714471483">
<edge COLOR="#7c007c"/>
</node>
<node TEXT="PREDICATE_NEG" ID="ID_1672568412" CREATED="1690714471483" MODIFIED="1690714471483">
<edge COLOR="#007c7c"/>
</node>
<node TEXT="PROPERTY_ASSERT_TYPE" ID="ID_1897090799" CREATED="1690714471483" MODIFIED="1690714471483">
<edge COLOR="#7c7c00"/>
</node>
<node TEXT="PROPERTY_GETTER_CALL" ID="ID_1247257649" CREATED="1690714471483" MODIFIED="1690714471483">
<edge COLOR="#ff0000"/>
</node>
<node TEXT="PROPERTY_SIMPLE_TYPE" ID="ID_1337525357" CREATED="1690714471483" MODIFIED="1690714471483">
<edge COLOR="#0000ff"/>
</node>
<node TEXT="PROPERTY_TYPE" ID="ID_898993972" CREATED="1690714471483" MODIFIED="1690714471483">
<edge COLOR="#00ff00"/>
</node>
<node TEXT="PROPERTY_WITH_LOWERCASE_FIRST_CHAR" ID="ID_490856441" CREATED="1690714471483" MODIFIED="1690714471483">
<edge COLOR="#ff00ff"/>
</node>
<node TEXT="PROPERTY_WITH_SAFE" ID="ID_1201880458" CREATED="1690714471483" MODIFIED="1690714471483">
<edge COLOR="#00ffff"/>
</node>
<node TEXT="PROPERTY_WITH_UPPERCASE_FIRST_CHAR" ID="ID_187872335" CREATED="1690714471483" MODIFIED="1690714471483">
<edge COLOR="#7c0000"/>
</node>
<node TEXT="SELF_TYPE" ID="ID_1551017596" CREATED="1690714471483" MODIFIED="1690714471483">
<edge COLOR="#00007c"/>
</node>
<node TEXT="targetBaseDirectory" ID="ID_1262249758" CREATED="1690714471483" MODIFIED="1690714471483">
<edge COLOR="#007c00"/>
</node>
<node TEXT="templateRegistry" ID="ID_460103537" CREATED="1690714471483" MODIFIED="1690714471483">
<edge COLOR="#7c007c"/>
</node>
<node TEXT="TEMPLATES_DIR" ID="ID_957288554" CREATED="1690714471483" MODIFIED="1690714471483">
<edge COLOR="#007c7c"/>
</node>
<node TEXT="THROWS" ID="ID_804336461" CREATED="1690714471483" MODIFIED="1690714471483">
<edge COLOR="#7c7c00"/>
</node>
<node TEXT="THROWS_JAVADOC" POSITION="right" ID="ID_799665793" CREATED="1690714471483" MODIFIED="1690714471483">
<edge COLOR="#ff0000"/>
</node>
</node>
</map>
