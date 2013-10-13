package scala
package js {

trait PositionOptions extends js.Object {
  var enableHighAccuracy: js.Boolean = _
  var timeout: js.Number = _
  var maximumAge: js.Number = _
}

trait NavigatorID extends js.Object {
  var appVersion: js.String = _
  var appName: js.String = _
  var userAgent: js.String = _
  var platform: js.String = _
}

trait HTMLTableElement extends HTMLElement with MSDataBindingTableExtensions with MSDataBindingExtensions with DOML2DeprecatedBackgroundStyle with DOML2DeprecatedBackgroundColorStyle {
  var width: js.String = _
  var borderColorLight: js.Any = _
  var cellSpacing: js.String = _
  var tFoot: HTMLTableSectionElement = _
  var frame: js.String = _
  var borderColor: js.Any = _
  var rows: HTMLCollection = _
  var rules: js.String = _
  var cols: js.Number = _
  var summary: js.String = _
  var caption: HTMLTableCaptionElement = _
  var tBodies: HTMLCollection = _
  var tHead: HTMLTableSectionElement = _
  var align: js.String = _
  var cells: HTMLCollection = _
  var height: js.Any = _
  var cellPadding: js.String = _
  var border: js.String = _
  var borderColorDark: js.Any = _
  def deleteRow(index: js.Number): Unit = ???
  def deleteRow(): Unit = ???
  def createTBody(): HTMLElement = ???
  def deleteCaption(): Unit = ???
  def insertRow(index: js.Number): HTMLElement = ???
  def insertRow(): HTMLElement = ???
  def deleteTFoot(): Unit = ???
  def createTHead(): HTMLElement = ???
  def deleteTHead(): Unit = ???
  def createCaption(): HTMLElement = ???
  def moveRow(indexFrom: js.Number, indexTo: js.Number): Object = ???
  def moveRow(indexFrom: js.Number): Object = ???
  def moveRow(): Object = ???
  def createTFoot(): HTMLElement = ???
}

object HTMLTableElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLTableElement),List())))) */
}

trait TreeWalker extends js.Object {
  var whatToShow: js.Number = _
  var filter: NodeFilter = _
  var root: Node = _
  var currentNode: Node = _
  var expandEntityReferences: js.Boolean = _
  def previousSibling(): Node = ???
  def lastChild(): Node = ???
  def nextSibling(): Node = ???
  def nextNode(): Node = ???
  def parentNode(): Node = ???
  def firstChild(): Node = ???
  def previousNode(): Node = ???
}

object TreeWalker extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(TreeWalker),List())))) */
}

trait GetSVGDocument extends js.Object {
  def getSVGDocument(): Document = ???
}

trait SVGPathSegCurvetoQuadraticRel extends SVGPathSeg {
  var y: js.Number = _
  var y1: js.Number = _
  var x: js.Number = _
  var x1: js.Number = _
}

object SVGPathSegCurvetoQuadraticRel extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGPathSegCurvetoQuadraticRel),List())))) */
}

trait Performance extends js.Object {
  var navigation: PerformanceNavigation = _
  var timing: PerformanceTiming = _
  def getEntriesByType(entryType: js.String): js.Dynamic = ???
  def toJSON(): js.Dynamic = ???
  def getMeasures(measureName: js.String): js.Dynamic = ???
  def getMeasures(): js.Dynamic = ???
  def clearMarks(markName: js.String): Unit = ???
  def clearMarks(): Unit = ???
  def getMarks(markName: js.String): js.Dynamic = ???
  def getMarks(): js.Dynamic = ???
  def clearResourceTimings(): Unit = ???
  def mark(markName: js.String): Unit = ???
  def measure(measureName: js.String, startMarkName: js.String, endMarkName: js.String): Unit = ???
  def measure(measureName: js.String, startMarkName: js.String): Unit = ???
  def measure(measureName: js.String): Unit = ???
  def getEntriesByName(name: js.String, entryType: js.String): js.Dynamic = ???
  def getEntriesByName(name: js.String): js.Dynamic = ???
  def getEntries(): js.Dynamic = ???
  def clearMeasures(measureName: js.String): Unit = ???
  def clearMeasures(): Unit = ???
  def setResourceTimingBufferSize(maxSize: js.Number): Unit = ???
  def now(): js.Number = ???
}

object Performance extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Performance),List())))) */
}

trait MSDataBindingTableExtensions extends js.Object {
  var dataPageSize: js.Number = _
  def nextPage(): Unit = ???
  def firstPage(): Unit = ???
  def refresh(): Unit = ???
  def previousPage(): Unit = ???
  def lastPage(): Unit = ???
}

trait CompositionEvent extends UIEvent {
  var data: js.String = _
  var locale: js.String = _
  def initCompositionEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, viewArg: Window, dataArg: js.String, locale: js.String): Unit = ???
}

object CompositionEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(CompositionEvent),List())))) */
}

trait WindowTimers extends WindowTimersExtension {
  def clearTimeout(handle: js.Number): Unit = ???
  def setTimeout(handler: js.Any, timeout: js.Any, args: js.Any*): js.Number = ???
  def clearInterval(handle: js.Number): Unit = ???
  def setInterval(handler: js.Any, timeout: js.Any, args: js.Any*): js.Number = ???
}

trait SVGMarkerElement extends SVGElement with SVGStylable with SVGLangSpace with SVGFitToViewBox with SVGExternalResourcesRequired {
  var orientType: SVGAnimatedEnumeration = _
  var markerUnits: SVGAnimatedEnumeration = _
  var markerWidth: SVGAnimatedLength = _
  var markerHeight: SVGAnimatedLength = _
  var orientAngle: SVGAnimatedAngle = _
  var refY: SVGAnimatedLength = _
  var refX: SVGAnimatedLength = _
  def setOrientToAngle(angle: SVGAngle): Unit = ???
  def setOrientToAuto(): Unit = ???
  var SVG_MARKER_ORIENT_UNKNOWN: js.Number = _
  var SVG_MARKER_ORIENT_ANGLE: js.Number = _
  var SVG_MARKERUNITS_UNKNOWN: js.Number = _
  var SVG_MARKERUNITS_STROKEWIDTH: js.Number = _
  var SVG_MARKER_ORIENT_AUTO: js.Number = _
  var SVG_MARKERUNITS_USERSPACEONUSE: js.Number = _
}

object SVGMarkerElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGMarkerElement),List())))) */
  var SVG_MARKER_ORIENT_UNKNOWN: js.Number = _
  var SVG_MARKER_ORIENT_ANGLE: js.Number = _
  var SVG_MARKERUNITS_UNKNOWN: js.Number = _
  var SVG_MARKERUNITS_STROKEWIDTH: js.Number = _
  var SVG_MARKER_ORIENT_AUTO: js.Number = _
  var SVG_MARKERUNITS_USERSPACEONUSE: js.Number = _
}

trait CSSStyleDeclaration extends js.Object {
  var backgroundAttachment: js.String = _
  var visibility: js.String = _
  var textAlignLast: js.String = _
  var borderRightStyle: js.String = _
  var counterIncrement: js.String = _
  var orphans: js.String = _
  var cssText: js.String = _
  var borderStyle: js.String = _
  var pointerEvents: js.String = _
  var borderTopColor: js.String = _
  var markerEnd: js.String = _
  var textIndent: js.String = _
  var listStyleImage: js.String = _
  var cursor: js.String = _
  var listStylePosition: js.String = _
  var wordWrap: js.String = _
  var borderTopStyle: js.String = _
  var alignmentBaseline: js.String = _
  var opacity: js.String = _
  var direction: js.String = _
  var strokeMiterlimit: js.String = _
  var maxWidth: js.String = _
  var color: js.String = _
  var clip: js.String = _
  var borderRightWidth: js.String = _
  var verticalAlign: js.String = _
  var overflow: js.String = _
  var mask: js.String = _
  var borderLeftStyle: js.String = _
  var emptyCells: js.String = _
  var stopOpacity: js.String = _
  var paddingRight: js.String = _
  var parentRule: CSSRule = _
  var background: js.String = _
  var boxSizing: js.String = _
  var textJustify: js.String = _
  var height: js.String = _
  var paddingTop: js.String = _
  var length: js.Number = _
  var right: js.String = _
  var baselineShift: js.String = _
  var borderLeft: js.String = _
  var widows: js.String = _
  var lineHeight: js.String = _
  var left: js.String = _
  var textUnderlinePosition: js.String = _
  var glyphOrientationHorizontal: js.String = _
  var display: js.String = _
  var textAnchor: js.String = _
  var cssFloat: js.String = _
  var strokeDasharray: js.String = _
  var rubyAlign: js.String = _
  var fontSizeAdjust: js.String = _
  var borderLeftColor: js.String = _
  var backgroundImage: js.String = _
  var listStyleType: js.String = _
  var strokeWidth: js.String = _
  var textOverflow: js.String = _
  var fillRule: js.String = _
  var borderBottomColor: js.String = _
  var zIndex: js.String = _
  var position: js.String = _
  var listStyle: js.String = _
  var msTransformOrigin: js.String = _
  var dominantBaseline: js.String = _
  var overflowY: js.String = _
  var fill: js.String = _
  var captionSide: js.String = _
  var borderCollapse: js.String = _
  var boxShadow: js.String = _
  var quotes: js.String = _
  var tableLayout: js.String = _
  var unicodeBidi: js.String = _
  var borderBottomWidth: js.String = _
  var backgroundSize: js.String = _
  var textDecoration: js.String = _
  var strokeDashoffset: js.String = _
  var fontSize: js.String = _
  var border: js.String = _
  var pageBreakBefore: js.String = _
  var borderTopRightRadius: js.String = _
  var msTransform: js.String = _
  var borderBottomLeftRadius: js.String = _
  var textTransform: js.String = _
  var rubyPosition: js.String = _
  var strokeLinejoin: js.String = _
  var clipPath: js.String = _
  var borderRightColor: js.String = _
  var fontFamily: js.String = _
  var clear: js.String = _
  var content: js.String = _
  var backgroundClip: js.String = _
  var marginBottom: js.String = _
  var counterReset: js.String = _
  var outlineWidth: js.String = _
  var marginRight: js.String = _
  var paddingLeft: js.String = _
  var borderBottom: js.String = _
  var wordBreak: js.String = _
  var marginTop: js.String = _
  var top: js.String = _
  var fontWeight: js.String = _
  var borderRight: js.String = _
  var width: js.String = _
  var kerning: js.String = _
  var pageBreakAfter: js.String = _
  var borderBottomStyle: js.String = _
  var fontStretch: js.String = _
  var padding: js.String = _
  var strokeOpacity: js.String = _
  var markerStart: js.String = _
  var bottom: js.String = _
  var borderLeftWidth: js.String = _
  var clipRule: js.String = _
  var backgroundPosition: js.String = _
  var backgroundColor: js.String = _
  var pageBreakInside: js.String = _
  var backgroundOrigin: js.String = _
  var strokeLinecap: js.String = _
  var borderTopWidth: js.String = _
  var outlineStyle: js.String = _
  var borderTop: js.String = _
  var outlineColor: js.String = _
  var paddingBottom: js.String = _
  var marginLeft: js.String = _
  var font: js.String = _
  var outline: js.String = _
  var wordSpacing: js.String = _
  var maxHeight: js.String = _
  var fillOpacity: js.String = _
  var letterSpacing: js.String = _
  var borderSpacing: js.String = _
  var backgroundRepeat: js.String = _
  var borderRadius: js.String = _
  var borderWidth: js.String = _
  var borderBottomRightRadius: js.String = _
  var whiteSpace: js.String = _
  var fontStyle: js.String = _
  var minWidth: js.String = _
  var stopColor: js.String = _
  var borderTopLeftRadius: js.String = _
  var borderColor: js.String = _
  var marker: js.String = _
  var glyphOrientationVertical: js.String = _
  var markerMid: js.String = _
  var fontVariant: js.String = _
  var minHeight: js.String = _
  var stroke: js.String = _
  var rubyOverhang: js.String = _
  var overflowX: js.String = _
  var textAlign: js.String = _
  var margin: js.String = _
  def getPropertyPriority(propertyName: js.String): js.String = ???
  def getPropertyValue(propertyName: js.String): js.String = ???
  def removeProperty(propertyName: js.String): js.String = ???
  def item(index: js.Number): js.String = ???
  @scala.js.annotation.JSBracketAccess
  def apply(index: js.Number): js.String = ???
  @scala.js.annotation.JSBracketAccess
  def update(index: js.Number, v: js.String): Unit = ???
  def setProperty(propertyName: js.String, value: js.String, priority: js.String): Unit = ???
  def setProperty(propertyName: js.String, value: js.String): Unit = ???
  var animationFillMode: js.String = _
  var floodColor: js.String = _
  var animationIterationCount: js.String = _
  var textShadow: js.String = _
  var backfaceVisibility: js.String = _
  var msAnimationIterationCount: js.String = _
  var animationDelay: js.String = _
  var animationTimingFunction: js.String = _
  var columnWidth: js.Any = _
  var msScrollSnapX: js.String = _
  var columnRuleColor: js.Any = _
  var columnRuleWidth: js.Any = _
  var transitionDelay: js.String = _
  var transition: js.String = _
  var msFlowFrom: js.String = _
  var msScrollSnapType: js.String = _
  var msContentZoomSnapType: js.String = _
  var msGridColumns: js.String = _
  var msAnimationName: js.String = _
  var msGridRowAlign: js.String = _
  var msContentZoomChaining: js.String = _
  var msGridColumn: js.Any = _
  var msHyphenateLimitZone: js.Any = _
  var msScrollRails: js.String = _
  var msAnimationDelay: js.String = _
  var enableBackground: js.String = _
  var msWrapThrough: js.String = _
  var columnRuleStyle: js.String = _
  var msAnimation: js.String = _
  var msFlexFlow: js.String = _
  var msScrollSnapY: js.String = _
  var msHyphenateLimitLines: js.Any = _
  var msTouchAction: js.String = _
  var msScrollLimit: js.String = _
  var animation: js.String = _
  var transform: js.String = _
  var colorInterpolationFilters: js.String = _
  var transitionTimingFunction: js.String = _
  var msBackfaceVisibility: js.String = _
  var animationPlayState: js.String = _
  var transformOrigin: js.String = _
  var msScrollLimitYMin: js.Any = _
  var msFontFeatureSettings: js.String = _
  var msContentZoomLimitMin: js.Any = _
  var columnGap: js.Any = _
  var transitionProperty: js.String = _
  var msAnimationDuration: js.String = _
  var msAnimationFillMode: js.String = _
  var msFlexDirection: js.String = _
  var msTransitionDuration: js.String = _
  var fontFeatureSettings: js.String = _
  var breakBefore: js.String = _
  var msFlexWrap: js.String = _
  var perspective: js.String = _
  var msFlowInto: js.String = _
  var msTransformStyle: js.String = _
  var msScrollTranslation: js.String = _
  var msTransitionProperty: js.String = _
  var msUserSelect: js.String = _
  var msOverflowStyle: js.String = _
  var msScrollSnapPointsY: js.String = _
  var animationDirection: js.String = _
  var animationDuration: js.String = _
  var msFlex: js.String = _
  var msTransitionTimingFunction: js.String = _
  var animationName: js.String = _
  var columnRule: js.String = _
  var msGridColumnSpan: js.Any = _
  var msFlexNegative: js.String = _
  var columnFill: js.String = _
  var msGridRow: js.Any = _
  var msFlexOrder: js.String = _
  var msFlexItemAlign: js.String = _
  var msFlexPositive: js.String = _
  var msContentZoomLimitMax: js.Any = _
  var msScrollLimitYMax: js.Any = _
  var msGridColumnAlign: js.String = _
  var perspectiveOrigin: js.String = _
  var lightingColor: js.String = _
  var columns: js.String = _
  var msScrollChaining: js.String = _
  var msHyphenateLimitChars: js.String = _
  var msTouchSelect: js.String = _
  var floodOpacity: js.String = _
  var msAnimationDirection: js.String = _
  var msAnimationPlayState: js.String = _
  var columnSpan: js.String = _
  var msContentZooming: js.String = _
  var msPerspective: js.String = _
  var msFlexPack: js.String = _
  var msScrollSnapPointsX: js.String = _
  var msContentZoomSnapPoints: js.String = _
  var msGridRowSpan: js.Any = _
  var msContentZoomSnap: js.String = _
  var msScrollLimitXMin: js.Any = _
  var breakInside: js.String = _
  var msHighContrastAdjust: js.String = _
  var msFlexLinePack: js.String = _
  var msGridRows: js.String = _
  var transitionDuration: js.String = _
  var msHyphens: js.String = _
  var breakAfter: js.String = _
  var msTransition: js.String = _
  var msPerspectiveOrigin: js.String = _
  var msContentZoomLimit: js.String = _
  var msScrollLimitXMax: js.Any = _
  var msFlexAlign: js.String = _
  var msWrapMargin: js.Any = _
  var columnCount: js.Any = _
  var msAnimationTimingFunction: js.String = _
  var msTransitionDelay: js.String = _
  var transformStyle: js.String = _
  var msWrapFlow: js.String = _
  var msFlexPreferredSize: js.String = _
}

object CSSStyleDeclaration extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(CSSStyleDeclaration),List())))) */
}

trait SVGGElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
}

object SVGGElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGGElement),List())))) */
}

trait MSStyleCSSProperties extends MSCSSProperties {
  var pixelWidth: js.Number = _
  var posHeight: js.Number = _
  var posLeft: js.Number = _
  var pixelTop: js.Number = _
  var pixelBottom: js.Number = _
  var textDecorationNone: js.Boolean = _
  var pixelLeft: js.Number = _
  var posTop: js.Number = _
  var posBottom: js.Number = _
  var textDecorationOverline: js.Boolean = _
  var posWidth: js.Number = _
  var textDecorationLineThrough: js.Boolean = _
  var pixelHeight: js.Number = _
  var textDecorationBlink: js.Boolean = _
  var posRight: js.Number = _
  var pixelRight: js.Number = _
  var textDecorationUnderline: js.Boolean = _
}

object MSStyleCSSProperties extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSStyleCSSProperties),List())))) */
}

trait Navigator extends NavigatorID with NavigatorOnLine with NavigatorContentUtils with MSNavigatorExtensions with NavigatorGeolocation with MSNavigatorDoNotTrack with NavigatorStorageUtils with MSFileSaver {
  var msMaxTouchPoints: js.Number = _
  var msPointerEnabled: js.Boolean = _
  var msManipulationViewsEnabled: js.Boolean = _
  def msLaunchUri(uri: js.String, successCallback: MSLaunchUriCallback, noHandlerCallback: MSLaunchUriCallback): Unit = ???
  def msLaunchUri(uri: js.String, successCallback: MSLaunchUriCallback): Unit = ???
  def msLaunchUri(uri: js.String): Unit = ???
}

object Navigator extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Navigator),List())))) */
}

trait SVGPathSegCurvetoCubicSmoothAbs extends SVGPathSeg {
  var y: js.Number = _
  var x2: js.Number = _
  var x: js.Number = _
  var y2: js.Number = _
}

object SVGPathSegCurvetoCubicSmoothAbs extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGPathSegCurvetoCubicSmoothAbs),List())))) */
}

trait SVGZoomEvent extends UIEvent {
  var zoomRectScreen: SVGRect = _
  var previousScale: js.Number = _
  var newScale: js.Number = _
  var previousTranslate: SVGPoint = _
  var newTranslate: SVGPoint = _
}

object SVGZoomEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGZoomEvent),List())))) */
}

trait NodeSelector extends js.Object {
  def querySelectorAll(selectors: js.String): NodeList = ???
  def querySelector(selectors: js.String): Element = ???
}

trait HTMLTableDataCellElement extends HTMLTableCellElement {
}

object HTMLTableDataCellElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLTableDataCellElement),List())))) */
}

trait HTMLBaseElement extends HTMLElement {
  var target: js.String = _
  var href: js.String = _
}

object HTMLBaseElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLBaseElement),List())))) */
}

trait ClientRect extends js.Object {
  var left: js.Number = _
  var width: js.Number = _
  var right: js.Number = _
  var top: js.Number = _
  var bottom: js.Number = _
  var height: js.Number = _
}

object ClientRect extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(ClientRect),List())))) */
}

trait PositionErrorCallback extends js.Object {
  def apply(error: PositionError): Unit = ???
}

trait DOMImplementation extends js.Object {
  def createDocumentType(qualifiedName: js.String, publicId: js.String, systemId: js.String): DocumentType = ???
  def createDocument(namespaceURI: js.String, qualifiedName: js.String, doctype: DocumentType): Document = ???
  def hasFeature(feature: js.String, version: js.String): js.Boolean = ???
  def hasFeature(feature: js.String): js.Boolean = ???
  def createHTMLDocument(title: js.String): Document = ???
}

object DOMImplementation extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(DOMImplementation),List())))) */
}

trait SVGUnitTypes extends js.Object {
  var SVG_UNIT_TYPE_UNKNOWN: js.Number = _
  var SVG_UNIT_TYPE_OBJECTBOUNDINGBOX: js.Number = _
  var SVG_UNIT_TYPE_USERSPACEONUSE: js.Number = _
}

object SVGUnitTypes extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGUnitTypes),List())))) */
  var SVG_UNIT_TYPE_UNKNOWN: js.Number = _
  var SVG_UNIT_TYPE_OBJECTBOUNDINGBOX: js.Number = _
  var SVG_UNIT_TYPE_USERSPACEONUSE: js.Number = _
}

trait Element extends Node with NodeSelector with ElementTraversal {
  var scrollTop: js.Number = _
  var clientLeft: js.Number = _
  var scrollLeft: js.Number = _
  var tagName: js.String = _
  var clientWidth: js.Number = _
  var scrollWidth: js.Number = _
  var clientHeight: js.Number = _
  var clientTop: js.Number = _
  var scrollHeight: js.Number = _
  def getAttribute(name: js.String): js.String = ???
  def getAttribute(): js.String = ???
  def getElementsByTagNameNS(namespaceURI: js.String, localName: js.String): NodeList = ???
  def hasAttributeNS(namespaceURI: js.String, localName: js.String): js.Boolean = ???
  def getBoundingClientRect(): ClientRect = ???
  def getAttributeNS(namespaceURI: js.String, localName: js.String): js.String = ???
  def getAttributeNodeNS(namespaceURI: js.String, localName: js.String): Attr = ???
  def setAttributeNodeNS(newAttr: Attr): Attr = ???
  def msMatchesSelector(selectors: js.String): js.Boolean = ???
  def hasAttribute(name: js.String): js.Boolean = ???
  def removeAttribute(name: js.String): Unit = ???
  def removeAttribute(): Unit = ???
  def setAttributeNS(namespaceURI: js.String, qualifiedName: js.String, value: js.String): Unit = ???
  def getAttributeNode(name: js.String): Attr = ???
  def fireEvent(eventName: js.String, eventObj: js.Any): js.Boolean = ???
  def fireEvent(eventName: js.String): js.Boolean = ???
  def getElementsByTagName(name: js.String): NodeList = ???
  def getClientRects(): ClientRectList = ???
  def setAttributeNode(newAttr: Attr): Attr = ???
  def removeAttributeNode(oldAttr: Attr): Attr = ???
  def setAttribute(name: js.String, value: js.String): Unit = ???
  def setAttribute(name: js.String): Unit = ???
  def setAttribute(): Unit = ???
  def removeAttributeNS(namespaceURI: js.String, localName: js.String): Unit = ???
  var msRegionOverflow: js.String = _
  var onmspointerdown: js.Function1[js.Any, js.Any] = _
  var onmsgotpointercapture: js.Function1[js.Any, js.Any] = _
  var onmsgesturedoubletap: js.Function1[js.Any, js.Any] = _
  var onmspointerhover: js.Function1[js.Any, js.Any] = _
  var onmsgesturehold: js.Function1[js.Any, js.Any] = _
  var onmspointermove: js.Function1[js.Any, js.Any] = _
  var onmsgesturechange: js.Function1[js.Any, js.Any] = _
  var onmsgesturestart: js.Function1[js.Any, js.Any] = _
  var onmspointercancel: js.Function1[js.Any, js.Any] = _
  var onmsgestureend: js.Function1[js.Any, js.Any] = _
  var onmsgesturetap: js.Function1[js.Any, js.Any] = _
  var onmspointerout: js.Function1[js.Any, js.Any] = _
  var onmsinertiastart: js.Function1[js.Any, js.Any] = _
  var onmslostpointercapture: js.Function1[js.Any, js.Any] = _
  var onmspointerover: js.Function1[js.Any, js.Any] = _
  var msContentZoomFactor: js.Number = _
  var onmspointerup: js.Function1[js.Any, js.Any] = _
  def msGetRegionContent(): MSRangeCollection = ???
  def msReleasePointerCapture(pointerId: js.Number): Unit = ???
  def msSetPointerCapture(pointerId: js.Number): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}

object Element extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Element),List())))) */
}

trait HTMLNextIdElement extends HTMLElement {
  var n: js.String = _
}

object HTMLNextIdElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLNextIdElement),List())))) */
}

trait SVGPathSegMovetoRel extends SVGPathSeg {
  var y: js.Number = _
  var x: js.Number = _
}

object SVGPathSegMovetoRel extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGPathSegMovetoRel),List())))) */
}

trait SVGLineElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
  var y1: SVGAnimatedLength = _
  var x2: SVGAnimatedLength = _
  var x1: SVGAnimatedLength = _
  var y2: SVGAnimatedLength = _
}

object SVGLineElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGLineElement),List())))) */
}

trait HTMLParagraphElement extends HTMLElement with DOML2DeprecatedTextFlowControl {
  var align: js.String = _
}

object HTMLParagraphElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLParagraphElement),List())))) */
}

trait HTMLAreasCollection extends HTMLCollection {
  def remove(index: js.Number): Unit = ???
  def remove(): Unit = ???
  def add(element: HTMLElement, before: js.Any): Unit = ???
  def add(element: HTMLElement): Unit = ???
}

object HTMLAreasCollection extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLAreasCollection),List())))) */
}

trait SVGDescElement extends SVGElement with SVGStylable with SVGLangSpace {
}

object SVGDescElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGDescElement),List())))) */
}

trait Node extends EventTarget {
  var nodeType: js.Number = _
  var previousSibling: Node = _
  var localName: js.String = _
  var namespaceURI: js.String = _
  var textContent: js.String = _
  var parentNode: Node = _
  var nextSibling: Node = _
  var nodeValue: js.String = _
  var lastChild: Node = _
  var childNodes: NodeList = _
  var nodeName: js.String = _
  var ownerDocument: Document = _
  var attributes: NamedNodeMap = _
  var firstChild: Node = _
  var prefix: js.String = _
  def removeChild(oldChild: Node): Node = ???
  def appendChild(newChild: Node): Node = ???
  def isSupported(feature: js.String, version: js.String): js.Boolean = ???
  def isEqualNode(arg: Node): js.Boolean = ???
  def lookupPrefix(namespaceURI: js.String): js.String = ???
  def isDefaultNamespace(namespaceURI: js.String): js.Boolean = ???
  def compareDocumentPosition(other: Node): js.Number = ???
  def normalize(): Unit = ???
  def isSameNode(other: Node): js.Boolean = ???
  def hasAttributes(): js.Boolean = ???
  def lookupNamespaceURI(prefix: js.String): js.String = ???
  def cloneNode(deep: js.Boolean): Node = ???
  def cloneNode(): Node = ???
  def hasChildNodes(): js.Boolean = ???
  def replaceChild(newChild: Node, oldChild: Node): Node = ???
  def insertBefore(newChild: Node, refChild: Node): Node = ???
  def insertBefore(newChild: Node): Node = ???
  var ENTITY_REFERENCE_NODE: js.Number = _
  var ATTRIBUTE_NODE: js.Number = _
  var DOCUMENT_FRAGMENT_NODE: js.Number = _
  var TEXT_NODE: js.Number = _
  var ELEMENT_NODE: js.Number = _
  var COMMENT_NODE: js.Number = _
  var DOCUMENT_POSITION_DISCONNECTED: js.Number = _
  var DOCUMENT_POSITION_CONTAINED_BY: js.Number = _
  var DOCUMENT_POSITION_CONTAINS: js.Number = _
  var DOCUMENT_TYPE_NODE: js.Number = _
  var DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: js.Number = _
  var DOCUMENT_NODE: js.Number = _
  var ENTITY_NODE: js.Number = _
  var PROCESSING_INSTRUCTION_NODE: js.Number = _
  var CDATA_SECTION_NODE: js.Number = _
  var NOTATION_NODE: js.Number = _
  var DOCUMENT_POSITION_FOLLOWING: js.Number = _
  var DOCUMENT_POSITION_PRECEDING: js.Number = _
}

object Node extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Node),List())))) */
  var ENTITY_REFERENCE_NODE: js.Number = _
  var ATTRIBUTE_NODE: js.Number = _
  var DOCUMENT_FRAGMENT_NODE: js.Number = _
  var TEXT_NODE: js.Number = _
  var ELEMENT_NODE: js.Number = _
  var COMMENT_NODE: js.Number = _
  var DOCUMENT_POSITION_DISCONNECTED: js.Number = _
  var DOCUMENT_POSITION_CONTAINED_BY: js.Number = _
  var DOCUMENT_POSITION_CONTAINS: js.Number = _
  var DOCUMENT_TYPE_NODE: js.Number = _
  var DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: js.Number = _
  var DOCUMENT_NODE: js.Number = _
  var ENTITY_NODE: js.Number = _
  var PROCESSING_INSTRUCTION_NODE: js.Number = _
  var CDATA_SECTION_NODE: js.Number = _
  var NOTATION_NODE: js.Number = _
  var DOCUMENT_POSITION_FOLLOWING: js.Number = _
  var DOCUMENT_POSITION_PRECEDING: js.Number = _
}

trait SVGPathSegCurvetoQuadraticSmoothRel extends SVGPathSeg {
  var y: js.Number = _
  var x: js.Number = _
}

object SVGPathSegCurvetoQuadraticSmoothRel extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGPathSegCurvetoQuadraticSmoothRel),List())))) */
}

trait DOML2DeprecatedListSpaceReduction extends js.Object {
  var compact: js.Boolean = _
}

trait MSScriptHost extends js.Object {
}

object MSScriptHost extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSScriptHost),List())))) */
}

trait SVGClipPathElement extends SVGElement with SVGUnitTypes with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
  var clipPathUnits: SVGAnimatedEnumeration = _
}

object SVGClipPathElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGClipPathElement),List())))) */
}

trait MouseEvent extends UIEvent {
  var toElement: Element = _
  var layerY: js.Number = _
  var fromElement: Element = _
  var which: js.Number = _
  var pageX: js.Number = _
  var offsetY: js.Number = _
  var x: js.Number = _
  var y: js.Number = _
  var metaKey: js.Boolean = _
  var altKey: js.Boolean = _
  var ctrlKey: js.Boolean = _
  var offsetX: js.Number = _
  var screenX: js.Number = _
  var clientY: js.Number = _
  var shiftKey: js.Boolean = _
  var layerX: js.Number = _
  var screenY: js.Number = _
  var relatedTarget: EventTarget = _
  var button: js.Number = _
  var pageY: js.Number = _
  var buttons: js.Number = _
  var clientX: js.Number = _
  def initMouseEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, viewArg: Window, detailArg: js.Number, screenXArg: js.Number, screenYArg: js.Number, clientXArg: js.Number, clientYArg: js.Number, ctrlKeyArg: js.Boolean, altKeyArg: js.Boolean, shiftKeyArg: js.Boolean, metaKeyArg: js.Boolean, buttonArg: js.Number, relatedTargetArg: EventTarget): Unit = ???
  def getModifierState(keyArg: js.String): js.Boolean = ???
}

object MouseEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MouseEvent),List())))) */
}

trait RangeException extends js.Object {
  var code: js.Number = _
  var message: js.String = _
  
  var INVALID_NODE_TYPE_ERR: js.Number = _
  var BAD_BOUNDARYPOINTS_ERR: js.Number = _
  var name: js.String = _
}

object RangeException extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(RangeException),List())))) */
  var INVALID_NODE_TYPE_ERR: js.Number = _
  var BAD_BOUNDARYPOINTS_ERR: js.Number = _
}

trait SVGTextPositioningElement extends SVGTextContentElement {
  var y: SVGAnimatedLengthList = _
  var rotate: SVGAnimatedNumberList = _
  var dy: SVGAnimatedLengthList = _
  var x: SVGAnimatedLengthList = _
  var dx: SVGAnimatedLengthList = _
}

object SVGTextPositioningElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGTextPositioningElement),List())))) */
}

trait HTMLAppletElement extends HTMLElement with DOML2DeprecatedMarginStyle with DOML2DeprecatedBorderStyle with DOML2DeprecatedAlignmentStyle with MSDataBindingExtensions with MSDataBindingRecordSetExtensions {
  var width: js.Number = _
  var codeType: js.String = _
  var `object`: js.String = _
  var form: HTMLFormElement = _
  var code: js.String = _
  var archive: js.String = _
  var alt: js.String = _
  var standby: js.String = _
  var classid: js.String = _
  var name: js.String = _
  var useMap: js.String = _
  var data: js.String = _
  var height: js.String = _
  var altHtml: js.String = _
  var contentDocument: Document = _
  var codeBase: js.String = _
  var declare: js.Boolean = _
  var `type`: js.String = _
  var BaseHref: js.String = _
}

object HTMLAppletElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLAppletElement),List())))) */
}

trait TextMetrics extends js.Object {
  var width: js.Number = _
}

object TextMetrics extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(TextMetrics),List())))) */
}

trait DocumentEvent extends js.Object {
  def createEvent(eventInterface: js.String): Event = ???
}

trait HTMLOListElement extends HTMLElement with DOML2DeprecatedListSpaceReduction with DOML2DeprecatedListNumberingAndBulletStyle {
  var start: js.Number = _
}

object HTMLOListElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLOListElement),List())))) */
}

trait SVGPathSegLinetoVerticalRel extends SVGPathSeg {
  var y: js.Number = _
}

object SVGPathSegLinetoVerticalRel extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGPathSegLinetoVerticalRel),List())))) */
}

trait SVGAnimatedString extends js.Object {
  var animVal: js.String = _
  var baseVal: js.String = _
}

object SVGAnimatedString extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGAnimatedString),List())))) */
}

trait CDATASection extends Text {
}

object CDATASection extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(CDATASection),List())))) */
}

trait StyleMedia extends js.Object {
  var `type`: js.String = _
  def matchMedium(mediaquery: js.String): js.Boolean = ???
}

object StyleMedia extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(StyleMedia),List())))) */
}

trait HTMLSelectElement extends HTMLElement with MSHTMLCollectionExtensions with MSDataBindingExtensions {
  var options: HTMLSelectElement = _
  var value: js.String = _
  var form: HTMLFormElement = _
  var name: js.String = _
  var size: js.Number = _
  var length: js.Number = _
  var selectedIndex: js.Number = _
  var multiple: js.Boolean = _
  var `type`: js.String = _
  def remove(index: js.Number): Unit = ???
  def remove(): Unit = ???
  def add(element: HTMLElement, before: js.Any): Unit = ???
  def add(element: HTMLElement): Unit = ???
  def item(name: js.Any, index: js.Any): js.Dynamic = ???
  def item(name: js.Any): js.Dynamic = ???
  def item(): js.Dynamic = ???
  def namedItem(name: js.String): js.Dynamic = ???
  @scala.js.annotation.JSBracketAccess
  def apply(name: js.String): js.Any = ???
  @scala.js.annotation.JSBracketAccess
  def update(name: js.String, v: js.Any): Unit = ???
  var validationMessage: js.String = _
  var autofocus: js.Boolean = _
  var validity: ValidityState = _
  var required: js.Boolean = _
  var willValidate: js.Boolean = _
  def checkValidity(): js.Boolean = ???
  def setCustomValidity(error: js.String): Unit = ???
}

object HTMLSelectElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLSelectElement),List())))) */
}

trait TextRange extends js.Object {
  var boundingLeft: js.Number = _
  var htmlText: js.String = _
  var offsetLeft: js.Number = _
  var boundingWidth: js.Number = _
  var boundingHeight: js.Number = _
  var boundingTop: js.Number = _
  var text: js.String = _
  var offsetTop: js.Number = _
  def moveToPoint(x: js.Number, y: js.Number): Unit = ???
  def queryCommandValue(cmdID: js.String): js.Dynamic = ???
  def getBookmark(): js.String = ???
  def move(unit: js.String, count: js.Number): js.Number = ???
  def move(unit: js.String): js.Number = ???
  def queryCommandIndeterm(cmdID: js.String): js.Boolean = ???
  def scrollIntoView(fStart: js.Boolean): Unit = ???
  def scrollIntoView(): Unit = ???
  def findText(string: js.String, count: js.Number, flags: js.Number): js.Boolean = ???
  def findText(string: js.String, count: js.Number): js.Boolean = ???
  def findText(string: js.String): js.Boolean = ???
  def execCommand(cmdID: js.String, showUI: js.Boolean, value: js.Any): js.Boolean = ???
  def execCommand(cmdID: js.String, showUI: js.Boolean): js.Boolean = ???
  def execCommand(cmdID: js.String): js.Boolean = ???
  def getBoundingClientRect(): ClientRect = ???
  def moveToBookmark(bookmark: js.String): js.Boolean = ???
  def isEqual(range: TextRange): js.Boolean = ???
  def duplicate(): TextRange = ???
  def collapse(start: js.Boolean): Unit = ???
  def collapse(): Unit = ???
  def queryCommandText(cmdID: js.String): js.String = ???
  def select(): Unit = ???
  def pasteHTML(html: js.String): Unit = ???
  def inRange(range: TextRange): js.Boolean = ???
  def moveEnd(unit: js.String, count: js.Number): js.Number = ???
  def moveEnd(unit: js.String): js.Number = ???
  def getClientRects(): ClientRectList = ???
  def moveStart(unit: js.String, count: js.Number): js.Number = ???
  def moveStart(unit: js.String): js.Number = ???
  def parentElement(): Element = ???
  def queryCommandState(cmdID: js.String): js.Boolean = ???
  def compareEndPoints(how: js.String, sourceRange: TextRange): js.Number = ???
  def execCommandShowHelp(cmdID: js.String): js.Boolean = ???
  def moveToElementText(element: Element): Unit = ???
  def expand(Unit: js.String): js.Boolean = ???
  def queryCommandSupported(cmdID: js.String): js.Boolean = ???
  def setEndPoint(how: js.String, SourceRange: TextRange): Unit = ???
  def queryCommandEnabled(cmdID: js.String): js.Boolean = ???
}

object TextRange extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(TextRange),List())))) */
}

trait SVGTests extends js.Object {
  var requiredFeatures: SVGStringList = _
  var requiredExtensions: SVGStringList = _
  var systemLanguage: SVGStringList = _
  def hasExtension(extension: js.String): js.Boolean = ???
}

trait HTMLBlockElement extends HTMLElement with DOML2DeprecatedTextFlowControl {
  var width: js.Number = _
  var cite: js.String = _
}

object HTMLBlockElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLBlockElement),List())))) */
}

trait CSSStyleSheet extends StyleSheet {
  var owningElement: Element = _
  var imports: StyleSheetList = _
  var isAlternate: js.Boolean = _
  var rules: MSCSSRuleList = _
  var isPrefAlternate: js.Boolean = _
  var readOnly: js.Boolean = _
  var cssText: js.String = _
  var ownerRule: CSSRule = _
  var href: js.String = _
  var cssRules: CSSRuleList = _
  var id: js.String = _
  var pages: StyleSheetPageList = _
  def addImport(bstrURL: js.String, lIndex: js.Number): js.Number = ???
  def addImport(bstrURL: js.String): js.Number = ???
  def addPageRule(bstrSelector: js.String, bstrStyle: js.String, lIndex: js.Number): js.Number = ???
  def addPageRule(bstrSelector: js.String, bstrStyle: js.String): js.Number = ???
  def insertRule(rule: js.String, index: js.Number): js.Number = ???
  def insertRule(rule: js.String): js.Number = ???
  def removeRule(lIndex: js.Number): Unit = ???
  def deleteRule(index: js.Number): Unit = ???
  def deleteRule(): Unit = ???
  def addRule(bstrSelector: js.String, bstrStyle: js.String, lIndex: js.Number): js.Number = ???
  def addRule(bstrSelector: js.String, bstrStyle: js.String): js.Number = ???
  def addRule(bstrSelector: js.String): js.Number = ???
  def removeImport(lIndex: js.Number): Unit = ???
}

object CSSStyleSheet extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(CSSStyleSheet),List())))) */
}

trait MSSelection extends js.Object {
  var `type`: js.String = _
  var typeDetail: js.String = _
  def createRange(): TextRange = ???
  def clear(): Unit = ???
  def createRangeCollection(): TextRangeCollection = ???
  def empty(): Unit = ???
}

object MSSelection extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSSelection),List())))) */
}

trait HTMLMetaElement extends HTMLElement {
  var httpEquiv: js.String = _
  var name: js.String = _
  var content: js.String = _
  var url: js.String = _
  var scheme: js.String = _
  var charset: js.String = _
}

object HTMLMetaElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLMetaElement),List())))) */
}

trait SVGPatternElement extends SVGElement with SVGUnitTypes with SVGStylable with SVGLangSpace with SVGTests with SVGFitToViewBox with SVGExternalResourcesRequired with SVGURIReference {
  var patternUnits: SVGAnimatedEnumeration = _
  var y: SVGAnimatedLength = _
  var width: SVGAnimatedLength = _
  var x: SVGAnimatedLength = _
  var patternContentUnits: SVGAnimatedEnumeration = _
  var patternTransform: SVGAnimatedTransformList = _
  var height: SVGAnimatedLength = _
}

object SVGPatternElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGPatternElement),List())))) */
}

trait SVGAnimatedAngle extends js.Object {
  var animVal: SVGAngle = _
  var baseVal: SVGAngle = _
}

object SVGAnimatedAngle extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGAnimatedAngle),List())))) */
}

trait Selection extends js.Object {
  var isCollapsed: js.Boolean = _
  var anchorNode: Node = _
  var focusNode: Node = _
  var anchorOffset: js.Number = _
  var focusOffset: js.Number = _
  var rangeCount: js.Number = _
  def addRange(range: Range): Unit = ???
  def collapseToEnd(): Unit = ???
  
  def selectAllChildren(parentNode: Node): Unit = ???
  def getRangeAt(index: js.Number): Range = ???
  def collapse(parentNode: Node, offset: js.Number): Unit = ???
  def removeAllRanges(): Unit = ???
  def collapseToStart(): Unit = ???
  def deleteFromDocument(): Unit = ???
  def removeRange(range: Range): Unit = ???
}

object Selection extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Selection),List())))) */
}

trait SVGScriptElement extends SVGElement with SVGExternalResourcesRequired with SVGURIReference {
  var `type`: js.String = _
}

object SVGScriptElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGScriptElement),List())))) */
}

trait HTMLDDElement extends HTMLElement {
  var noWrap: js.Boolean = _
}

object HTMLDDElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLDDElement),List())))) */
}

trait MSDataBindingRecordSetReadonlyExtensions extends js.Object {
  var recordset: Object = _
  def namedRecordset(dataMember: js.String, hierarchy: js.Any): Object = ???
  def namedRecordset(dataMember: js.String): Object = ???
}

trait CSSStyleRule extends CSSRule {
  var selectorText: js.String = _
  var style: MSStyleCSSProperties = _
  var readOnly: js.Boolean = _
}

object CSSStyleRule extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(CSSStyleRule),List())))) */
}

trait NodeIterator extends js.Object {
  var whatToShow: js.Number = _
  var filter: NodeFilter = _
  var root: Node = _
  var expandEntityReferences: js.Boolean = _
  def nextNode(): Node = ???
  def detach(): Unit = ???
  def previousNode(): Node = ???
}

object NodeIterator extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(NodeIterator),List())))) */
}

trait SVGViewElement extends SVGElement with SVGZoomAndPan with SVGFitToViewBox with SVGExternalResourcesRequired {
  var viewTarget: SVGStringList = _
}

object SVGViewElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGViewElement),List())))) */
}

trait HTMLLinkElement extends HTMLElement with LinkStyle {
  var rel: js.String = _
  var target: js.String = _
  var href: js.String = _
  var media: js.String = _
  var rev: js.String = _
  var `type`: js.String = _
  var charset: js.String = _
  var hreflang: js.String = _
}

object HTMLLinkElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLLinkElement),List())))) */
}

trait SVGLocatable extends js.Object {
  var farthestViewportElement: SVGElement = _
  var nearestViewportElement: SVGElement = _
  def getBBox(): SVGRect = ???
  def getTransformToElement(element: SVGElement): SVGMatrix = ???
  def getCTM(): SVGMatrix = ???
  def getScreenCTM(): SVGMatrix = ???
}

trait HTMLFontElement extends HTMLElement with DOML2DeprecatedColorProperty with DOML2DeprecatedSizeProperty {
  var face: js.String = _
}

object HTMLFontElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLFontElement),List())))) */
}

trait SVGTitleElement extends SVGElement with SVGStylable with SVGLangSpace {
}

object SVGTitleElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGTitleElement),List())))) */
}

trait ControlRangeCollection extends js.Object {
  var length: js.Number = _
  def queryCommandValue(cmdID: js.String): js.Dynamic = ???
  def remove(index: js.Number): Unit = ???
  def add(item: Element): Unit = ???
  def queryCommandIndeterm(cmdID: js.String): js.Boolean = ???
  def scrollIntoView(varargStart: js.Any): Unit = ???
  def scrollIntoView(): Unit = ???
  def item(index: js.Number): Element = ???
  @scala.js.annotation.JSBracketAccess
  def apply(index: js.Number): Element = ???
  @scala.js.annotation.JSBracketAccess
  def update(index: js.Number, v: Element): Unit = ???
  def execCommand(cmdID: js.String, showUI: js.Boolean, value: js.Any): js.Boolean = ???
  def execCommand(cmdID: js.String, showUI: js.Boolean): js.Boolean = ???
  def execCommand(cmdID: js.String): js.Boolean = ???
  def addElement(item: Element): Unit = ???
  def queryCommandState(cmdID: js.String): js.Boolean = ???
  def queryCommandSupported(cmdID: js.String): js.Boolean = ???
  def queryCommandEnabled(cmdID: js.String): js.Boolean = ???
  def queryCommandText(cmdID: js.String): js.String = ???
  def select(): Unit = ???
}

object ControlRangeCollection extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(ControlRangeCollection),List())))) */
}

trait MSNamespaceInfo extends MSEventAttachmentTarget {
  var urn: js.String = _
  var onreadystatechange: js.Function1[Event, js.Any] = _
  var name: js.String = _
  var readyState: js.String = _
  def doImport(implementationUrl: js.String): Unit = ???
  def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}

object MSNamespaceInfo extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSNamespaceInfo),List())))) */
}

trait WindowSessionStorage extends js.Object {
  var sessionStorage: Storage = _
}

trait SVGAnimatedTransformList extends js.Object {
  var animVal: SVGTransformList = _
  var baseVal: SVGTransformList = _
}

object SVGAnimatedTransformList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGAnimatedTransformList),List())))) */
}

trait HTMLTableCaptionElement extends HTMLElement {
  var align: js.String = _
  var vAlign: js.String = _
}

object HTMLTableCaptionElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLTableCaptionElement),List())))) */
}

trait HTMLOptionElement extends HTMLElement with MSDataBindingExtensions {
  var index: js.Number = _
  var defaultSelected: js.Boolean = _
  var value: js.String = _
  var text: js.String = _
  var form: HTMLFormElement = _
  var label: js.String = _
  var selected: js.Boolean = _
  def create(): HTMLOptionElement = ???
}

object HTMLOptionElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLOptionElement),List())))) */
}

trait HTMLMapElement extends HTMLElement {
  var name: js.String = _
  var areas: HTMLAreasCollection = _
}

object HTMLMapElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLMapElement),List())))) */
}

trait HTMLMenuElement extends HTMLElement with DOML2DeprecatedListSpaceReduction {
  var `type`: js.String = _
}

object HTMLMenuElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLMenuElement),List())))) */
}

trait MouseWheelEvent extends MouseEvent {
  var wheelDelta: js.Number = _
  def initMouseWheelEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, viewArg: Window, detailArg: js.Number, screenXArg: js.Number, screenYArg: js.Number, clientXArg: js.Number, clientYArg: js.Number, buttonArg: js.Number, relatedTargetArg: EventTarget, modifiersListArg: js.String, wheelDeltaArg: js.Number): Unit = ???
}

object MouseWheelEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MouseWheelEvent),List())))) */
}

trait SVGFitToViewBox extends js.Object {
  var viewBox: SVGAnimatedRect = _
  var preserveAspectRatio: SVGAnimatedPreserveAspectRatio = _
}

trait SVGPointList extends js.Object {
  var numberOfItems: js.Number = _
  def replaceItem(newItem: SVGPoint, index: js.Number): SVGPoint = ???
  def getItem(index: js.Number): SVGPoint = ???
  def clear(): Unit = ???
  def appendItem(newItem: SVGPoint): SVGPoint = ???
  def initialize(newItem: SVGPoint): SVGPoint = ???
  def removeItem(index: js.Number): SVGPoint = ???
  def insertItemBefore(newItem: SVGPoint, index: js.Number): SVGPoint = ???
}

object SVGPointList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGPointList),List())))) */
}

trait SVGAnimatedLengthList extends js.Object {
  var animVal: SVGLengthList = _
  var baseVal: SVGLengthList = _
}

object SVGAnimatedLengthList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGAnimatedLengthList),List())))) */
}

trait Window extends EventTarget with MSEventAttachmentTarget with WindowLocalStorage with MSWindowExtensions with WindowSessionStorage with WindowTimers with WindowBase64 with IDBEnvironment with WindowConsole {
  var ondragend: js.Function1[DragEvent, js.Any] = _
  var onkeydown: js.Function1[KeyboardEvent, js.Any] = _
  var ondragover: js.Function1[DragEvent, js.Any] = _
  var onkeyup: js.Function1[KeyboardEvent, js.Any] = _
  var onreset: js.Function1[Event, js.Any] = _
  var onmouseup: js.Function1[MouseEvent, js.Any] = _
  var ondragstart: js.Function1[DragEvent, js.Any] = _
  var ondrag: js.Function1[DragEvent, js.Any] = _
  var screenX: js.Number = _
  var onmouseover: js.Function1[MouseEvent, js.Any] = _
  var ondragleave: js.Function1[DragEvent, js.Any] = _
  var history: History = _
  var pageXOffset: js.Number = _
  var name: js.String = _
  var onafterprint: js.Function1[Event, js.Any] = _
  var onpause: js.Function1[Event, js.Any] = _
  var onbeforeprint: js.Function1[Event, js.Any] = _
  var top: Window = _
  var onmousedown: js.Function1[MouseEvent, js.Any] = _
  var onseeked: js.Function1[Event, js.Any] = _
  var opener: Window = _
  var onclick: js.Function1[MouseEvent, js.Any] = _
  var innerHeight: js.Number = _
  var onwaiting: js.Function1[Event, js.Any] = _
  var ononline: js.Function1[Event, js.Any] = _
  var ondurationchange: js.Function1[Event, js.Any] = _
  var frames: Window = _
  var onblur: js.Function1[FocusEvent, js.Any] = _
  var onemptied: js.Function1[Event, js.Any] = _
  var onseeking: js.Function1[Event, js.Any] = _
  var oncanplay: js.Function1[Event, js.Any] = _
  var outerWidth: js.Number = _
  var onstalled: js.Function1[Event, js.Any] = _
  var onmousemove: js.Function1[MouseEvent, js.Any] = _
  var innerWidth: js.Number = _
  var onoffline: js.Function1[Event, js.Any] = _
  var length: js.Number = _
  var screen: Screen = _
  var onbeforeunload: js.Function1[BeforeUnloadEvent, js.Any] = _
  var onratechange: js.Function1[Event, js.Any] = _
  var onstorage: js.Function1[StorageEvent, js.Any] = _
  var onloadstart: js.Function1[Event, js.Any] = _
  var ondragenter: js.Function1[DragEvent, js.Any] = _
  var onsubmit: js.Function1[Event, js.Any] = _
  var self: Window = _
  var document: Document = _
  var onprogress: js.Function1[js.Any, js.Any] = _
  var ondblclick: js.Function1[MouseEvent, js.Any] = _
  var pageYOffset: js.Number = _
  var oncontextmenu: js.Function1[MouseEvent, js.Any] = _
  var onchange: js.Function1[Event, js.Any] = _
  var onloadedmetadata: js.Function1[Event, js.Any] = _
  var onplay: js.Function1[Event, js.Any] = _
  var onerror: ErrorEventHandler = _
  var onplaying: js.Function1[Event, js.Any] = _
  var parent: Window = _
  var location: Location = _
  var oncanplaythrough: js.Function1[Event, js.Any] = _
  var onabort: js.Function1[UIEvent, js.Any] = _
  var onreadystatechange: js.Function1[Event, js.Any] = _
  var outerHeight: js.Number = _
  var onkeypress: js.Function1[KeyboardEvent, js.Any] = _
  var frameElement: Element = _
  var onloadeddata: js.Function1[Event, js.Any] = _
  var onsuspend: js.Function1[Event, js.Any] = _
  var window: Window = _
  var onfocus: js.Function1[FocusEvent, js.Any] = _
  var onmessage: js.Function1[MessageEvent, js.Any] = _
  var ontimeupdate: js.Function1[Event, js.Any] = _
  var onresize: js.Function1[UIEvent, js.Any] = _
  var onselect: js.Function1[UIEvent, js.Any] = _
  var navigator: Navigator = _
  var styleMedia: StyleMedia = _
  var ondrop: js.Function1[DragEvent, js.Any] = _
  var onmouseout: js.Function1[MouseEvent, js.Any] = _
  var onended: js.Function1[Event, js.Any] = _
  var onhashchange: js.Function1[Event, js.Any] = _
  var onunload: js.Function1[Event, js.Any] = _
  var onscroll: js.Function1[UIEvent, js.Any] = _
  var screenY: js.Number = _
  var onmousewheel: js.Function1[MouseWheelEvent, js.Any] = _
  var onload: js.Function1[Event, js.Any] = _
  var onvolumechange: js.Function1[Event, js.Any] = _
  var oninput: js.Function1[Event, js.Any] = _
  var performance: Performance = _
  def alert(message: js.String): Unit = ???
  def alert(): Unit = ???
  def scroll(x: js.Number, y: js.Number): Unit = ???
  def scroll(x: js.Number): Unit = ???
  def scroll(): Unit = ???
  def focus(): Unit = ???
  def scrollTo(x: js.Number, y: js.Number): Unit = ???
  def scrollTo(x: js.Number): Unit = ???
  def scrollTo(): Unit = ???
  def print(): Unit = ???
  def prompt(message: js.String, defaul: js.String): js.String = ???
  def prompt(message: js.String): js.String = ???
  def prompt(): js.String = ???
  
  def open(url: js.String, target: js.String, features: js.String, replace: js.Boolean): Window = ???
  def open(url: js.String, target: js.String, features: js.String): Window = ???
  def open(url: js.String, target: js.String): Window = ???
  def open(url: js.String): Window = ???
  def open(): Window = ???
  def scrollBy(x: js.Number, y: js.Number): Unit = ???
  def scrollBy(x: js.Number): Unit = ???
  def scrollBy(): Unit = ???
  def confirm(message: js.String): js.Boolean = ???
  def confirm(): js.Boolean = ???
  def close(): Unit = ???
  def postMessage(message: js.Any, targetOrigin: js.String, ports: js.Any): Unit = ???
  def postMessage(message: js.Any, targetOrigin: js.String): Unit = ???
  def showModalDialog(url: js.String, argument: js.Any, options: js.Any): js.Dynamic = ???
  def showModalDialog(url: js.String, argument: js.Any): js.Dynamic = ???
  def showModalDialog(url: js.String): js.Dynamic = ???
  def showModalDialog(): js.Dynamic = ???
  def blur(): Unit = ???
  def getSelection(): Selection = ???
  def getComputedStyle(elt: Element, pseudoElt: js.String): CSSStyleDeclaration = ???
  def getComputedStyle(elt: Element): CSSStyleDeclaration = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
  var onmspointerdown: js.Function1[js.Any, js.Any] = _
  var animationStartTime: js.Number = _
  var onmsgesturedoubletap: js.Function1[js.Any, js.Any] = _
  var onmspointerhover: js.Function1[js.Any, js.Any] = _
  var onmsgesturehold: js.Function1[js.Any, js.Any] = _
  var onmspointermove: js.Function1[js.Any, js.Any] = _
  var onmsgesturechange: js.Function1[js.Any, js.Any] = _
  var onmsgesturestart: js.Function1[js.Any, js.Any] = _
  var onmspointercancel: js.Function1[js.Any, js.Any] = _
  var onmsgestureend: js.Function1[js.Any, js.Any] = _
  var onmsgesturetap: js.Function1[js.Any, js.Any] = _
  var onmspointerout: js.Function1[js.Any, js.Any] = _
  var msAnimationStartTime: js.Number = _
  var applicationCache: ApplicationCache = _
  var onmsinertiastart: js.Function1[js.Any, js.Any] = _
  var onmspointerover: js.Function1[js.Any, js.Any] = _
  var onpopstate: js.Function1[PopStateEvent, js.Any] = _
  var onmspointerup: js.Function1[js.Any, js.Any] = _
  def msCancelRequestAnimationFrame(handle: js.Number): Unit = ???
  def matchMedia(mediaQuery: js.String): MediaQueryList = ???
  def cancelAnimationFrame(handle: js.Number): Unit = ???
  def msIsStaticHTML(html: js.String): js.Boolean = ???
  def msMatchMedia(mediaQuery: js.String): MediaQueryList = ???
  def requestAnimationFrame(callback: FrameRequestCallback): js.Number = ???
  def msRequestAnimationFrame(callback: FrameRequestCallback): js.Number = ???
}

object Window extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Window),List())))) */
}

trait SVGAnimatedPreserveAspectRatio extends js.Object {
  var animVal: SVGPreserveAspectRatio = _
  var baseVal: SVGPreserveAspectRatio = _
}

object SVGAnimatedPreserveAspectRatio extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGAnimatedPreserveAspectRatio),List())))) */
}

trait MSSiteModeEvent extends Event {
  var buttonID: js.Number = _
  var actionURL: js.String = _
}

object MSSiteModeEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSSiteModeEvent),List())))) */
}

trait DOML2DeprecatedTextFlowControl extends js.Object {
  var clear: js.String = _
}

trait StyleSheetPageList extends js.Object {
  var length: js.Number = _
  def item(index: js.Number): CSSPageRule = ???
  @scala.js.annotation.JSBracketAccess
  def apply(index: js.Number): CSSPageRule = ???
  @scala.js.annotation.JSBracketAccess
  def update(index: js.Number, v: CSSPageRule): Unit = ???
}

object StyleSheetPageList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(StyleSheetPageList),List())))) */
}

trait MSCSSProperties extends CSSStyleDeclaration {
  var scrollbarShadowColor: js.String = _
  var scrollbarHighlightColor: js.String = _
  var layoutGridChar: js.String = _
  var layoutGridType: js.String = _
  var textAutospace: js.String = _
  var textKashidaSpace: js.String = _
  var writingMode: js.String = _
  var scrollbarFaceColor: js.String = _
  var backgroundPositionY: js.String = _
  var lineBreak: js.String = _
  var imeMode: js.String = _
  var msBlockProgression: js.String = _
  var layoutGridLine: js.String = _
  var scrollbarBaseColor: js.String = _
  var layoutGrid: js.String = _
  var layoutFlow: js.String = _
  var textKashida: js.String = _
  var filter: js.String = _
  var zoom: js.String = _
  var scrollbarArrowColor: js.String = _
  var behavior: js.String = _
  var backgroundPositionX: js.String = _
  var accelerator: js.String = _
  var layoutGridMode: js.String = _
  var textJustifyTrim: js.String = _
  var scrollbar3dLightColor: js.String = _
  var msInterpolationMode: js.String = _
  var scrollbarTrackColor: js.String = _
  var scrollbarDarkShadowColor: js.String = _
  var styleFloat: js.String = _
  def getAttribute(attributeName: js.String, flags: js.Number): js.Dynamic = ???
  def getAttribute(attributeName: js.String): js.Dynamic = ???
  def setAttribute(attributeName: js.String, AttributeValue: js.Any, flags: js.Number): Unit = ???
  def setAttribute(attributeName: js.String, AttributeValue: js.Any): Unit = ???
  def removeAttribute(attributeName: js.String, flags: js.Number): js.Boolean = ???
  def removeAttribute(attributeName: js.String): js.Boolean = ???
}

object MSCSSProperties extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSCSSProperties),List())))) */
}

trait HTMLCollection extends MSHTMLCollectionExtensions {
  var length: js.Number = _
  def item(nameOrIndex: js.Any, optionalIndex: js.Any): Element = ???
  def item(nameOrIndex: js.Any): Element = ???
  def item(): Element = ???
  def namedItem(name: js.String): Element = ???
  @scala.js.annotation.JSBracketAccess
  def apply(name: js.Number): Element = ???
  @scala.js.annotation.JSBracketAccess
  def update(name: js.Number, v: Element): Unit = ???
}

object HTMLCollection extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLCollection),List())))) */
}

trait SVGExternalResourcesRequired extends js.Object {
  var externalResourcesRequired: SVGAnimatedBoolean = _
}

trait HTMLImageElement extends HTMLElement with MSImageResourceExtensions with MSDataBindingExtensions with MSResourceMetadata {
  var width: js.Number = _
  var vspace: js.Number = _
  var naturalHeight: js.Number = _
  var alt: js.String = _
  var align: js.String = _
  var src: js.String = _
  var useMap: js.String = _
  var naturalWidth: js.Number = _
  var name: js.String = _
  var height: js.Number = _
  var border: js.String = _
  var hspace: js.Number = _
  var longDesc: js.String = _
  var href: js.String = _
  var isMap: js.Boolean = _
  var complete: js.Boolean = _
  def create(): HTMLImageElement = ???
  var msPlayToPrimary: js.Boolean = _
  var msPlayToDisabled: js.Boolean = _
  var msPlayToSource: js.Any = _
}

object HTMLImageElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLImageElement),List())))) */
}

trait HTMLAreaElement extends HTMLElement {
  var protocol: js.String = _
  var search: js.String = _
  var alt: js.String = _
  var coords: js.String = _
  var hostname: js.String = _
  var port: js.String = _
  var pathname: js.String = _
  var host: js.String = _
  var hash: js.String = _
  var target: js.String = _
  var href: js.String = _
  var noHref: js.Boolean = _
  var shape: js.String = _
  
}

object HTMLAreaElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLAreaElement),List())))) */
}

trait EventTarget extends js.Object {
  def removeEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  def removeEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
  def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
  def dispatchEvent(evt: Event): js.Boolean = ???
}

trait SVGAngle extends js.Object {
  var valueAsString: js.String = _
  var valueInSpecifiedUnits: js.Number = _
  var value: js.Number = _
  var unitType: js.Number = _
  def newValueSpecifiedUnits(unitType: js.Number, valueInSpecifiedUnits: js.Number): Unit = ???
  def convertToSpecifiedUnits(unitType: js.Number): Unit = ???
  var SVG_ANGLETYPE_RAD: js.Number = _
  var SVG_ANGLETYPE_UNKNOWN: js.Number = _
  var SVG_ANGLETYPE_UNSPECIFIED: js.Number = _
  var SVG_ANGLETYPE_DEG: js.Number = _
  var SVG_ANGLETYPE_GRAD: js.Number = _
}

object SVGAngle extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGAngle),List())))) */
  var SVG_ANGLETYPE_RAD: js.Number = _
  var SVG_ANGLETYPE_UNKNOWN: js.Number = _
  var SVG_ANGLETYPE_UNSPECIFIED: js.Number = _
  var SVG_ANGLETYPE_DEG: js.Number = _
  var SVG_ANGLETYPE_GRAD: js.Number = _
}

trait HTMLButtonElement extends HTMLElement with MSDataBindingExtensions {
  var value: js.String = _
  var status: js.Any = _
  var form: HTMLFormElement = _
  var name: js.String = _
  var `type`: js.String = _
  def createTextRange(): TextRange = ???
  var validationMessage: js.String = _
  var formTarget: js.String = _
  var willValidate: js.Boolean = _
  var formAction: js.String = _
  var autofocus: js.Boolean = _
  var validity: ValidityState = _
  var formNoValidate: js.String = _
  var formEnctype: js.String = _
  var formMethod: js.String = _
  def checkValidity(): js.Boolean = ???
  def setCustomValidity(error: js.String): Unit = ???
}

object HTMLButtonElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLButtonElement),List())))) */
}

trait HTMLSourceElement extends HTMLElement {
  var src: js.String = _
  var media: js.String = _
  var `type`: js.String = _
}

object HTMLSourceElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLSourceElement),List())))) */
}

trait CanvasGradient extends js.Object {
  def addColorStop(offset: js.Number, color: js.String): Unit = ???
}

object CanvasGradient extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(CanvasGradient),List())))) */
}

trait KeyboardEvent extends UIEvent {
  var location: js.Number = _
  var keyCode: js.Number = _
  var shiftKey: js.Boolean = _
  var which: js.Number = _
  var locale: js.String = _
  var key: js.String = _
  var altKey: js.Boolean = _
  var metaKey: js.Boolean = _
  var char: js.String = _
  var ctrlKey: js.Boolean = _
  var repeat: js.Boolean = _
  var charCode: js.Number = _
  def getModifierState(keyArg: js.String): js.Boolean = ???
  def initKeyboardEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, viewArg: Window, keyArg: js.String, locationArg: js.Number, modifiersListArg: js.String, repeat: js.Boolean, locale: js.String): Unit = ???
  var DOM_KEY_LOCATION_RIGHT: js.Number = _
  var DOM_KEY_LOCATION_STANDARD: js.Number = _
  var DOM_KEY_LOCATION_LEFT: js.Number = _
  var DOM_KEY_LOCATION_NUMPAD: js.Number = _
  var DOM_KEY_LOCATION_JOYSTICK: js.Number = _
  var DOM_KEY_LOCATION_MOBILE: js.Number = _
}

object KeyboardEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(KeyboardEvent),List())))) */
  var DOM_KEY_LOCATION_RIGHT: js.Number = _
  var DOM_KEY_LOCATION_STANDARD: js.Number = _
  var DOM_KEY_LOCATION_LEFT: js.Number = _
  var DOM_KEY_LOCATION_NUMPAD: js.Number = _
  var DOM_KEY_LOCATION_JOYSTICK: js.Number = _
  var DOM_KEY_LOCATION_MOBILE: js.Number = _
}

trait Document extends Node with NodeSelector with MSEventAttachmentTarget with DocumentEvent with MSResourceMetadata with MSNodeExtensions {
  var compatible: MSCompatibleInfoCollection = _
  var onkeydown: js.Function1[KeyboardEvent, js.Any] = _
  var onkeyup: js.Function1[KeyboardEvent, js.Any] = _
  var implementation: DOMImplementation = _
  var onreset: js.Function1[Event, js.Any] = _
  var scripts: HTMLCollection = _
  var onhelp: js.Function1[Event, js.Any] = _
  var ondragleave: js.Function1[DragEvent, js.Any] = _
  var charset: js.String = _
  var onfocusin: js.Function1[FocusEvent, js.Any] = _
  var vlinkColor: js.String = _
  var onseeked: js.Function1[Event, js.Any] = _
  var security: js.String = _
  var title: js.String = _
  var namespaces: MSNamespaceInfoCollection = _
  var defaultCharset: js.String = _
  var embeds: HTMLCollection = _
  var styleSheets: StyleSheetList = _
  var frames: Window = _
  var ondurationchange: js.Function1[Event, js.Any] = _
  var all: HTMLCollection = _
  var forms: HTMLCollection = _
  var onblur: js.Function1[FocusEvent, js.Any] = _
  var dir: js.String = _
  var onemptied: js.Function1[Event, js.Any] = _
  var designMode: js.String = _
  var onseeking: js.Function1[Event, js.Any] = _
  var ondeactivate: js.Function1[UIEvent, js.Any] = _
  var oncanplay: js.Function1[Event, js.Any] = _
  var ondatasetchanged: js.Function1[MSEventObj, js.Any] = _
  var onrowsdelete: js.Function1[MSEventObj, js.Any] = _
  var Script: MSScriptHost = _
  var onloadstart: js.Function1[Event, js.Any] = _
  var URLUnencoded: js.String = _
  var defaultView: Window = _
  var oncontrolselect: js.Function1[MSEventObj, js.Any] = _
  var ondragenter: js.Function1[DragEvent, js.Any] = _
  var onsubmit: js.Function1[Event, js.Any] = _
  var inputEncoding: js.String = _
  var activeElement: Element = _
  var onchange: js.Function1[Event, js.Any] = _
  var links: HTMLCollection = _
  var uniqueID: js.String = _
  var URL: js.String = _
  var onbeforeactivate: js.Function1[UIEvent, js.Any] = _
  var head: HTMLHeadElement = _
  var cookie: js.String = _
  var xmlEncoding: js.String = _
  var oncanplaythrough: js.Function1[Event, js.Any] = _
  var documentMode: js.Number = _
  var characterSet: js.String = _
  var anchors: HTMLCollection = _
  var onbeforeupdate: js.Function1[MSEventObj, js.Any] = _
  var ondatasetcomplete: js.Function1[MSEventObj, js.Any] = _
  var plugins: HTMLCollection = _
  var onsuspend: js.Function1[Event, js.Any] = _
  var rootElement: SVGSVGElement = _
  var readyState: js.String = _
  var referrer: js.String = _
  var alinkColor: js.String = _
  var onerrorupdate: js.Function1[MSEventObj, js.Any] = _
  var parentWindow: Window = _
  var onmouseout: js.Function1[MouseEvent, js.Any] = _
  var onmsthumbnailclick: js.Function1[MSSiteModeEvent, js.Any] = _
  var onmousewheel: js.Function1[MouseWheelEvent, js.Any] = _
  var onvolumechange: js.Function1[Event, js.Any] = _
  var oncellchange: js.Function1[MSEventObj, js.Any] = _
  var onrowexit: js.Function1[MSEventObj, js.Any] = _
  var onrowsinserted: js.Function1[MSEventObj, js.Any] = _
  var xmlVersion: js.String = _
  var msCapsLockWarningOff: js.Boolean = _
  var onpropertychange: js.Function1[MSEventObj, js.Any] = _
  var ondragend: js.Function1[DragEvent, js.Any] = _
  var doctype: DocumentType = _
  var ondragover: js.Function1[DragEvent, js.Any] = _
  var bgColor: js.String = _
  var ondragstart: js.Function1[DragEvent, js.Any] = _
  var onmouseup: js.Function1[MouseEvent, js.Any] = _
  var ondrag: js.Function1[DragEvent, js.Any] = _
  var onmouseover: js.Function1[MouseEvent, js.Any] = _
  var linkColor: js.String = _
  var onpause: js.Function1[Event, js.Any] = _
  var onmousedown: js.Function1[MouseEvent, js.Any] = _
  var onclick: js.Function1[MouseEvent, js.Any] = _
  var onwaiting: js.Function1[Event, js.Any] = _
  var onstop: js.Function1[Event, js.Any] = _
  var onmssitemodejumplistitemremoved: js.Function1[MSSiteModeEvent, js.Any] = _
  var applets: HTMLCollection = _
  var body: HTMLElement = _
  var domain: js.String = _
  var xmlStandalone: js.Boolean = _
  var selection: MSSelection = _
  var onstalled: js.Function1[Event, js.Any] = _
  var onmousemove: js.Function1[MouseEvent, js.Any] = _
  var documentElement: Element = _
  var onbeforeeditfocus: js.Function1[MSEventObj, js.Any] = _
  var onratechange: js.Function1[Event, js.Any] = _
  var onprogress: js.Function1[js.Any, js.Any] = _
  var ondblclick: js.Function1[MouseEvent, js.Any] = _
  var oncontextmenu: js.Function1[MouseEvent, js.Any] = _
  var onloadedmetadata: js.Function1[Event, js.Any] = _
  var media: js.String = _
  var onerror: js.Function1[Event, js.Any] = _
  var onplay: js.Function1[Event, js.Any] = _
  var onafterupdate: js.Function1[MSEventObj, js.Any] = _
  var onplaying: js.Function1[Event, js.Any] = _
  var images: HTMLCollection = _
  var location: Location = _
  var onabort: js.Function1[UIEvent, js.Any] = _
  var onfocusout: js.Function1[FocusEvent, js.Any] = _
  var onselectionchange: js.Function1[Event, js.Any] = _
  var onstoragecommit: js.Function1[StorageEvent, js.Any] = _
  var ondataavailable: js.Function1[MSEventObj, js.Any] = _
  var onreadystatechange: js.Function1[Event, js.Any] = _
  var lastModified: js.String = _
  var onkeypress: js.Function1[KeyboardEvent, js.Any] = _
  var onloadeddata: js.Function1[Event, js.Any] = _
  var onbeforedeactivate: js.Function1[UIEvent, js.Any] = _
  var onactivate: js.Function1[UIEvent, js.Any] = _
  var onselectstart: js.Function1[Event, js.Any] = _
  var onfocus: js.Function1[FocusEvent, js.Any] = _
  var fgColor: js.String = _
  var ontimeupdate: js.Function1[Event, js.Any] = _
  var onselect: js.Function1[UIEvent, js.Any] = _
  var ondrop: js.Function1[DragEvent, js.Any] = _
  var onended: js.Function1[Event, js.Any] = _
  var compatMode: js.String = _
  var onscroll: js.Function1[UIEvent, js.Any] = _
  var onrowenter: js.Function1[MSEventObj, js.Any] = _
  var onload: js.Function1[Event, js.Any] = _
  var oninput: js.Function1[Event, js.Any] = _
  def queryCommandValue(commandId: js.String): js.String = ???
  def adoptNode(source: Node): Node = ???
  def queryCommandIndeterm(commandId: js.String): js.Boolean = ???
  def getElementsByTagNameNS(namespaceURI: js.String, localName: js.String): NodeList = ???
  def createProcessingInstruction(target: js.String, data: js.String): ProcessingInstruction = ???
  def execCommand(commandId: js.String, showUI: js.Boolean, value: js.Any): js.Boolean = ???
  def execCommand(commandId: js.String, showUI: js.Boolean): js.Boolean = ???
  def execCommand(commandId: js.String): js.Boolean = ???
  def elementFromPoint(x: js.Number, y: js.Number): Element = ???
  def createCDATASection(data: js.String): CDATASection = ???
  def queryCommandText(commandId: js.String): js.String = ???
  def write(content: js.String*): Unit = ???
  def updateSettings(): Unit = ???
  def createElement(tagName: js.String): HTMLElement = ???
  def releaseCapture(): Unit = ???
  def writeln(content: js.String*): Unit = ???
  def createElementNS(namespaceURI: js.String, qualifiedName: js.String): Element = ???
  def open(url: js.String, name: js.String, features: js.String, replace: js.Boolean): js.Dynamic = ???
  def open(url: js.String, name: js.String, features: js.String): js.Dynamic = ???
  def open(url: js.String, name: js.String): js.Dynamic = ???
  def open(url: js.String): js.Dynamic = ???
  def open(): js.Dynamic = ???
  def queryCommandSupported(commandId: js.String): js.Boolean = ???
  def createTreeWalker(root: Node, whatToShow: js.Number, filter: NodeFilter, entityReferenceExpansion: js.Boolean): TreeWalker = ???
  def createAttributeNS(namespaceURI: js.String, qualifiedName: js.String): Attr = ???
  def queryCommandEnabled(commandId: js.String): js.Boolean = ???
  def focus(): Unit = ???
  def close(): Unit = ???
  def getElementsByClassName(classNames: js.String): NodeList = ???
  def importNode(importedNode: Node, deep: js.Boolean): Node = ???
  def createRange(): Range = ???
  def fireEvent(eventName: js.String, eventObj: js.Any): js.Boolean = ???
  def fireEvent(eventName: js.String): js.Boolean = ???
  def createComment(data: js.String): Comment = ???
  def getElementsByTagName(tagname: js.String): NodeList = ???
  def createDocumentFragment(): DocumentFragment = ???
  def createStyleSheet(href: js.String, index: js.Number): CSSStyleSheet = ???
  def createStyleSheet(href: js.String): CSSStyleSheet = ???
  def createStyleSheet(): CSSStyleSheet = ???
  def getElementsByName(elementName: js.String): NodeList = ???
  def queryCommandState(commandId: js.String): js.Boolean = ???
  def hasFocus(): js.Boolean = ???
  def execCommandShowHelp(commandId: js.String): js.Boolean = ???
  def createAttribute(name: js.String): Attr = ???
  def createTextNode(data: js.String): Text = ???
  def createNodeIterator(root: Node, whatToShow: js.Number, filter: NodeFilter, entityReferenceExpansion: js.Boolean): NodeIterator = ???
  def createEventObject(eventObj: js.Any): MSEventObj = ???
  def createEventObject(): MSEventObj = ???
  def getSelection(): Selection = ???
  def getElementById(elementId: js.String): HTMLElement = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
  var onmspointerdown: js.Function1[js.Any, js.Any] = _
  var msHidden: js.Boolean = _
  var msVisibilityState: js.String = _
  var onmsgesturedoubletap: js.Function1[js.Any, js.Any] = _
  var visibilityState: js.String = _
  var onmsmanipulationstatechanged: js.Function1[js.Any, js.Any] = _
  var onmspointerhover: js.Function1[js.Any, js.Any] = _
  var onmscontentzoom: js.Function1[js.Any, js.Any] = _
  var onmspointermove: js.Function1[js.Any, js.Any] = _
  var onmsgesturehold: js.Function1[js.Any, js.Any] = _
  var onmsgesturechange: js.Function1[js.Any, js.Any] = _
  var onmsgesturestart: js.Function1[js.Any, js.Any] = _
  var onmspointercancel: js.Function1[js.Any, js.Any] = _
  var onmsgestureend: js.Function1[js.Any, js.Any] = _
  var onmsgesturetap: js.Function1[js.Any, js.Any] = _
  var onmspointerout: js.Function1[js.Any, js.Any] = _
  var onmsinertiastart: js.Function1[js.Any, js.Any] = _
  var msCSSOMElementFloatMetrics: js.Boolean = _
  var onmspointerover: js.Function1[js.Any, js.Any] = _
  var hidden: js.Boolean = _
  var onmspointerup: js.Function1[js.Any, js.Any] = _
  def msElementsFromPoint(x: js.Number, y: js.Number): NodeList = ???
  def msElementsFromRect(left: js.Number, top: js.Number, width: js.Number, height: js.Number): NodeList = ???
  def clear(): Unit = ???
}

object Document extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Document),List())))) */
}

trait MessageEvent extends Event {
  var source: Window = _
  var origin: js.String = _
  var data: js.Any = _
  def initMessageEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, dataArg: js.Any, originArg: js.String, lastEventIdArg: js.String, sourceArg: Window): Unit = ???
  var ports: js.Any = _
}

object MessageEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MessageEvent),List())))) */
}

trait SVGElement extends Element {
  var onmouseover: js.Function1[MouseEvent, js.Any] = _
  var viewportElement: SVGElement = _
  var onmousemove: js.Function1[MouseEvent, js.Any] = _
  var onmouseout: js.Function1[MouseEvent, js.Any] = _
  var ondblclick: js.Function1[MouseEvent, js.Any] = _
  var onfocusout: js.Function1[FocusEvent, js.Any] = _
  var onfocusin: js.Function1[FocusEvent, js.Any] = _
  var xmlbase: js.String = _
  var onmousedown: js.Function1[MouseEvent, js.Any] = _
  var onload: js.Function1[Event, js.Any] = _
  var onmouseup: js.Function1[MouseEvent, js.Any] = _
  var onclick: js.Function1[MouseEvent, js.Any] = _
  var ownerSVGElement: SVGSVGElement = _
  var id: js.String = _
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}

object SVGElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGElement),List())))) */
}

trait HTMLScriptElement extends HTMLElement {
  var defer: js.Boolean = _
  var text: js.String = _
  var src: js.String = _
  var htmlFor: js.String = _
  var charset: js.String = _
  var `type`: js.String = _
  var event: js.String = _
  var async: js.Boolean = _
}

object HTMLScriptElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLScriptElement),List())))) */
}

trait HTMLTableRowElement extends HTMLElement with HTMLTableAlignment with DOML2DeprecatedBackgroundColorStyle {
  var rowIndex: js.Number = _
  var cells: HTMLCollection = _
  var align: js.String = _
  var borderColorLight: js.Any = _
  var sectionRowIndex: js.Number = _
  var borderColor: js.Any = _
  var height: js.Any = _
  var borderColorDark: js.Any = _
  def deleteCell(index: js.Number): Unit = ???
  def deleteCell(): Unit = ???
  def insertCell(index: js.Number): HTMLElement = ???
  def insertCell(): HTMLElement = ???
}

object HTMLTableRowElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLTableRowElement),List())))) */
}

trait CanvasRenderingContext2D extends js.Object {
  var miterLimit: js.Number = _
  var font: js.String = _
  var globalCompositeOperation: js.String = _
  var msFillRule: js.String = _
  var lineCap: js.String = _
  var msImageSmoothingEnabled: js.Boolean = _
  var lineDashOffset: js.Number = _
  var shadowColor: js.String = _
  var lineJoin: js.String = _
  var shadowOffsetX: js.Number = _
  var lineWidth: js.Number = _
  var canvas: HTMLCanvasElement = _
  var strokeStyle: js.Any = _
  var globalAlpha: js.Number = _
  var shadowOffsetY: js.Number = _
  var fillStyle: js.Any = _
  var shadowBlur: js.Number = _
  var textAlign: js.String = _
  var textBaseline: js.String = _
  def restore(): Unit = ???
  def setTransform(m11: js.Number, m12: js.Number, m21: js.Number, m22: js.Number, dx: js.Number, dy: js.Number): Unit = ???
  def save(): Unit = ???
  def arc(x: js.Number, y: js.Number, radius: js.Number, startAngle: js.Number, endAngle: js.Number, anticlockwise: js.Boolean): Unit = ???
  def arc(x: js.Number, y: js.Number, radius: js.Number, startAngle: js.Number, endAngle: js.Number): Unit = ???
  def measureText(text: js.String): TextMetrics = ???
  def isPointInPath(x: js.Number, y: js.Number, fillRule: js.String): js.Boolean = ???
  def isPointInPath(x: js.Number, y: js.Number): js.Boolean = ???
  def quadraticCurveTo(cpx: js.Number, cpy: js.Number, x: js.Number, y: js.Number): Unit = ???
  def putImageData(imagedata: ImageData, dx: js.Number, dy: js.Number, dirtyX: js.Number, dirtyY: js.Number, dirtyWidth: js.Number, dirtyHeight: js.Number): Unit = ???
  def putImageData(imagedata: ImageData, dx: js.Number, dy: js.Number, dirtyX: js.Number, dirtyY: js.Number, dirtyWidth: js.Number): Unit = ???
  def putImageData(imagedata: ImageData, dx: js.Number, dy: js.Number, dirtyX: js.Number, dirtyY: js.Number): Unit = ???
  def putImageData(imagedata: ImageData, dx: js.Number, dy: js.Number, dirtyX: js.Number): Unit = ???
  def putImageData(imagedata: ImageData, dx: js.Number, dy: js.Number): Unit = ???
  def rotate(angle: js.Number): Unit = ???
  def fillText(text: js.String, x: js.Number, y: js.Number, maxWidth: js.Number): Unit = ???
  def fillText(text: js.String, x: js.Number, y: js.Number): Unit = ???
  def translate(x: js.Number, y: js.Number): Unit = ???
  def scale(x: js.Number, y: js.Number): Unit = ???
  def createRadialGradient(x0: js.Number, y0: js.Number, r0: js.Number, x1: js.Number, y1: js.Number, r1: js.Number): CanvasGradient = ???
  def lineTo(x: js.Number, y: js.Number): Unit = ???
  def getLineDash(): js.Array[js.Number] = ???
  def fill(fillRule: js.String): Unit = ???
  def fill(): Unit = ???
  def createImageData(imageDataOrSw: js.Any, sh: js.Number): ImageData = ???
  def createImageData(imageDataOrSw: js.Any): ImageData = ???
  def createPattern(image: HTMLElement, repetition: js.String): CanvasPattern = ???
  def closePath(): Unit = ???
  def rect(x: js.Number, y: js.Number, w: js.Number, h: js.Number): Unit = ???
  def clip(fillRule: js.String): Unit = ???
  def clip(): Unit = ???
  def clearRect(x: js.Number, y: js.Number, w: js.Number, h: js.Number): Unit = ???
  def moveTo(x: js.Number, y: js.Number): Unit = ???
  def getImageData(sx: js.Number, sy: js.Number, sw: js.Number, sh: js.Number): ImageData = ???
  def fillRect(x: js.Number, y: js.Number, w: js.Number, h: js.Number): Unit = ???
  def bezierCurveTo(cp1x: js.Number, cp1y: js.Number, cp2x: js.Number, cp2y: js.Number, x: js.Number, y: js.Number): Unit = ???
  def drawImage(image: HTMLElement, offsetX: js.Number, offsetY: js.Number, width: js.Number, height: js.Number, canvasOffsetX: js.Number, canvasOffsetY: js.Number, canvasImageWidth: js.Number, canvasImageHeight: js.Number): Unit = ???
  def drawImage(image: HTMLElement, offsetX: js.Number, offsetY: js.Number, width: js.Number, height: js.Number, canvasOffsetX: js.Number, canvasOffsetY: js.Number, canvasImageWidth: js.Number): Unit = ???
  def drawImage(image: HTMLElement, offsetX: js.Number, offsetY: js.Number, width: js.Number, height: js.Number, canvasOffsetX: js.Number, canvasOffsetY: js.Number): Unit = ???
  def drawImage(image: HTMLElement, offsetX: js.Number, offsetY: js.Number, width: js.Number, height: js.Number, canvasOffsetX: js.Number): Unit = ???
  def drawImage(image: HTMLElement, offsetX: js.Number, offsetY: js.Number, width: js.Number, height: js.Number): Unit = ???
  def drawImage(image: HTMLElement, offsetX: js.Number, offsetY: js.Number, width: js.Number): Unit = ???
  def drawImage(image: HTMLElement, offsetX: js.Number, offsetY: js.Number): Unit = ???
  def transform(m11: js.Number, m12: js.Number, m21: js.Number, m22: js.Number, dx: js.Number, dy: js.Number): Unit = ???
  def stroke(): Unit = ???
  def strokeRect(x: js.Number, y: js.Number, w: js.Number, h: js.Number): Unit = ???
  def setLineDash(segments: js.Array[js.Number]): Unit = ???
  def strokeText(text: js.String, x: js.Number, y: js.Number, maxWidth: js.Number): Unit = ???
  def strokeText(text: js.String, x: js.Number, y: js.Number): Unit = ???
  def beginPath(): Unit = ???
  def arcTo(x1: js.Number, y1: js.Number, x2: js.Number, y2: js.Number, radius: js.Number): Unit = ???
  def createLinearGradient(x0: js.Number, y0: js.Number, x1: js.Number, y1: js.Number): CanvasGradient = ???
}

object CanvasRenderingContext2D extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(CanvasRenderingContext2D),List())))) */
}

trait MSCSSRuleList extends js.Object {
  var length: js.Number = _
  def item(index: js.Number): CSSStyleRule = ???
  def item(): CSSStyleRule = ???
  @scala.js.annotation.JSBracketAccess
  def apply(index: js.Number): CSSStyleRule = ???
  @scala.js.annotation.JSBracketAccess
  def update(index: js.Number, v: CSSStyleRule): Unit = ???
}

object MSCSSRuleList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSCSSRuleList),List())))) */
}

trait SVGPathSegLinetoHorizontalAbs extends SVGPathSeg {
  var x: js.Number = _
}

object SVGPathSegLinetoHorizontalAbs extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGPathSegLinetoHorizontalAbs),List())))) */
}

trait SVGPathSegArcAbs extends SVGPathSeg {
  var y: js.Number = _
  var sweepFlag: js.Boolean = _
  var r2: js.Number = _
  var x: js.Number = _
  var angle: js.Number = _
  var r1: js.Number = _
  var largeArcFlag: js.Boolean = _
}

object SVGPathSegArcAbs extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGPathSegArcAbs),List())))) */
}

trait SVGTransformList extends js.Object {
  var numberOfItems: js.Number = _
  def getItem(index: js.Number): SVGTransform = ???
  def consolidate(): SVGTransform = ???
  def clear(): Unit = ???
  def appendItem(newItem: SVGTransform): SVGTransform = ???
  def initialize(newItem: SVGTransform): SVGTransform = ???
  def removeItem(index: js.Number): SVGTransform = ???
  def insertItemBefore(newItem: SVGTransform, index: js.Number): SVGTransform = ???
  def replaceItem(newItem: SVGTransform, index: js.Number): SVGTransform = ???
  def createSVGTransformFromMatrix(matrix: SVGMatrix): SVGTransform = ???
}

object SVGTransformList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGTransformList),List())))) */
}

trait HTMLHtmlElement extends HTMLElement {
  var version: js.String = _
}

object HTMLHtmlElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLHtmlElement),List())))) */
}

trait SVGPathSegClosePath extends SVGPathSeg {
}

object SVGPathSegClosePath extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGPathSegClosePath),List())))) */
}

trait HTMLFrameElement extends HTMLElement with GetSVGDocument with MSDataBindingExtensions {
  var width: js.Any = _
  var scrolling: js.String = _
  var marginHeight: js.String = _
  var marginWidth: js.String = _
  var borderColor: js.Any = _
  var frameSpacing: js.Any = _
  var frameBorder: js.String = _
  var noResize: js.Boolean = _
  var contentWindow: Window = _
  var src: js.String = _
  var name: js.String = _
  var height: js.Any = _
  var contentDocument: Document = _
  var border: js.String = _
  var longDesc: js.String = _
  var onload: js.Function1[Event, js.Any] = _
  var security: js.Any = _
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]  ): Unit = ???
}

object HTMLFrameElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLFrameElement),List())))) */
}

trait SVGAnimatedLength extends js.Object {
  var animVal: SVGLength = _
  var baseVal: SVGLength = _
}

object SVGAnimatedLength extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGAnimatedLength),List())))) */
}

trait SVGAnimatedPoints extends js.Object {
  var points: SVGPointList = _
  var animatedPoints: SVGPointList = _
}

trait SVGDefsElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
}

object SVGDefsElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGDefsElement),List())))) */
}

trait HTMLQuoteElement extends HTMLElement {
  var dateTime: js.String = _
  var cite: js.String = _
}

object HTMLQuoteElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLQuoteElement),List())))) */
}

trait CSSMediaRule extends CSSRule {
  var media: MediaList = _
  var cssRules: CSSRuleList = _
  def insertRule(rule: js.String, index: js.Number): js.Number = ???
  def insertRule(rule: js.String): js.Number = ???
  def deleteRule(index: js.Number): Unit = ???
  def deleteRule(): Unit = ???
}

object CSSMediaRule extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(CSSMediaRule),List())))) */
}

trait WindowModal extends js.Object {
  var dialogArguments: js.Any = _
  var returnValue: js.Any = _
}

trait XMLHttpRequest extends EventTarget {
  var responseBody: js.Any = _
  var status: js.Number = _
  var readyState: js.Number = _
  var responseText: js.String = _
  var responseXML: Document = _
  var ontimeout: js.Function1[Event, js.Any] = _
  var statusText: js.String = _
  var onreadystatechange: js.Function1[Event, js.Any] = _
  var timeout: js.Number = _
  var onload: js.Function1[Event, js.Any] = _
  def open(method: js.String, url: js.String, async: js.Boolean, user: js.String, password: js.String): Unit = ???
  def open(method: js.String, url: js.String, async: js.Boolean, user: js.String): Unit = ???
  def open(method: js.String, url: js.String, async: js.Boolean): Unit = ???
  def open(method: js.String, url: js.String): Unit = ???
  def create(): XMLHttpRequest = ???
  def send(data: js.Any): Unit = ???
  def send(): Unit = ???
  def abort(): Unit = ???
  def getAllResponseHeaders(): js.String = ???
  def setRequestHeader(header: js.String, value: js.String): Unit = ???
  def getResponseHeader(header: js.String): js.String = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
  var LOADING: js.Number = _
  var DONE: js.Number = _
  var UNSENT: js.Number = _
  var OPENED: js.Number = _
  var HEADERS_RECEIVED: js.Number = _
  var response: js.Any = _
  var withCredentials: js.Boolean = _
  var onprogress: js.Function1[ProgressEvent, js.Any] = _
  var onabort: js.Function1[js.Any, js.Any] = _
  var responseType: js.String = _
  var onloadend: js.Function1[ProgressEvent, js.Any] = _
  var upload: XMLHttpRequestEventTarget = _
  var onerror: js.Function1[ErrorEvent, js.Any] = _
  var onloadstart: js.Function1[js.Any, js.Any] = _
}

object XMLHttpRequest extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(XMLHttpRequest),List())))) */
  var LOADING: js.Number = _
  var DONE: js.Number = _
  var UNSENT: js.Number = _
  var OPENED: js.Number = _
  var HEADERS_RECEIVED: js.Number = _
}

trait HTMLTableHeaderCellElement extends HTMLTableCellElement {
}

object HTMLTableHeaderCellElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLTableHeaderCellElement),List())))) */
}

trait HTMLDListElement extends HTMLElement with DOML2DeprecatedListSpaceReduction {
}

object HTMLDListElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLDListElement),List())))) */
}

trait MSDataBindingExtensions extends js.Object {
  var dataSrc: js.String = _
  var dataFormatAs: js.String = _
  var dataFld: js.String = _
}

trait SVGPathSegLinetoHorizontalRel extends SVGPathSeg {
  var x: js.Number = _
}

object SVGPathSegLinetoHorizontalRel extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGPathSegLinetoHorizontalRel),List())))) */
}

trait SVGEllipseElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
  var ry: SVGAnimatedLength = _
  var cx: SVGAnimatedLength = _
  var rx: SVGAnimatedLength = _
  var cy: SVGAnimatedLength = _
}

object SVGEllipseElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGEllipseElement),List())))) */
}

trait SVGAElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired with SVGURIReference {
  var target: SVGAnimatedString = _
}

object SVGAElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGAElement),List())))) */
}

trait SVGStylable extends js.Object {
  var className: SVGAnimatedString = _
  var style: CSSStyleDeclaration = _
}

trait SVGTransformable extends SVGLocatable {
  var transform: SVGAnimatedTransformList = _
}

trait HTMLFrameSetElement extends HTMLElement {
  var ononline: js.Function1[Event, js.Any] = _
  var borderColor: js.Any = _
  var rows: js.String = _
  var cols: js.String = _
  var onblur: js.Function1[FocusEvent, js.Any] = _
  var frameSpacing: js.Any = _
  var onfocus: js.Function1[FocusEvent, js.Any] = _
  var onmessage: js.Function1[MessageEvent, js.Any] = _
  var onerror: js.Function1[Event, js.Any] = _
  var frameBorder: js.String = _
  var onresize: js.Function1[UIEvent, js.Any] = _
  var name: js.String = _
  var onafterprint: js.Function1[Event, js.Any] = _
  var onbeforeprint: js.Function1[Event, js.Any] = _
  var onoffline: js.Function1[Event, js.Any] = _
  var border: js.String = _
  var onunload: js.Function1[Event, js.Any] = _
  var onhashchange: js.Function1[Event, js.Any] = _
  var onload: js.Function1[Event, js.Any] = _
  var onbeforeunload: js.Function1[BeforeUnloadEvent, js.Any] = _
  var onstorage: js.Function1[StorageEvent, js.Any] = _
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}

object HTMLFrameSetElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLFrameSetElement),List())))) */
}

trait Screen extends js.Object {
  var width: js.Number = _
  var deviceXDPI: js.Number = _
  var fontSmoothingEnabled: js.Boolean = _
  var bufferDepth: js.Number = _
  var logicalXDPI: js.Number = _
  var systemXDPI: js.Number = _
  var availHeight: js.Number = _
  var height: js.Number = _
  var logicalYDPI: js.Number = _
  var systemYDPI: js.Number = _
  var updateInterval: js.Number = _
  var colorDepth: js.Number = _
  var availWidth: js.Number = _
  var deviceYDPI: js.Number = _
  var pixelDepth: js.Number = _
}

object Screen extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Screen),List())))) */
}

trait Coordinates extends js.Object {
  var altitudeAccuracy: js.Number = _
  var longitude: js.Number = _
  var latitude: js.Number = _
  var speed: js.Number = _
  var heading: js.Number = _
  var altitude: js.Number = _
  var accuracy: js.Number = _
}

object Coordinates extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Coordinates),List())))) */
}

trait NavigatorGeolocation extends js.Object {
  var geolocation: Geolocation = _
}

trait NavigatorContentUtils extends js.Object {
}



trait SVGLangSpace extends js.Object {
  var xmllang: js.String = _
  var xmlspace: js.String = _
}

trait DataTransfer extends js.Object {
  var effectAllowed: js.String = _
  var dropEffect: js.String = _
  def clearData(format: js.String): js.Boolean = ???
  def clearData(): js.Boolean = ???
  def setData(format: js.String, data: js.String): js.Boolean = ???
  def getData(format: js.String): js.String = ???
  var types: DOMStringList = _
  var files: FileList = _
}

object DataTransfer extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(DataTransfer),List())))) */
}

trait FocusEvent extends UIEvent {
  var relatedTarget: EventTarget = _
  def initFocusEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, viewArg: Window, detailArg: js.Number, relatedTargetArg: EventTarget): Unit = ???
}

object FocusEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(FocusEvent),List())))) */
}

trait Range extends js.Object {
  var startOffset: js.Number = _
  var collapsed: js.Boolean = _
  var endOffset: js.Number = _
  var startContainer: Node = _
  var endContainer: Node = _
  var commonAncestorContainer: Node = _
  def setStart(refNode: Node, offset: js.Number): Unit = ???
  def setEndBefore(refNode: Node): Unit = ???
  def setStartBefore(refNode: Node): Unit = ???
  def selectNode(refNode: Node): Unit = ???
  def detach(): Unit = ???
  def getBoundingClientRect(): ClientRect = ???
  
  def compareBoundaryPoints(how: js.Number, sourceRange: Range): js.Number = ???
  def insertNode(newNode: Node): Unit = ???
  def collapse(toStart: js.Boolean): Unit = ???
  def selectNodeContents(refNode: Node): Unit = ???
  def cloneContents(): DocumentFragment = ???
  def setEnd(refNode: Node, offset: js.Number): Unit = ???
  def cloneRange(): Range = ???
  def getClientRects(): ClientRectList = ???
  def surroundContents(newParent: Node): Unit = ???
  def deleteContents(): Unit = ???
  def setStartAfter(refNode: Node): Unit = ???
  def extractContents(): DocumentFragment = ???
  def setEndAfter(refNode: Node): Unit = ???
  var END_TO_END: js.Number = _
  var START_TO_START: js.Number = _
  var START_TO_END: js.Number = _
  var END_TO_START: js.Number = _
  def createContextualFragment(fragment: js.String): DocumentFragment = ???
}

object Range extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Range),List())))) */
  var END_TO_END: js.Number = _
  var START_TO_START: js.Number = _
  var START_TO_END: js.Number = _
  var END_TO_START: js.Number = _
}

trait SVGPoint extends js.Object {
  var y: js.Number = _
  var x: js.Number = _
  def matrixTransform(matrix: SVGMatrix): SVGPoint = ???
}

object SVGPoint extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGPoint),List())))) */
}

trait MSPluginsCollection extends js.Object {
  var length: js.Number = _
  def refresh(reload: js.Boolean): Unit = ???
  def refresh(): Unit = ???
}

object MSPluginsCollection extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSPluginsCollection),List())))) */
}

trait SVGAnimatedNumberList extends js.Object {
  var animVal: SVGNumberList = _
  var baseVal: SVGNumberList = _
}

object SVGAnimatedNumberList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGAnimatedNumberList),List())))) */
}

trait SVGSVGElement extends SVGElement with SVGStylable with SVGZoomAndPan with DocumentEvent with SVGLangSpace with SVGLocatable with SVGTests with SVGFitToViewBox with SVGExternalResourcesRequired {
  var width: SVGAnimatedLength = _
  var x: SVGAnimatedLength = _
  var contentStyleType: js.String = _
  var onzoom: js.Function1[js.Any, js.Any] = _
  var y: SVGAnimatedLength = _
  var viewport: SVGRect = _
  var onerror: js.Function1[Event, js.Any] = _
  var pixelUnitToMillimeterY: js.Number = _
  var onresize: js.Function1[UIEvent, js.Any] = _
  var screenPixelToMillimeterY: js.Number = _
  var height: SVGAnimatedLength = _
  var onabort: js.Function1[UIEvent, js.Any] = _
  var contentScriptType: js.String = _
  var pixelUnitToMillimeterX: js.Number = _
  var currentTranslate: SVGPoint = _
  var onunload: js.Function1[Event, js.Any] = _
  var currentScale: js.Number = _
  var onscroll: js.Function1[UIEvent, js.Any] = _
  var screenPixelToMillimeterX: js.Number = _
  def setCurrentTime(seconds: js.Number): Unit = ???
  def createSVGLength(): SVGLength = ???
  def getIntersectionList(rect: SVGRect, referenceElement: SVGElement): NodeList = ???
  def unpauseAnimations(): Unit = ???
  def createSVGRect(): SVGRect = ???
  def checkIntersection(element: SVGElement, rect: SVGRect): js.Boolean = ???
  def unsuspendRedrawAll(): Unit = ???
  def pauseAnimations(): Unit = ???
  def suspendRedraw(maxWaitMilliseconds: js.Number): js.Number = ???
  def deselectAll(): Unit = ???
  def createSVGAngle(): SVGAngle = ???
  def getEnclosureList(rect: SVGRect, referenceElement: SVGElement): NodeList = ???
  def createSVGTransform(): SVGTransform = ???
  def unsuspendRedraw(suspendHandleID: js.Number): Unit = ???
  def forceRedraw(): Unit = ???
  def getCurrentTime(): js.Number = ???
  def checkEnclosure(element: SVGElement, rect: SVGRect): js.Boolean = ???
  def createSVGMatrix(): SVGMatrix = ???
  def createSVGPoint(): SVGPoint = ???
  def createSVGNumber(): SVGNumber = ???
  def createSVGTransformFromMatrix(matrix: SVGMatrix): SVGTransform = ???
  def getComputedStyle(elt: Element, pseudoElt: js.String): CSSStyleDeclaration = ???
  def getComputedStyle(elt: Element): CSSStyleDeclaration = ???
  def getElementById(elementId: js.String): Element = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}

object SVGSVGElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGSVGElement),List())))) */
}

trait HTMLLabelElement extends HTMLElement with MSDataBindingExtensions {
  var htmlFor: js.String = _
  var form: HTMLFormElement = _
}

object HTMLLabelElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLLabelElement),List())))) */
}

trait MSResourceMetadata extends js.Object {
  var protocol: js.String = _
  var fileSize: js.String = _
  var fileUpdatedDate: js.String = _
  var nameProp: js.String = _
  var fileCreatedDate: js.String = _
  var fileModifiedDate: js.String = _
  var mimeType: js.String = _
}

trait HTMLLegendElement extends HTMLElement with MSDataBindingExtensions {
  var align: js.String = _
  var form: HTMLFormElement = _
}

object HTMLLegendElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLLegendElement),List())))) */
}

trait HTMLDirectoryElement extends HTMLElement with DOML2DeprecatedListSpaceReduction with DOML2DeprecatedListNumberingAndBulletStyle {
}

object HTMLDirectoryElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLDirectoryElement),List())))) */
}

trait SVGAnimatedInteger extends js.Object {
  var animVal: js.Number = _
  var baseVal: js.Number = _
}

object SVGAnimatedInteger extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGAnimatedInteger),List())))) */
}

trait SVGTextElement extends SVGTextPositioningElement with SVGTransformable {
}

object SVGTextElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGTextElement),List())))) */
}

trait SVGTSpanElement extends SVGTextPositioningElement {
}

object SVGTSpanElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGTSpanElement),List())))) */
}

trait HTMLLIElement extends HTMLElement with DOML2DeprecatedListNumberingAndBulletStyle {
  var value: js.Number = _
}

object HTMLLIElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLLIElement),List())))) */
}

trait SVGPathSegLinetoVerticalAbs extends SVGPathSeg {
  var y: js.Number = _
}

object SVGPathSegLinetoVerticalAbs extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGPathSegLinetoVerticalAbs),List())))) */
}

trait MSStorageExtensions extends js.Object {
  var remainingSpace: js.Number = _
}

trait SVGStyleElement extends SVGElement with SVGLangSpace {
  var media: js.String = _
  var `type`: js.String = _
  var title: js.String = _
}

object SVGStyleElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGStyleElement),List())))) */
}

trait MSCurrentStyleCSSProperties extends MSCSSProperties {
  var blockDirection: js.String = _
  var clipBottom: js.String = _
  var clipLeft: js.String = _
  var clipRight: js.String = _
  var clipTop: js.String = _
  var hasLayout: js.String = _
}

object MSCurrentStyleCSSProperties extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSCurrentStyleCSSProperties),List())))) */
}

trait MSHTMLCollectionExtensions extends js.Object {
  def urns(urn: js.Any): Object = ???
  def tags(tagName: js.Any): Object = ???
}

trait Storage extends MSStorageExtensions {
  var length: js.Number = _
  def getItem(key: js.String): js.Dynamic = ???
  @scala.js.annotation.JSBracketAccess
  def apply(key: js.String): js.Any = ???
  @scala.js.annotation.JSBracketAccess
  def update(key: js.String, v: js.Any): Unit = ???
  def setItem(key: js.String, data: js.String): Unit = ???
  def clear(): Unit = ???
  def removeItem(key: js.String): Unit = ???
  def key(index: js.Number): js.String = ???
  @scala.js.annotation.JSBracketAccess
  def apply(index: js.Number): js.Any = ???
  @scala.js.annotation.JSBracketAccess
  def update(index: js.Number, v: js.Any): Unit = ???
}

object Storage extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Storage),List())))) */
}

trait HTMLIFrameElement extends HTMLElement with GetSVGDocument with MSDataBindingExtensions {
  var width: js.String = _
  var scrolling: js.String = _
  var marginHeight: js.String = _
  var marginWidth: js.String = _
  var frameSpacing: js.Any = _
  var frameBorder: js.String = _
  var noResize: js.Boolean = _
  var vspace: js.Number = _
  var contentWindow: Window = _
  var align: js.String = _
  var src: js.String = _
  var name: js.String = _
  var height: js.String = _
  var border: js.String = _
  var contentDocument: Document = _
  var hspace: js.Number = _
  var longDesc: js.String = _
  var security: js.Any = _
  var onload: js.Function1[Event, js.Any] = _
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
  var sandbox: DOMSettableTokenList = _
}

object HTMLIFrameElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLIFrameElement),List())))) */
}

trait TextRangeCollection extends js.Object {
  var length: js.Number = _
  def item(index: js.Number): TextRange = ???
  @scala.js.annotation.JSBracketAccess
  def apply(index: js.Number): TextRange = ???
  @scala.js.annotation.JSBracketAccess
  def update(index: js.Number, v: TextRange): Unit = ???
}

object TextRangeCollection extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(TextRangeCollection),List())))) */
}

trait HTMLBodyElement extends HTMLElement with DOML2DeprecatedBackgroundStyle with DOML2DeprecatedBackgroundColorStyle {
  var scroll: js.String = _
  var ononline: js.Function1[Event, js.Any] = _
  var onblur: js.Function1[FocusEvent, js.Any] = _
  var noWrap: js.Boolean = _
  var onfocus: js.Function1[FocusEvent, js.Any] = _
  var onmessage: js.Function1[MessageEvent, js.Any] = _
  var text: js.Any = _
  var onerror: js.Function1[Event, js.Any] = _
  var bgProperties: js.String = _
  var onresize: js.Function1[UIEvent, js.Any] = _
  var link: js.Any = _
  var aLink: js.Any = _
  var bottomMargin: js.Any = _
  var topMargin: js.Any = _
  var onafterprint: js.Function1[Event, js.Any] = _
  var vLink: js.Any = _
  var onbeforeprint: js.Function1[Event, js.Any] = _
  var onoffline: js.Function1[Event, js.Any] = _
  var onunload: js.Function1[Event, js.Any] = _
  var onhashchange: js.Function1[Event, js.Any] = _
  var onload: js.Function1[Event, js.Any] = _
  var rightMargin: js.Any = _
  var onbeforeunload: js.Function1[BeforeUnloadEvent, js.Any] = _
  var leftMargin: js.Any = _
  var onstorage: js.Function1[StorageEvent, js.Any] = _
  def createTextRange(): TextRange = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
  var onpopstate: js.Function1[PopStateEvent, js.Any] = _
}

object HTMLBodyElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLBodyElement),List())))) */
}

trait DocumentType extends Node {
  var name: js.String = _
  var notations: NamedNodeMap = _
  var systemId: js.String = _
  var internalSubset: js.String = _
  var entities: NamedNodeMap = _
  var publicId: js.String = _
}

object DocumentType extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(DocumentType),List())))) */
}

trait SVGRadialGradientElement extends SVGGradientElement {
  var cx: SVGAnimatedLength = _
  var r: SVGAnimatedLength = _
  var cy: SVGAnimatedLength = _
  var fx: SVGAnimatedLength = _
  var fy: SVGAnimatedLength = _
}

object SVGRadialGradientElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGRadialGradientElement),List())))) */
}

trait MutationEvent extends Event {
  var newValue: js.String = _
  var attrChange: js.Number = _
  var attrName: js.String = _
  var prevValue: js.String = _
  var relatedNode: Node = _
  def initMutationEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, relatedNodeArg: Node, prevValueArg: js.String, newValueArg: js.String, attrNameArg: js.String, attrChangeArg: js.Number): Unit = ???
  var MODIFICATION: js.Number = _
  var REMOVAL: js.Number = _
  var ADDITION: js.Number = _
}

object MutationEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MutationEvent),List())))) */
  var MODIFICATION: js.Number = _
  var REMOVAL: js.Number = _
  var ADDITION: js.Number = _
}

trait DragEvent extends MouseEvent {
  var dataTransfer: DataTransfer = _
  def initDragEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, viewArg: Window, detailArg: js.Number, screenXArg: js.Number, screenYArg: js.Number, clientXArg: js.Number, clientYArg: js.Number, ctrlKeyArg: js.Boolean, altKeyArg: js.Boolean, shiftKeyArg: js.Boolean, metaKeyArg: js.Boolean, buttonArg: js.Number, relatedTargetArg: EventTarget, dataTransferArg: DataTransfer): Unit = ???
}

object DragEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(DragEvent),List())))) */
}

trait HTMLTableSectionElement extends HTMLElement with HTMLTableAlignment with DOML2DeprecatedBackgroundColorStyle {
  var align: js.String = _
  var rows: HTMLCollection = _
  def deleteRow(index: js.Number): Unit = ???
  def deleteRow(): Unit = ???
  def moveRow(indexFrom: js.Number, indexTo: js.Number): Object = ???
  def moveRow(indexFrom: js.Number): Object = ???
  def moveRow(): Object = ???
  def insertRow(index: js.Number): HTMLElement = ???
  def insertRow(): HTMLElement = ???
}

object HTMLTableSectionElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLTableSectionElement),List())))) */
}

trait DOML2DeprecatedListNumberingAndBulletStyle extends js.Object {
  var `type`: js.String = _
}

trait HTMLInputElement extends HTMLElement with MSDataBindingExtensions {
  var width: js.String = _
  var status: js.Boolean = _
  var form: HTMLFormElement = _
  var selectionStart: js.Number = _
  var indeterminate: js.Boolean = _
  var readOnly: js.Boolean = _
  var size: js.Number = _
  var loop: js.Number = _
  var selectionEnd: js.Number = _
  var vrml: js.String = _
  var lowsrc: js.String = _
  var vspace: js.Number = _
  var accept: js.String = _
  var alt: js.String = _
  var defaultChecked: js.Boolean = _
  var align: js.String = _
  var value: js.String = _
  var src: js.String = _
  var name: js.String = _
  var useMap: js.String = _
  var height: js.String = _
  var border: js.String = _
  var dynsrc: js.String = _
  var checked: js.Boolean = _
  var hspace: js.Number = _
  var maxLength: js.Number = _
  var `type`: js.String = _
  var defaultValue: js.String = _
  var complete: js.Boolean = _
  var start: js.String = _
  def createTextRange(): TextRange = ???
  def setSelectionRange(start: js.Number, end: js.Number): Unit = ???
  def select(): Unit = ???
  var validationMessage: js.String = _
  var files: FileList = _
  var max: js.String = _
  var formTarget: js.String = _
  var willValidate: js.Boolean = _
  var step: js.String = _
  var autofocus: js.Boolean = _
  var required: js.Boolean = _
  var formEnctype: js.String = _
  var valueAsNumber: js.Number = _
  var placeholder: js.String = _
  var formMethod: js.String = _
  var list: HTMLElement = _
  var autocomplete: js.String = _
  var min: js.String = _
  var formAction: js.String = _
  var pattern: js.String = _
  var validity: ValidityState = _
  var formNoValidate: js.String = _
  var multiple: js.Boolean = _
  def checkValidity(): js.Boolean = ???
  def stepDown(n: js.Number): Unit = ???
  def stepDown(): Unit = ???
  def stepUp(n: js.Number): Unit = ???
  def stepUp(): Unit = ???
  def setCustomValidity(error: js.String): Unit = ???
}

object HTMLInputElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLInputElement),List())))) */
}

trait HTMLAnchorElement extends HTMLElement with MSDataBindingExtensions {
  var rel: js.String = _
  var protocol: js.String = _
  var search: js.String = _
  var coords: js.String = _
  var hostname: js.String = _
  var pathname: js.String = _
  var Methods: js.String = _
  var target: js.String = _
  var protocolLong: js.String = _
  var href: js.String = _
  var name: js.String = _
  var charset: js.String = _
  var hreflang: js.String = _
  var port: js.String = _
  var host: js.String = _
  var hash: js.String = _
  var nameProp: js.String = _
  var urn: js.String = _
  var rev: js.String = _
  var shape: js.String = _
  var `type`: js.String = _
  var mimeType: js.String = _
  
  var text: js.String = _
}

object HTMLAnchorElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLAnchorElement),List())))) */
}

trait HTMLParamElement extends HTMLElement {
  var value: js.String = _
  var name: js.String = _
  var `type`: js.String = _
  var valueType: js.String = _
}

object HTMLParamElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLParamElement),List())))) */
}

trait SVGImageElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired with SVGURIReference {
  var y: SVGAnimatedLength = _
  var width: SVGAnimatedLength = _
  var preserveAspectRatio: SVGAnimatedPreserveAspectRatio = _
  var x: SVGAnimatedLength = _
  var height: SVGAnimatedLength = _
}

object SVGImageElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGImageElement),List())))) */
}

trait SVGAnimatedNumber extends js.Object {
  var animVal: js.Number = _
  var baseVal: js.Number = _
}

object SVGAnimatedNumber extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGAnimatedNumber),List())))) */
}

trait PerformanceTiming extends js.Object {
  var redirectStart: js.Number = _
  var domainLookupEnd: js.Number = _
  var responseStart: js.Number = _
  var domComplete: js.Number = _
  var domainLookupStart: js.Number = _
  var loadEventStart: js.Number = _
  var msFirstPaint: js.Number = _
  var unloadEventEnd: js.Number = _
  var fetchStart: js.Number = _
  var requestStart: js.Number = _
  var domInteractive: js.Number = _
  var navigationStart: js.Number = _
  var connectEnd: js.Number = _
  var loadEventEnd: js.Number = _
  var connectStart: js.Number = _
  var responseEnd: js.Number = _
  var domLoading: js.Number = _
  var redirectEnd: js.Number = _
  var unloadEventStart: js.Number = _
  var domContentLoadedEventStart: js.Number = _
  var domContentLoadedEventEnd: js.Number = _
  def toJSON(): js.Dynamic = ???
}

object PerformanceTiming extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(PerformanceTiming),List())))) */
}

trait HTMLPreElement extends HTMLElement with DOML2DeprecatedTextFlowControl {
  var width: js.Number = _
  var cite: js.String = _
}

object HTMLPreElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLPreElement),List())))) */
}

trait EventException extends js.Object {
  var code: js.Number = _
  var message: js.String = _
  
  var DISPATCH_REQUEST_ERR: js.Number = _
  var UNSPECIFIED_EVENT_TYPE_ERR: js.Number = _
  var name: js.String = _
}

object EventException extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(EventException),List())))) */
  var DISPATCH_REQUEST_ERR: js.Number = _
  var UNSPECIFIED_EVENT_TYPE_ERR: js.Number = _
}

trait MSNavigatorDoNotTrack extends js.Object {
  var msDoNotTrack: js.String = _
}

trait NavigatorOnLine extends js.Object {
  var onLine: js.Boolean = _
}

trait WindowLocalStorage extends js.Object {
  var localStorage: Storage = _
}

trait SVGMetadataElement extends SVGElement {
}

object SVGMetadataElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGMetadataElement),List())))) */
}

trait SVGPathSegArcRel extends SVGPathSeg {
  var y: js.Number = _
  var sweepFlag: js.Boolean = _
  var r2: js.Number = _
  var x: js.Number = _
  var angle: js.Number = _
  var r1: js.Number = _
  var largeArcFlag: js.Boolean = _
}

object SVGPathSegArcRel extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGPathSegArcRel),List())))) */
}

trait SVGPathSegMovetoAbs extends SVGPathSeg {
  var y: js.Number = _
  var x: js.Number = _
}

object SVGPathSegMovetoAbs extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGPathSegMovetoAbs),List())))) */
}

trait SVGStringList extends js.Object {
  var numberOfItems: js.Number = _
  def replaceItem(newItem: js.String, index: js.Number): js.String = ???
  def getItem(index: js.Number): js.String = ???
  def clear(): Unit = ???
  def appendItem(newItem: js.String): js.String = ???
  def initialize(newItem: js.String): js.String = ???
  def removeItem(index: js.Number): js.String = ???
  def insertItemBefore(newItem: js.String, index: js.Number): js.String = ???
}

object SVGStringList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGStringList),List())))) */
}

trait XDomainRequest extends js.Object {
  var timeout: js.Number = _
  var onerror: js.Function1[Event, js.Any] = _
  var onload: js.Function1[Event, js.Any] = _
  var onprogress: js.Function1[js.Any, js.Any] = _
  var ontimeout: js.Function1[Event, js.Any] = _
  var responseText: js.String = _
  var contentType: js.String = _
  def open(method: js.String, url: js.String): Unit = ???
  def create(): XDomainRequest = ???
  def abort(): Unit = ???
  def send(data: js.Any): Unit = ???
  def send(): Unit = ???
  def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}

object XDomainRequest extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(XDomainRequest),List())))) */
}

trait DOML2DeprecatedBackgroundColorStyle extends js.Object {
  var bgColor: js.Any = _
}

trait ElementTraversal extends js.Object {
  var childElementCount: js.Number = _
  var previousElementSibling: Element = _
  var lastElementChild: Element = _
  var nextElementSibling: Element = _
  var firstElementChild: Element = _
}

trait SVGLength extends js.Object {
  var valueAsString: js.String = _
  var valueInSpecifiedUnits: js.Number = _
  var value: js.Number = _
  var unitType: js.Number = _
  def newValueSpecifiedUnits(unitType: js.Number, valueInSpecifiedUnits: js.Number): Unit = ???
  def convertToSpecifiedUnits(unitType: js.Number): Unit = ???
  var SVG_LENGTHTYPE_NUMBER: js.Number = _
  var SVG_LENGTHTYPE_CM: js.Number = _
  var SVG_LENGTHTYPE_PC: js.Number = _
  var SVG_LENGTHTYPE_PERCENTAGE: js.Number = _
  var SVG_LENGTHTYPE_MM: js.Number = _
  var SVG_LENGTHTYPE_PT: js.Number = _
  var SVG_LENGTHTYPE_IN: js.Number = _
  var SVG_LENGTHTYPE_EMS: js.Number = _
  var SVG_LENGTHTYPE_PX: js.Number = _
  var SVG_LENGTHTYPE_UNKNOWN: js.Number = _
  var SVG_LENGTHTYPE_EXS: js.Number = _
}

object SVGLength extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGLength),List())))) */
  var SVG_LENGTHTYPE_NUMBER: js.Number = _
  var SVG_LENGTHTYPE_CM: js.Number = _
  var SVG_LENGTHTYPE_PC: js.Number = _
  var SVG_LENGTHTYPE_PERCENTAGE: js.Number = _
  var SVG_LENGTHTYPE_MM: js.Number = _
  var SVG_LENGTHTYPE_PT: js.Number = _
  var SVG_LENGTHTYPE_IN: js.Number = _
  var SVG_LENGTHTYPE_EMS: js.Number = _
  var SVG_LENGTHTYPE_PX: js.Number = _
  var SVG_LENGTHTYPE_UNKNOWN: js.Number = _
  var SVG_LENGTHTYPE_EXS: js.Number = _
}

trait SVGPolygonElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGAnimatedPoints with SVGTests with SVGExternalResourcesRequired {
}

object SVGPolygonElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGPolygonElement),List())))) */
}

trait HTMLPhraseElement extends HTMLElement {
  var dateTime: js.String = _
  var cite: js.String = _
}

object HTMLPhraseElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLPhraseElement),List())))) */
}

trait NavigatorStorageUtils extends js.Object {
}

trait SVGPathSegCurvetoCubicRel extends SVGPathSeg {
  var y: js.Number = _
  var y1: js.Number = _
  var x2: js.Number = _
  var x: js.Number = _
  var x1: js.Number = _
  var y2: js.Number = _
}

object SVGPathSegCurvetoCubicRel extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGPathSegCurvetoCubicRel),List())))) */
}

trait MSEventObj extends Event {
  var nextPage: js.String = _
  var keyCode: js.Number = _
  var toElement: Element = _
  var returnValue: js.Any = _
  var dataFld: js.String = _
  var y: js.Number = _
  var dataTransfer: DataTransfer = _
  var propertyName: js.String = _
  var url: js.String = _
  var offsetX: js.Number = _
  var recordset: Object = _
  var screenX: js.Number = _
  var buttonID: js.Number = _
  var wheelDelta: js.Number = _
  var reason: js.Number = _
  var origin: js.String = _
  var data: js.String = _
  var srcFilter: Object = _
  var boundElements: HTMLCollection = _
  var altLeft: js.Boolean = _
  var behaviorCookie: js.Number = _
  var bookmarks: BookmarkCollection = _
  var repeat: js.Boolean = _
  var source: Window = _
  var fromElement: Element = _
  var offsetY: js.Number = _
  var x: js.Number = _
  var behaviorPart: js.Number = _
  var qualifier: js.String = _
  var altKey: js.Boolean = _
  var ctrlKey: js.Boolean = _
  var clientY: js.Number = _
  var shiftKey: js.Boolean = _
  var shiftLeft: js.Boolean = _
  var contentOverflow: js.Boolean = _
  var screenY: js.Number = _
  var ctrlLeft: js.Boolean = _
  var button: js.Number = _
  var srcUrn: js.String = _
  var clientX: js.Number = _
  var actionURL: js.String = _
  def getAttribute(strAttributeName: js.String, lFlags: js.Number): js.Dynamic = ???
  def getAttribute(strAttributeName: js.String): js.Dynamic = ???
  def setAttribute(strAttributeName: js.String, AttributeValue: js.Any, lFlags: js.Number): Unit = ???
  def setAttribute(strAttributeName: js.String, AttributeValue: js.Any): Unit = ???
  def removeAttribute(strAttributeName: js.String, lFlags: js.Number): js.Boolean = ???
  def removeAttribute(strAttributeName: js.String): js.Boolean = ???
}

object MSEventObj extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSEventObj),List())))) */
}

trait SVGTextContentElement extends SVGElement with SVGStylable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
  var textLength: SVGAnimatedLength = _
  var lengthAdjust: SVGAnimatedEnumeration = _
  def getCharNumAtPosition(point: SVGPoint): js.Number = ???
  def getStartPositionOfChar(charnum: js.Number): SVGPoint = ???
  def getExtentOfChar(charnum: js.Number): SVGRect = ???
  def getComputedTextLength(): js.Number = ???
  def getSubStringLength(charnum: js.Number, nchars: js.Number): js.Number = ???
  def selectSubString(charnum: js.Number, nchars: js.Number): Unit = ???
  def getNumberOfChars(): js.Number = ???
  def getRotationOfChar(charnum: js.Number): js.Number = ???
  def getEndPositionOfChar(charnum: js.Number): SVGPoint = ???
  var LENGTHADJUST_SPACING: js.Number = _
  var LENGTHADJUST_SPACINGANDGLYPHS: js.Number = _
  var LENGTHADJUST_UNKNOWN: js.Number = _
}

object SVGTextContentElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGTextContentElement),List())))) */
  var LENGTHADJUST_SPACING: js.Number = _
  var LENGTHADJUST_SPACINGANDGLYPHS: js.Number = _
  var LENGTHADJUST_UNKNOWN: js.Number = _
}

trait DOML2DeprecatedColorProperty extends js.Object {
  var color: js.String = _
}

trait HTMLCanvasElement extends HTMLElement {
  var width: js.Number = _
  var height: js.Number = _
  def toDataURL(`type`: js.String, args: js.Any*): js.String = ???
  def getContext(contextId: js.String, args: js.Any*): js.Dynamic = ???
  def msToBlob(): Blob = ???
}

object HTMLCanvasElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLCanvasElement),List())))) */
}

trait Location extends js.Object {
  var hash: js.String = _
  var protocol: js.String = _
  var search: js.String = _
  var href: js.String = _
  var hostname: js.String = _
  var port: js.String = _
  var pathname: js.String = _
  var host: js.String = _
  def reload(flag: js.Boolean): Unit = ???
  def reload(): Unit = ???
  def replace(url: js.String): Unit = ???
  def assign(url: js.String): Unit = ???
  
}

object Location extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Location),List())))) */
}

trait HTMLTitleElement extends HTMLElement {
  var text: js.String = _
}

object HTMLTitleElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLTitleElement),List())))) */
}

trait HTMLStyleElement extends HTMLElement with LinkStyle {
  var media: js.String = _
  var `type`: js.String = _
}

object HTMLStyleElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLStyleElement),List())))) */
}

trait PerformanceEntry extends js.Object {
  var name: js.String = _
  var startTime: js.Number = _
  var duration: js.Number = _
  var entryType: js.String = _
}

object PerformanceEntry extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(PerformanceEntry),List())))) */
}

trait SVGTransform extends js.Object {
  var `type`: js.Number = _
  var angle: js.Number = _
  var matrix: SVGMatrix = _
  def setTranslate(tx: js.Number, ty: js.Number): Unit = ???
  def setScale(sx: js.Number, sy: js.Number): Unit = ???
  def setMatrix(matrix: SVGMatrix): Unit = ???
  def setSkewY(angle: js.Number): Unit = ???
  def setRotate(angle: js.Number, cx: js.Number, cy: js.Number): Unit = ???
  def setSkewX(angle: js.Number): Unit = ???
  var SVG_TRANSFORM_SKEWX: js.Number = _
  var SVG_TRANSFORM_UNKNOWN: js.Number = _
  var SVG_TRANSFORM_SCALE: js.Number = _
  var SVG_TRANSFORM_TRANSLATE: js.Number = _
  var SVG_TRANSFORM_MATRIX: js.Number = _
  var SVG_TRANSFORM_ROTATE: js.Number = _
  var SVG_TRANSFORM_SKEWY: js.Number = _
}

object SVGTransform extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGTransform),List())))) */
  var SVG_TRANSFORM_SKEWX: js.Number = _
  var SVG_TRANSFORM_UNKNOWN: js.Number = _
  var SVG_TRANSFORM_SCALE: js.Number = _
  var SVG_TRANSFORM_TRANSLATE: js.Number = _
  var SVG_TRANSFORM_MATRIX: js.Number = _
  var SVG_TRANSFORM_ROTATE: js.Number = _
  var SVG_TRANSFORM_SKEWY: js.Number = _
}

trait UIEvent extends Event {
  var detail: js.Number = _
  var view: Window = _
  def initUIEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, viewArg: Window, detailArg: js.Number): Unit = ???
}

object UIEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(UIEvent),List())))) */
}

trait SVGURIReference extends js.Object {
  var href: SVGAnimatedString = _
}

trait SVGPathSeg extends js.Object {
  var pathSegType: js.Number = _
  var pathSegTypeAsLetter: js.String = _
  var PATHSEG_MOVETO_REL: js.Number = _
  var PATHSEG_LINETO_VERTICAL_REL: js.Number = _
  var PATHSEG_CURVETO_CUBIC_SMOOTH_ABS: js.Number = _
  var PATHSEG_CURVETO_QUADRATIC_REL: js.Number = _
  var PATHSEG_CURVETO_CUBIC_ABS: js.Number = _
  var PATHSEG_LINETO_HORIZONTAL_ABS: js.Number = _
  var PATHSEG_CURVETO_QUADRATIC_ABS: js.Number = _
  var PATHSEG_LINETO_ABS: js.Number = _
  var PATHSEG_CLOSEPATH: js.Number = _
  var PATHSEG_LINETO_HORIZONTAL_REL: js.Number = _
  var PATHSEG_CURVETO_CUBIC_SMOOTH_REL: js.Number = _
  var PATHSEG_LINETO_REL: js.Number = _
  var PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS: js.Number = _
  var PATHSEG_ARC_REL: js.Number = _
  var PATHSEG_CURVETO_CUBIC_REL: js.Number = _
  var PATHSEG_UNKNOWN: js.Number = _
  var PATHSEG_LINETO_VERTICAL_ABS: js.Number = _
  var PATHSEG_ARC_ABS: js.Number = _
  var PATHSEG_MOVETO_ABS: js.Number = _
  var PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL: js.Number = _
}

object SVGPathSeg extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGPathSeg),List())))) */
  var PATHSEG_MOVETO_REL: js.Number = _
  var PATHSEG_LINETO_VERTICAL_REL: js.Number = _
  var PATHSEG_CURVETO_CUBIC_SMOOTH_ABS: js.Number = _
  var PATHSEG_CURVETO_QUADRATIC_REL: js.Number = _
  var PATHSEG_CURVETO_CUBIC_ABS: js.Number = _
  var PATHSEG_LINETO_HORIZONTAL_ABS: js.Number = _
  var PATHSEG_CURVETO_QUADRATIC_ABS: js.Number = _
  var PATHSEG_LINETO_ABS: js.Number = _
  var PATHSEG_CLOSEPATH: js.Number = _
  var PATHSEG_LINETO_HORIZONTAL_REL: js.Number = _
  var PATHSEG_CURVETO_CUBIC_SMOOTH_REL: js.Number = _
  var PATHSEG_LINETO_REL: js.Number = _
  var PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS: js.Number = _
  var PATHSEG_ARC_REL: js.Number = _
  var PATHSEG_CURVETO_CUBIC_REL: js.Number = _
  var PATHSEG_UNKNOWN: js.Number = _
  var PATHSEG_LINETO_VERTICAL_ABS: js.Number = _
  var PATHSEG_ARC_ABS: js.Number = _
  var PATHSEG_MOVETO_ABS: js.Number = _
  var PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL: js.Number = _
}

trait WheelEvent extends MouseEvent {
  var deltaZ: js.Number = _
  var deltaX: js.Number = _
  var deltaMode: js.Number = _
  var deltaY: js.Number = _
  def initWheelEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, viewArg: Window, detailArg: js.Number, screenXArg: js.Number, screenYArg: js.Number, clientXArg: js.Number, clientYArg: js.Number, buttonArg: js.Number, relatedTargetArg: EventTarget, modifiersListArg: js.String, deltaXArg: js.Number, deltaYArg: js.Number, deltaZArg: js.Number, deltaMode: js.Number): Unit = ???
  var DOM_DELTA_PIXEL: js.Number = _
  var DOM_DELTA_LINE: js.Number = _
  var DOM_DELTA_PAGE: js.Number = _
  def getCurrentPoint(element: Element): Unit = ???
}

object WheelEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(WheelEvent),List())))) */
  var DOM_DELTA_PIXEL: js.Number = _
  var DOM_DELTA_LINE: js.Number = _
  var DOM_DELTA_PAGE: js.Number = _
}

trait MSEventAttachmentTarget extends js.Object {
  def attachEvent(event: js.String, listener: js.Function1[Event, Unit]): js.Boolean = ???
  def detachEvent(event: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}

trait SVGNumber extends js.Object {
  var value: js.Number = _
}

object SVGNumber extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGNumber),List())))) */
}

trait SVGPathElement extends SVGElement with SVGStylable with SVGAnimatedPathData with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
  def getPathSegAtLength(distance: js.Number): js.Number = ???
  def getPointAtLength(distance: js.Number): SVGPoint = ???
  def createSVGPathSegCurvetoQuadraticAbs(x: js.Number, y: js.Number, x1: js.Number, y1: js.Number): SVGPathSegCurvetoQuadraticAbs = ???
  def createSVGPathSegLinetoRel(x: js.Number, y: js.Number): SVGPathSegLinetoRel = ???
  def createSVGPathSegCurvetoQuadraticRel(x: js.Number, y: js.Number, x1: js.Number, y1: js.Number): SVGPathSegCurvetoQuadraticRel = ???
  def createSVGPathSegCurvetoCubicAbs(x: js.Number, y: js.Number, x1: js.Number, y1: js.Number, x2: js.Number, y2: js.Number): SVGPathSegCurvetoCubicAbs = ???
  def createSVGPathSegLinetoAbs(x: js.Number, y: js.Number): SVGPathSegLinetoAbs = ???
  def createSVGPathSegClosePath(): SVGPathSegClosePath = ???
  def createSVGPathSegCurvetoCubicRel(x: js.Number, y: js.Number, x1: js.Number, y1: js.Number, x2: js.Number, y2: js.Number): SVGPathSegCurvetoCubicRel = ???
  def createSVGPathSegCurvetoQuadraticSmoothRel(x: js.Number, y: js.Number): SVGPathSegCurvetoQuadraticSmoothRel = ???
  def createSVGPathSegMovetoRel(x: js.Number, y: js.Number): SVGPathSegMovetoRel = ???
  def createSVGPathSegCurvetoCubicSmoothAbs(x: js.Number, y: js.Number, x2: js.Number, y2: js.Number): SVGPathSegCurvetoCubicSmoothAbs = ???
  def createSVGPathSegMovetoAbs(x: js.Number, y: js.Number): SVGPathSegMovetoAbs = ???
  def createSVGPathSegLinetoVerticalRel(y: js.Number): SVGPathSegLinetoVerticalRel = ???
  def createSVGPathSegArcRel(x: js.Number, y: js.Number, r1: js.Number, r2: js.Number, angle: js.Number, largeArcFlag: js.Boolean, sweepFlag: js.Boolean): SVGPathSegArcRel = ???
  def createSVGPathSegCurvetoQuadraticSmoothAbs(x: js.Number, y: js.Number): SVGPathSegCurvetoQuadraticSmoothAbs = ???
  def createSVGPathSegLinetoHorizontalRel(x: js.Number): SVGPathSegLinetoHorizontalRel = ???
  def getTotalLength(): js.Number = ???
  def createSVGPathSegCurvetoCubicSmoothRel(x: js.Number, y: js.Number, x2: js.Number, y2: js.Number): SVGPathSegCurvetoCubicSmoothRel = ???
  def createSVGPathSegLinetoHorizontalAbs(x: js.Number): SVGPathSegLinetoHorizontalAbs = ???
  def createSVGPathSegLinetoVerticalAbs(y: js.Number): SVGPathSegLinetoVerticalAbs = ???
  def createSVGPathSegArcAbs(x: js.Number, y: js.Number, r1: js.Number, r2: js.Number, angle: js.Number, largeArcFlag: js.Boolean, sweepFlag: js.Boolean): SVGPathSegArcAbs = ???
}

object SVGPathElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGPathElement),List())))) */
}

trait MSCompatibleInfo extends js.Object {
  var version: js.String = _
  var userAgent: js.String = _
}

object MSCompatibleInfo extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSCompatibleInfo),List())))) */
}

trait Text extends CharacterData with MSNodeExtensions {
  var wholeText: js.String = _
  def splitText(offset: js.Number): Text = ???
  def replaceWholeText(content: js.String): Text = ???
}

object Text extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Text),List())))) */
}

trait SVGAnimatedRect extends js.Object {
  var animVal: SVGRect = _
  var baseVal: SVGRect = _
}

object SVGAnimatedRect extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGAnimatedRect),List())))) */
}

trait CSSNamespaceRule extends CSSRule {
  var namespaceURI: js.String = _
  var prefix: js.String = _
}

object CSSNamespaceRule extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(CSSNamespaceRule),List())))) */
}

trait SVGPathSegList extends js.Object {
  var numberOfItems: js.Number = _
  def replaceItem(newItem: SVGPathSeg, index: js.Number): SVGPathSeg = ???
  def getItem(index: js.Number): SVGPathSeg = ???
  def clear(): Unit = ???
  def appendItem(newItem: SVGPathSeg): SVGPathSeg = ???
  def initialize(newItem: SVGPathSeg): SVGPathSeg = ???
  def removeItem(index: js.Number): SVGPathSeg = ???
  def insertItemBefore(newItem: SVGPathSeg, index: js.Number): SVGPathSeg = ???
}

object SVGPathSegList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGPathSegList),List())))) */
}

trait HTMLUnknownElement extends HTMLElement with MSDataBindingRecordSetReadonlyExtensions {
}

object HTMLUnknownElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLUnknownElement),List())))) */
}

trait HTMLAudioElement extends HTMLMediaElement {
}

object HTMLAudioElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLAudioElement),List())))) */
}

trait MSImageResourceExtensions extends js.Object {
  var dynsrc: js.String = _
  var vrml: js.String = _
  var lowsrc: js.String = _
  var start: js.String = _
  var loop: js.Number = _
}

trait PositionError extends js.Object {
  var code: js.Number = _
  var message: js.String = _
  
  var POSITION_UNAVAILABLE: js.Number = _
  var PERMISSION_DENIED: js.Number = _
  var TIMEOUT: js.Number = _
}

object PositionError extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(PositionError),List())))) */
  var POSITION_UNAVAILABLE: js.Number = _
  var PERMISSION_DENIED: js.Number = _
  var TIMEOUT: js.Number = _
}

trait HTMLTableCellElement extends HTMLElement with HTMLTableAlignment with DOML2DeprecatedBackgroundStyle with DOML2DeprecatedBackgroundColorStyle {
  var width: js.Number = _
  var headers: js.String = _
  var cellIndex: js.Number = _
  var align: js.String = _
  var borderColorLight: js.Any = _
  var colSpan: js.Number = _
  var borderColor: js.Any = _
  var axis: js.String = _
  var height: js.Any = _
  var noWrap: js.Boolean = _
  var abbr: js.String = _
  var rowSpan: js.Number = _
  var scope: js.String = _
  var borderColorDark: js.Any = _
}

object HTMLTableCellElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLTableCellElement),List())))) */
}

trait SVGElementInstance extends EventTarget {
  var previousSibling: SVGElementInstance = _
  var parentNode: SVGElementInstance = _
  var lastChild: SVGElementInstance = _
  var nextSibling: SVGElementInstance = _
  var childNodes: SVGElementInstanceList = _
  var correspondingUseElement: SVGUseElement = _
  var correspondingElement: SVGElement = _
  var firstChild: SVGElementInstance = _
}

object SVGElementInstance extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGElementInstance),List())))) */
}

trait MSNamespaceInfoCollection extends js.Object {
  var length: js.Number = _
  def add(namespace: js.String, urn: js.String, implementationUrl: js.Any): Object = ???
  def add(namespace: js.String, urn: js.String): Object = ???
  def add(namespace: js.String): Object = ???
  def add(): Object = ???
  def item(index: js.Any): Object = ???
  @scala.js.annotation.JSBracketAccess
  def apply(index: js.String): Object = ???
  @scala.js.annotation.JSBracketAccess
  def update(index: js.String, v: Object): Unit = ???
}

object MSNamespaceInfoCollection extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSNamespaceInfoCollection),List())))) */
}

trait SVGCircleElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
  var cx: SVGAnimatedLength = _
  var r: SVGAnimatedLength = _
  var cy: SVGAnimatedLength = _
}

object SVGCircleElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGCircleElement),List())))) */
}

trait StyleSheetList extends js.Object {
  var length: js.Number = _
  def item(index: js.Number): StyleSheet = ???
  def item(): StyleSheet = ???
  @scala.js.annotation.JSBracketAccess
  def apply(index: js.Number): StyleSheet = ???
  @scala.js.annotation.JSBracketAccess
  def update(index: js.Number, v: StyleSheet): Unit = ???
}

object StyleSheetList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(StyleSheetList),List())))) */
}

trait CSSImportRule extends CSSRule {
  var styleSheet: CSSStyleSheet = _
  var href: js.String = _
  var media: MediaList = _
}

object CSSImportRule extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(CSSImportRule),List())))) */
}

trait CustomEvent extends Event {
  var detail: Object = _
  def initCustomEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, detailArg: Object): Unit = ???
}

object CustomEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(CustomEvent),List())))) */
}

trait HTMLBaseFontElement extends HTMLElement with DOML2DeprecatedColorProperty {
  var face: js.String = _
  var size: js.Number = _
}

object HTMLBaseFontElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLBaseFontElement),List())))) */
}

trait HTMLTextAreaElement extends HTMLElement with MSDataBindingExtensions {
  var value: js.String = _
  var status: js.Any = _
  var form: HTMLFormElement = _
  var name: js.String = _
  var selectionStart: js.Number = _
  var rows: js.Number = _
  var cols: js.Number = _
  var readOnly: js.Boolean = _
  var wrap: js.String = _
  var selectionEnd: js.Number = _
  var `type`: js.String = _
  var defaultValue: js.String = _
  def createTextRange(): TextRange = ???
  def setSelectionRange(start: js.Number, end: js.Number): Unit = ???
  def select(): Unit = ???
  var validationMessage: js.String = _
  var autofocus: js.Boolean = _
  var validity: ValidityState = _
  var required: js.Boolean = _
  var maxLength: js.Number = _
  var willValidate: js.Boolean = _
  var placeholder: js.String = _
  def checkValidity(): js.Boolean = ???
  def setCustomValidity(error: js.String): Unit = ???
}

object HTMLTextAreaElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLTextAreaElement),List())))) */
}

trait Geolocation extends js.Object {
  def clearWatch(watchId: js.Number): Unit = ???
  def getCurrentPosition(successCallback: PositionCallback, errorCallback: PositionErrorCallback, options: PositionOptions): Unit = ???
  def getCurrentPosition(successCallback: PositionCallback, errorCallback: PositionErrorCallback): Unit = ???
  def getCurrentPosition(successCallback: PositionCallback): Unit = ???
  def watchPosition(successCallback: PositionCallback, errorCallback: PositionErrorCallback, options: PositionOptions): js.Number = ???
  def watchPosition(successCallback: PositionCallback, errorCallback: PositionErrorCallback): js.Number = ???
  def watchPosition(successCallback: PositionCallback): js.Number = ???
}

object Geolocation extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Geolocation),List())))) */
}

trait DOML2DeprecatedMarginStyle extends js.Object {
  var vspace: js.Number = _
  var hspace: js.Number = _
}

trait MSWindowModeless extends js.Object {
  var dialogTop: js.Any = _
  var dialogLeft: js.Any = _
  var dialogWidth: js.Any = _
  var dialogHeight: js.Any = _
  var menuArguments: js.Any = _
}

trait DOML2DeprecatedAlignmentStyle extends js.Object {
  var align: js.String = _
}

trait HTMLMarqueeElement extends HTMLElement with MSDataBindingExtensions with DOML2DeprecatedBackgroundColorStyle {
  var width: js.String = _
  var onbounce: js.Function1[Event, js.Any] = _
  var vspace: js.Number = _
  var trueSpeed: js.Boolean = _
  var scrollAmount: js.Number = _
  var scrollDelay: js.Number = _
  var behavior: js.String = _
  var height: js.String = _
  var loop: js.Number = _
  var direction: js.String = _
  var hspace: js.Number = _
  var onstart: js.Function1[Event, js.Any] = _
  var onfinish: js.Function1[Event, js.Any] = _
  def stop(): Unit = ???
  def start(): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}

object HTMLMarqueeElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLMarqueeElement),List())))) */
}

trait SVGRect extends js.Object {
  var y: js.Number = _
  var width: js.Number = _
  var x: js.Number = _
  var height: js.Number = _
}

object SVGRect extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGRect),List())))) */
}

trait MSNodeExtensions extends js.Object {
  def swapNode(otherNode: Node): Node = ???
  def removeNode(deep: js.Boolean): Node = ???
  def removeNode(): Node = ???
  def replaceNode(replacement: Node): Node = ???
}

trait History extends js.Object {
  var length: js.Number = _
  def back(distance: js.Any): Unit = ???
  def back(): Unit = ???
  def forward(distance: js.Any): Unit = ???
  def forward(): Unit = ???
  def go(delta: js.Any): Unit = ???
  def go(): Unit = ???
  var state: js.Any = _
  def replaceState(statedata: js.Any, title: js.String, url: js.String): Unit = ???
  def replaceState(statedata: js.Any, title: js.String): Unit = ???
  def pushState(statedata: js.Any, title: js.String, url: js.String): Unit = ???
  def pushState(statedata: js.Any, title: js.String): Unit = ???
}

object History extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(History),List())))) */
}

trait SVGPathSegCurvetoCubicAbs extends SVGPathSeg {
  var y: js.Number = _
  var y1: js.Number = _
  var x2: js.Number = _
  var x: js.Number = _
  var x1: js.Number = _
  var y2: js.Number = _
}

object SVGPathSegCurvetoCubicAbs extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGPathSegCurvetoCubicAbs),List())))) */
}

trait SVGPathSegCurvetoQuadraticAbs extends SVGPathSeg {
  var y: js.Number = _
  var y1: js.Number = _
  var x: js.Number = _
  var x1: js.Number = _
}

object SVGPathSegCurvetoQuadraticAbs extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGPathSegCurvetoQuadraticAbs),List())))) */
}

trait TimeRanges extends js.Object {
  var length: js.Number = _
  def start(index: js.Number): js.Number = ???
  def end(index: js.Number): js.Number = ???
}

object TimeRanges extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(TimeRanges),List())))) */
}

trait CSSRule extends js.Object {
  var cssText: js.String = _
  var parentStyleSheet: CSSStyleSheet = _
  var parentRule: CSSRule = _
  var `type`: js.Number = _
  var IMPORT_RULE: js.Number = _
  var MEDIA_RULE: js.Number = _
  var STYLE_RULE: js.Number = _
  var NAMESPACE_RULE: js.Number = _
  var PAGE_RULE: js.Number = _
  var UNKNOWN_RULE: js.Number = _
  var FONT_FACE_RULE: js.Number = _
  var CHARSET_RULE: js.Number = _
  var KEYFRAMES_RULE: js.Number = _
  var KEYFRAME_RULE: js.Number = _
  var VIEWPORT_RULE: js.Number = _
}

object CSSRule extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(CSSRule),List())))) */
  var IMPORT_RULE: js.Number = _
  var MEDIA_RULE: js.Number = _
  var STYLE_RULE: js.Number = _
  var NAMESPACE_RULE: js.Number = _
  var PAGE_RULE: js.Number = _
  var UNKNOWN_RULE: js.Number = _
  var FONT_FACE_RULE: js.Number = _
  var CHARSET_RULE: js.Number = _
}

trait SVGPathSegLinetoAbs extends SVGPathSeg {
  var y: js.Number = _
  var x: js.Number = _
}

object SVGPathSegLinetoAbs extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGPathSegLinetoAbs),List())))) */
}

trait HTMLModElement extends HTMLElement {
  var dateTime: js.String = _
  var cite: js.String = _
}

object HTMLModElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLModElement),List())))) */
}

trait SVGMatrix extends js.Object {
  var e: js.Number = _
  var c: js.Number = _
  var a: js.Number = _
  var b: js.Number = _
  var d: js.Number = _
  var f: js.Number = _
  def multiply(secondMatrix: SVGMatrix): SVGMatrix = ???
  def flipY(): SVGMatrix = ???
  def skewY(angle: js.Number): SVGMatrix = ???
  def inverse(): SVGMatrix = ???
  def scaleNonUniform(scaleFactorX: js.Number, scaleFactorY: js.Number): SVGMatrix = ???
  def rotate(angle: js.Number): SVGMatrix = ???
  def flipX(): SVGMatrix = ???
  def translate(x: js.Number, y: js.Number): SVGMatrix = ???
  def scale(scaleFactor: js.Number): SVGMatrix = ???
  def rotateFromVector(x: js.Number, y: js.Number): SVGMatrix = ???
  def skewX(angle: js.Number): SVGMatrix = ???
}

object SVGMatrix extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGMatrix),List())))) */
}

trait MSPopupWindow extends js.Object {
  var document: Document = _
  var isOpen: js.Boolean = _
  def show(x: js.Number, y: js.Number, w: js.Number, h: js.Number, element: js.Any): Unit = ???
  def show(x: js.Number, y: js.Number, w: js.Number, h: js.Number): Unit = ???
  def hide(): Unit = ???
}

object MSPopupWindow extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSPopupWindow),List())))) */
}

trait BeforeUnloadEvent extends Event {
  var returnValue: js.String = _
}

object BeforeUnloadEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(BeforeUnloadEvent),List())))) */
}

trait SVGUseElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired with SVGURIReference {
  var y: SVGAnimatedLength = _
  var width: SVGAnimatedLength = _
  var animatedInstanceRoot: SVGElementInstance = _
  var instanceRoot: SVGElementInstance = _
  var x: SVGAnimatedLength = _
  var height: SVGAnimatedLength = _
}

object SVGUseElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGUseElement),List())))) */
}

trait Event extends js.Object {
  var timeStamp: js.Number = _
  var defaultPrevented: js.Boolean = _
  var isTrusted: js.Boolean = _
  var currentTarget: EventTarget = _
  var cancelBubble: js.Boolean = _
  var target: EventTarget = _
  var eventPhase: js.Number = _
  var cancelable: js.Boolean = _
  var `type`: js.String = _
  var srcElement: Element = _
  var bubbles: js.Boolean = _
  def initEvent(eventTypeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean): Unit = ???
  def stopPropagation(): Unit = ???
  def stopImmediatePropagation(): Unit = ???
  def preventDefault(): Unit = ???
  var CAPTURING_PHASE: js.Number = _
  var AT_TARGET: js.Number = _
  var BUBBLING_PHASE: js.Number = _
}

object Event extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Event),List())))) */
  var CAPTURING_PHASE: js.Number = _
  var AT_TARGET: js.Number = _
  var BUBBLING_PHASE: js.Number = _
}

trait ImageData extends js.Object {
  var width: js.Number = _
  var data: js.Array[js.Number] = _
  var height: js.Number = _
}

object ImageData extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(ImageData),List())))) */
}

trait HTMLTableColElement extends HTMLElement with HTMLTableAlignment {
  var width: js.Any = _
  var align: js.String = _
  var span: js.Number = _
}

object HTMLTableColElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLTableColElement),List())))) */
}

trait SVGException extends js.Object {
  var code: js.Number = _
  var message: js.String = _
  
  var SVG_MATRIX_NOT_INVERTABLE: js.Number = _
  var SVG_WRONG_TYPE_ERR: js.Number = _
  var SVG_INVALID_VALUE_ERR: js.Number = _
  var name: js.String = _
}

object SVGException extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGException),List())))) */
  var SVG_MATRIX_NOT_INVERTABLE: js.Number = _
  var SVG_WRONG_TYPE_ERR: js.Number = _
  var SVG_INVALID_VALUE_ERR: js.Number = _
}

trait SVGLinearGradientElement extends SVGGradientElement {
  var y1: SVGAnimatedLength = _
  var x2: SVGAnimatedLength = _
  var x1: SVGAnimatedLength = _
  var y2: SVGAnimatedLength = _
}

object SVGLinearGradientElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGLinearGradientElement),List())))) */
}

trait HTMLTableAlignment extends js.Object {
  var ch: js.String = _
  var vAlign: js.String = _
  var chOff: js.String = _
}

trait SVGAnimatedEnumeration extends js.Object {
  var animVal: js.Number = _
  var baseVal: js.Number = _
}

object SVGAnimatedEnumeration extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGAnimatedEnumeration),List())))) */
}

trait DOML2DeprecatedSizeProperty extends js.Object {
  var size: js.Number = _
}

trait HTMLUListElement extends HTMLElement with DOML2DeprecatedListSpaceReduction with DOML2DeprecatedListNumberingAndBulletStyle {
}

object HTMLUListElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLUListElement),List())))) */
}

trait SVGRectElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
  var y: SVGAnimatedLength = _
  var width: SVGAnimatedLength = _
  var ry: SVGAnimatedLength = _
  var rx: SVGAnimatedLength = _
  var x: SVGAnimatedLength = _
  var height: SVGAnimatedLength = _
}

object SVGRectElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGRectElement),List())))) */
}

trait ErrorEventHandler extends js.Object {
  def apply(event: Event, source: js.String, fileno: js.Number, columnNumber: js.Number): Unit = ???
}

trait HTMLDivElement extends HTMLElement with MSDataBindingExtensions {
  var align: js.String = _
  var noWrap: js.Boolean = _
}

object HTMLDivElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLDivElement),List())))) */
}

trait DOML2DeprecatedBorderStyle extends js.Object {
  var border: js.String = _
}

trait NamedNodeMap extends js.Object {
  var length: js.Number = _
  def removeNamedItemNS(namespaceURI: js.String, localName: js.String): Attr = ???
  def item(index: js.Number): Attr = ???
  @scala.js.annotation.JSBracketAccess
  def apply(index: js.Number): Attr = ???
  @scala.js.annotation.JSBracketAccess
  def update(index: js.Number, v: Attr): Unit = ???
  def removeNamedItem(name: js.String): Attr = ???
  def getNamedItem(name: js.String): Attr = ???
  def setNamedItem(arg: Attr): Attr = ???
  def getNamedItemNS(namespaceURI: js.String, localName: js.String): Attr = ???
  def setNamedItemNS(arg: Attr): Attr = ???
}

object NamedNodeMap extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(NamedNodeMap),List())))) */
}

trait MediaList extends js.Object {
  var length: js.Number = _
  var mediaText: js.String = _
  def deleteMedium(oldMedium: js.String): Unit = ???
  def appendMedium(newMedium: js.String): Unit = ???
  def item(index: js.Number): js.String = ???
  @scala.js.annotation.JSBracketAccess
  def apply(index: js.Number): js.String = ???
  @scala.js.annotation.JSBracketAccess
  def update(index: js.Number, v: js.String): Unit = ???
  
}

object MediaList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MediaList),List())))) */
}

trait SVGPathSegCurvetoQuadraticSmoothAbs extends SVGPathSeg {
  var y: js.Number = _
  var x: js.Number = _
}

object SVGPathSegCurvetoQuadraticSmoothAbs extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGPathSegCurvetoQuadraticSmoothAbs),List())))) */
}

trait SVGPathSegCurvetoCubicSmoothRel extends SVGPathSeg {
  var y: js.Number = _
  var x2: js.Number = _
  var x: js.Number = _
  var y2: js.Number = _
}

object SVGPathSegCurvetoCubicSmoothRel extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGPathSegCurvetoCubicSmoothRel),List())))) */
}

trait SVGLengthList extends js.Object {
  var numberOfItems: js.Number = _
  def replaceItem(newItem: SVGLength, index: js.Number): SVGLength = ???
  def getItem(index: js.Number): SVGLength = ???
  def clear(): Unit = ???
  def appendItem(newItem: SVGLength): SVGLength = ???
  def initialize(newItem: SVGLength): SVGLength = ???
  def removeItem(index: js.Number): SVGLength = ???
  def insertItemBefore(newItem: SVGLength, index: js.Number): SVGLength = ???
}

object SVGLengthList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGLengthList),List())))) */
}

trait ProcessingInstruction extends Node {
  var target: js.String = _
  var data: js.String = _
}

object ProcessingInstruction extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(ProcessingInstruction),List())))) */
}

trait MSWindowExtensions extends js.Object {
  var status: js.String = _
  var onmouseleave: js.Function1[MouseEvent, js.Any] = _
  var screenLeft: js.Number = _
  var offscreenBuffering: js.Any = _
  var maxConnectionsPerServer: js.Number = _
  var onmouseenter: js.Function1[MouseEvent, js.Any] = _
  var clipboardData: DataTransfer = _
  var defaultStatus: js.String = _
  var clientInformation: Navigator = _
  var closed: js.Boolean = _
  var onhelp: js.Function1[Event, js.Any] = _
  var external: External = _
  var event: MSEventObj = _
  var onfocusout: js.Function1[FocusEvent, js.Any] = _
  var screenTop: js.Number = _
  var onfocusin: js.Function1[FocusEvent, js.Any] = _
  def showModelessDialog(url: js.String, argument: js.Any, options: js.Any): Window = ???
  def showModelessDialog(url: js.String, argument: js.Any): Window = ???
  def showModelessDialog(url: js.String): Window = ???
  def showModelessDialog(): Window = ???
  def navigate(url: js.String): Unit = ???
  def resizeBy(x: js.Number, y: js.Number): Unit = ???
  def resizeBy(x: js.Number): Unit = ???
  def resizeBy(): Unit = ???
  def item(index: js.Any): js.Dynamic = ???
  def resizeTo(x: js.Number, y: js.Number): Unit = ???
  def resizeTo(x: js.Number): Unit = ???
  def resizeTo(): Unit = ???
  def createPopup(arguments: js.Any): MSPopupWindow = ???
  def createPopup(): MSPopupWindow = ???
  def toStaticHTML(html: js.String): js.String = ???
  def execScript(code: js.String, language: js.String): js.Dynamic = ???
  def execScript(code: js.String): js.Dynamic = ???
  def msWriteProfilerMark(profilerMarkName: js.String): Unit = ???
  def moveTo(x: js.Number, y: js.Number): Unit = ???
  def moveTo(x: js.Number): Unit = ???
  def moveTo(): Unit = ???
  def moveBy(x: js.Number, y: js.Number): Unit = ???
  def moveBy(x: js.Number): Unit = ???
  def moveBy(): Unit = ???
  def showHelp(url: js.String, helpArg: js.Any, features: js.String): Unit = ???
  def showHelp(url: js.String, helpArg: js.Any): Unit = ???
  def showHelp(url: js.String): Unit = ???
  def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}

trait MSBehaviorUrnsCollection extends js.Object {
  var length: js.Number = _
  def item(index: js.Number): js.String = ???
}

object MSBehaviorUrnsCollection extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSBehaviorUrnsCollection),List())))) */
}

trait CSSFontFaceRule extends CSSRule {
  var style: CSSStyleDeclaration = _
}

object CSSFontFaceRule extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(CSSFontFaceRule),List())))) */
}

trait DOML2DeprecatedBackgroundStyle extends js.Object {
  var background: js.String = _
}

trait TextEvent extends UIEvent {
  var inputMethod: js.Number = _
  var data: js.String = _
  var locale: js.String = _
  def initTextEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, viewArg: Window, dataArg: js.String, inputMethod: js.Number, locale: js.String): Unit = ???
  var DOM_INPUT_METHOD_KEYBOARD: js.Number = _
  var DOM_INPUT_METHOD_DROP: js.Number = _
  var DOM_INPUT_METHOD_IME: js.Number = _
  var DOM_INPUT_METHOD_SCRIPT: js.Number = _
  var DOM_INPUT_METHOD_VOICE: js.Number = _
  var DOM_INPUT_METHOD_UNKNOWN: js.Number = _
  var DOM_INPUT_METHOD_PASTE: js.Number = _
  var DOM_INPUT_METHOD_HANDWRITING: js.Number = _
  var DOM_INPUT_METHOD_OPTION: js.Number = _
  var DOM_INPUT_METHOD_MULTIMODAL: js.Number = _
}

object TextEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(TextEvent),List())))) */
  var DOM_INPUT_METHOD_KEYBOARD: js.Number = _
  var DOM_INPUT_METHOD_DROP: js.Number = _
  var DOM_INPUT_METHOD_IME: js.Number = _
  var DOM_INPUT_METHOD_SCRIPT: js.Number = _
  var DOM_INPUT_METHOD_VOICE: js.Number = _
  var DOM_INPUT_METHOD_UNKNOWN: js.Number = _
  var DOM_INPUT_METHOD_PASTE: js.Number = _
  var DOM_INPUT_METHOD_HANDWRITING: js.Number = _
  var DOM_INPUT_METHOD_OPTION: js.Number = _
  var DOM_INPUT_METHOD_MULTIMODAL: js.Number = _
}

trait DocumentFragment extends Node with NodeSelector with MSEventAttachmentTarget with MSNodeExtensions {
}

object DocumentFragment extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(DocumentFragment),List())))) */
}

trait SVGPolylineElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGAnimatedPoints with SVGTests with SVGExternalResourcesRequired {
}

object SVGPolylineElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGPolylineElement),List())))) */
}

trait SVGAnimatedPathData extends js.Object {
  var pathSegList: SVGPathSegList = _
}

trait Position extends js.Object {
  var timestamp: js.Number = _
  var coords: Coordinates = _
}

object Position extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Position),List())))) */
}

trait BookmarkCollection extends js.Object {
  var length: js.Number = _
  def item(index: js.Number): js.Dynamic = ???
  @scala.js.annotation.JSBracketAccess
  def apply(index: js.Number): js.Any = ???
  @scala.js.annotation.JSBracketAccess
  def update(index: js.Number, v: js.Any): Unit = ???
}

object BookmarkCollection extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(BookmarkCollection),List())))) */
}

trait PerformanceMark extends PerformanceEntry {
}

object PerformanceMark extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(PerformanceMark),List())))) */
}

trait CSSPageRule extends CSSRule {
  var pseudoClass: js.String = _
  var selectorText: js.String = _
  var selector: js.String = _
  var style: CSSStyleDeclaration = _
}

object CSSPageRule extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(CSSPageRule),List())))) */
}

trait HTMLBRElement extends HTMLElement {
  var clear: js.String = _
}

object HTMLBRElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLBRElement),List())))) */
}

trait MSNavigatorExtensions extends js.Object {
  var userLanguage: js.String = _
  var plugins: MSPluginsCollection = _
  var cookieEnabled: js.Boolean = _
  var appCodeName: js.String = _
  var cpuClass: js.String = _
  var appMinorVersion: js.String = _
  var connectionSpeed: js.Number = _
  var browserLanguage: js.String = _
  var mimeTypes: MSMimeTypesCollection = _
  var systemLanguage: js.String = _
  def javaEnabled(): js.Boolean = ???
  def taintEnabled(): js.Boolean = ???
}

trait HTMLSpanElement extends HTMLElement with MSDataBindingExtensions {
}

object HTMLSpanElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLSpanElement),List())))) */
}

trait HTMLHeadElement extends HTMLElement {
  var profile: js.String = _
}

object HTMLHeadElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLHeadElement),List())))) */
}

trait HTMLHeadingElement extends HTMLElement with DOML2DeprecatedTextFlowControl {
  var align: js.String = _
}

object HTMLHeadingElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLHeadingElement),List())))) */
}

trait HTMLFormElement extends HTMLElement with MSHTMLCollectionExtensions {
  var length: js.Number = _
  var target: js.String = _
  var acceptCharset: js.String = _
  var enctype: js.String = _
  var elements: HTMLCollection = _
  var action: js.String = _
  var name: js.String = _
  var method: js.String = _
  var encoding: js.String = _
  def reset(): Unit = ???
  def item(name: js.Any, index: js.Any): js.Dynamic = ???
  def item(name: js.Any): js.Dynamic = ???
  def item(): js.Dynamic = ???
  def submit(): Unit = ???
  def namedItem(name: js.String): js.Dynamic = ???
  @scala.js.annotation.JSBracketAccess
  def apply(name: js.String): js.Any = ???
  @scala.js.annotation.JSBracketAccess
  def update(name: js.String, v: js.Any): Unit = ???
  var autocomplete: js.String = _
  var noValidate: js.Boolean = _
  def checkValidity(): js.Boolean = ???
}

object HTMLFormElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLFormElement),List())))) */
}

trait SVGZoomAndPan extends js.Object {
  var zoomAndPan: js.Number = _
  var SVG_ZOOMANDPAN_MAGNIFY: js.Number = _
  var SVG_ZOOMANDPAN_UNKNOWN: js.Number = _
  var SVG_ZOOMANDPAN_DISABLE: js.Number = _
}

object SVGZoomAndPan extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGZoomAndPan),List())))) */
  var SVG_ZOOMANDPAN_MAGNIFY: js.Number = _
  var SVG_ZOOMANDPAN_UNKNOWN: js.Number = _
  var SVG_ZOOMANDPAN_DISABLE: js.Number = _
}

trait HTMLMediaElement extends HTMLElement {
  var initialTime: js.Number = _
  var played: TimeRanges = _
  var currentSrc: js.String = _
  var autobuffer: js.Boolean = _
  var loop: js.Boolean = _
  var ended: js.Boolean = _
  var buffered: TimeRanges = _
  var error: MediaError = _
  var seekable: TimeRanges = _
  var autoplay: js.Boolean = _
  var controls: js.Boolean = _
  var volume: js.Number = _
  var src: js.String = _
  var playbackRate: js.Number = _
  var duration: js.Number = _
  var muted: js.Boolean = _
  var defaultPlaybackRate: js.Number = _
  var paused: js.Boolean = _
  var seeking: js.Boolean = _
  var currentTime: js.Number = _
  var preload: js.String = _
  var networkState: js.Number = _
  def pause(): Unit = ???
  def play(): Unit = ???
  def load(): Unit = ???
  def canPlayType(`type`: js.String): js.String = ???
  var HAVE_METADATA: js.Number = _
  var HAVE_CURRENT_DATA: js.Number = _
  var HAVE_NOTHING: js.Number = _
  var NETWORK_NO_SOURCE: js.Number = _
  var HAVE_ENOUGH_DATA: js.Number = _
  var NETWORK_EMPTY: js.Number = _
  var NETWORK_LOADING: js.Number = _
  var NETWORK_IDLE: js.Number = _
  var HAVE_FUTURE_DATA: js.Number = _
  var msAudioCategory: js.String = _
  var msRealTime: js.Boolean = _
  var msPlayToPrimary: js.Boolean = _
  var textTracks: TextTrackList = _
  var msPlayToDisabled: js.Boolean = _
  var audioTracks: AudioTrackList = _
  var msPlayToSource: js.Any = _
  var msAudioDeviceType: js.String = _
  def msClearEffects(): Unit = ???
  def msSetMediaProtectionManager(mediaProtectionManager: js.Any): Unit = ???
  def msSetMediaProtectionManager(): Unit = ???
  def msInsertAudioEffect(activatableClassId: js.String, effectRequired: js.Boolean, config: js.Any): Unit = ???
  def msInsertAudioEffect(activatableClassId: js.String, effectRequired: js.Boolean): Unit = ???
}

object HTMLMediaElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLMediaElement),List())))) */
  var HAVE_METADATA: js.Number = _
  var HAVE_CURRENT_DATA: js.Number = _
  var HAVE_NOTHING: js.Number = _
  var NETWORK_NO_SOURCE: js.Number = _
  var HAVE_ENOUGH_DATA: js.Number = _
  var NETWORK_EMPTY: js.Number = _
  var NETWORK_LOADING: js.Number = _
  var NETWORK_IDLE: js.Number = _
  var HAVE_FUTURE_DATA: js.Number = _
}

trait ElementCSSInlineStyle extends js.Object {
  var runtimeStyle: MSStyleCSSProperties = _
  var currentStyle: MSCurrentStyleCSSProperties = _
  def doScroll(component: js.Any): Unit = ???
  def doScroll(): Unit = ???
  def componentFromPoint(x: js.Number, y: js.Number): js.String = ???
}

trait DOMParser extends js.Object {
  def parseFromString(source: js.String, mimeType: js.String): Document = ???
}

object DOMParser extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(DOMParser),List())))) */
}

trait MSMimeTypesCollection extends js.Object {
  var length: js.Number = _
}

object MSMimeTypesCollection extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSMimeTypesCollection),List())))) */
}

trait StyleSheet extends js.Object {
  var disabled: js.Boolean = _
  var ownerNode: Node = _
  var parentStyleSheet: StyleSheet = _
  var media: MediaList = _
  var `type`: js.String = _
  var title: js.String = _
}

object StyleSheet extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(StyleSheet),List())))) */
}

trait SVGTextPathElement extends SVGTextContentElement with SVGURIReference {
  var startOffset: SVGAnimatedLength = _
  var method: SVGAnimatedEnumeration = _
  var spacing: SVGAnimatedEnumeration = _
  var TEXTPATH_SPACINGTYPE_EXACT: js.Number = _
  var TEXTPATH_METHODTYPE_STRETCH: js.Number = _
  var TEXTPATH_SPACINGTYPE_AUTO: js.Number = _
  var TEXTPATH_SPACINGTYPE_UNKNOWN: js.Number = _
  var TEXTPATH_METHODTYPE_UNKNOWN: js.Number = _
  var TEXTPATH_METHODTYPE_ALIGN: js.Number = _
}

object SVGTextPathElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGTextPathElement),List())))) */
  var TEXTPATH_SPACINGTYPE_EXACT: js.Number = _
  var TEXTPATH_METHODTYPE_STRETCH: js.Number = _
  var TEXTPATH_SPACINGTYPE_AUTO: js.Number = _
  var TEXTPATH_SPACINGTYPE_UNKNOWN: js.Number = _
  var TEXTPATH_METHODTYPE_UNKNOWN: js.Number = _
  var TEXTPATH_METHODTYPE_ALIGN: js.Number = _
}

trait HTMLDTElement extends HTMLElement {
  var noWrap: js.Boolean = _
}

object HTMLDTElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLDTElement),List())))) */
}

trait NodeList extends js.Object {
  var length: js.Number = _
  def item(index: js.Number): Node = ???
  @scala.js.annotation.JSBracketAccess
  def apply(index: js.Number): Node = ???
  @scala.js.annotation.JSBracketAccess
  def update(index: js.Number, v: Node): Unit = ???
}

object NodeList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(NodeList),List())))) */
}

trait NodeListOf[TNode <: Node] extends NodeList {
  override def item(index: js.Number): TNode = ???
  @scala.js.annotation.JSBracketAccess
  override def apply(index: js.Number): TNode = ???
  
}

trait XMLSerializer extends js.Object {
  def serializeToString(target: Node): js.String = ???
}

object XMLSerializer extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(XMLSerializer),List())))) */
}

trait PerformanceMeasure extends PerformanceEntry {
}

object PerformanceMeasure extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(PerformanceMeasure),List())))) */
}

trait SVGGradientElement extends SVGElement with SVGUnitTypes with SVGStylable with SVGExternalResourcesRequired with SVGURIReference {
  var spreadMethod: SVGAnimatedEnumeration = _
  var gradientTransform: SVGAnimatedTransformList = _
  var gradientUnits: SVGAnimatedEnumeration = _
  var SVG_SPREADMETHOD_REFLECT: js.Number = _
  var SVG_SPREADMETHOD_PAD: js.Number = _
  var SVG_SPREADMETHOD_UNKNOWN: js.Number = _
  var SVG_SPREADMETHOD_REPEAT: js.Number = _
}

object SVGGradientElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGGradientElement),List())))) */
  var SVG_SPREADMETHOD_REFLECT: js.Number = _
  var SVG_SPREADMETHOD_PAD: js.Number = _
  var SVG_SPREADMETHOD_UNKNOWN: js.Number = _
  var SVG_SPREADMETHOD_REPEAT: js.Number = _
}

trait NodeFilter extends js.Object {
  def acceptNode(n: Node): js.Number = ???
  var SHOW_ENTITY_REFERENCE: js.Number = _
  var SHOW_NOTATION: js.Number = _
  var SHOW_ENTITY: js.Number = _
  var SHOW_DOCUMENT: js.Number = _
  var SHOW_PROCESSING_INSTRUCTION: js.Number = _
  var FILTER_REJECT: js.Number = _
  var SHOW_CDATA_SECTION: js.Number = _
  var FILTER_ACCEPT: js.Number = _
  var SHOW_ALL: js.Number = _
  var SHOW_DOCUMENT_TYPE: js.Number = _
  var SHOW_TEXT: js.Number = _
  var SHOW_ELEMENT: js.Number = _
  var SHOW_COMMENT: js.Number = _
  var FILTER_SKIP: js.Number = _
  var SHOW_ATTRIBUTE: js.Number = _
  var SHOW_DOCUMENT_FRAGMENT: js.Number = _
}

object NodeFilter extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(NodeFilter),List())))) */
  var SHOW_ENTITY_REFERENCE: js.Number = _
  var SHOW_NOTATION: js.Number = _
  var SHOW_ENTITY: js.Number = _
  var SHOW_DOCUMENT: js.Number = _
  var SHOW_PROCESSING_INSTRUCTION: js.Number = _
  var FILTER_REJECT: js.Number = _
  var SHOW_CDATA_SECTION: js.Number = _
  var FILTER_ACCEPT: js.Number = _
  var SHOW_ALL: js.Number = _
  var SHOW_DOCUMENT_TYPE: js.Number = _
  var SHOW_TEXT: js.Number = _
  var SHOW_ELEMENT: js.Number = _
  var SHOW_COMMENT: js.Number = _
  var FILTER_SKIP: js.Number = _
  var SHOW_ATTRIBUTE: js.Number = _
  var SHOW_DOCUMENT_FRAGMENT: js.Number = _
}

trait SVGNumberList extends js.Object {
  var numberOfItems: js.Number = _
  def replaceItem(newItem: SVGNumber, index: js.Number): SVGNumber = ???
  def getItem(index: js.Number): SVGNumber = ???
  def clear(): Unit = ???
  def appendItem(newItem: SVGNumber): SVGNumber = ???
  def initialize(newItem: SVGNumber): SVGNumber = ???
  def removeItem(index: js.Number): SVGNumber = ???
  def insertItemBefore(newItem: SVGNumber, index: js.Number): SVGNumber = ???
}

object SVGNumberList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGNumberList),List())))) */
}

trait MediaError extends js.Object {
  var code: js.Number = _
  var MEDIA_ERR_ABORTED: js.Number = _
  var MEDIA_ERR_NETWORK: js.Number = _
  var MEDIA_ERR_SRC_NOT_SUPPORTED: js.Number = _
  var MEDIA_ERR_DECODE: js.Number = _
  var msExtendedCode: js.Number = _
}

object MediaError extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MediaError),List())))) */
  var MEDIA_ERR_ABORTED: js.Number = _
  var MEDIA_ERR_NETWORK: js.Number = _
  var MEDIA_ERR_SRC_NOT_SUPPORTED: js.Number = _
  var MEDIA_ERR_DECODE: js.Number = _
}

trait HTMLFieldSetElement extends HTMLElement {
  var align: js.String = _
  var form: HTMLFormElement = _
  var validationMessage: js.String = _
  var validity: ValidityState = _
  var willValidate: js.Boolean = _
  def checkValidity(): js.Boolean = ???
  def setCustomValidity(error: js.String): Unit = ???
}

object HTMLFieldSetElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLFieldSetElement),List())))) */
}

trait HTMLBGSoundElement extends HTMLElement {
  var balance: js.Any = _
  var volume: js.Any = _
  var src: js.String = _
  var loop: js.Number = _
}

object HTMLBGSoundElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLBGSoundElement),List())))) */
}

trait HTMLElement extends Element with ElementCSSInlineStyle with MSEventAttachmentTarget with MSNodeExtensions {
  var onmouseleave: js.Function1[MouseEvent, js.Any] = _
  var onbeforecut: js.Function1[DragEvent, js.Any] = _
  var onkeydown: js.Function1[KeyboardEvent, js.Any] = _
  var onmove: js.Function1[MSEventObj, js.Any] = _
  var onkeyup: js.Function1[KeyboardEvent, js.Any] = _
  var onreset: js.Function1[Event, js.Any] = _
  var onhelp: js.Function1[Event, js.Any] = _
  var ondragleave: js.Function1[DragEvent, js.Any] = _
  var className: js.String = _
  var onfocusin: js.Function1[FocusEvent, js.Any] = _
  var onseeked: js.Function1[Event, js.Any] = _
  var recordNumber: js.Any = _
  var title: js.String = _
  var parentTextEdit: Element = _
  var outerHTML: js.String = _
  var ondurationchange: js.Function1[Event, js.Any] = _
  var offsetHeight: js.Number = _
  var all: HTMLCollection = _
  var dir: js.String = _
  var onemptied: js.Function1[Event, js.Any] = _
  var onseeking: js.Function1[Event, js.Any] = _
  var oncanplay: js.Function1[Event, js.Any] = _
  var ondeactivate: js.Function1[UIEvent, js.Any] = _
  var ondatasetchanged: js.Function1[MSEventObj, js.Any] = _
  var onrowsdelete: js.Function1[MSEventObj, js.Any] = _
  var sourceIndex: js.Number = _
  var onloadstart: js.Function1[Event, js.Any] = _
  var onlosecapture: js.Function1[MSEventObj, js.Any] = _
  var ondragenter: js.Function1[DragEvent, js.Any] = _
  var oncontrolselect: js.Function1[MSEventObj, js.Any] = _
  var onsubmit: js.Function1[Event, js.Any] = _
  var behaviorUrns: MSBehaviorUrnsCollection = _
  var scopeName: js.String = _
  var onchange: js.Function1[Event, js.Any] = _
  var id: js.String = _
  var onlayoutcomplete: js.Function1[MSEventObj, js.Any] = _
  var uniqueID: js.String = _
  var onbeforeactivate: js.Function1[UIEvent, js.Any] = _
  var oncanplaythrough: js.Function1[Event, js.Any] = _
  var onbeforeupdate: js.Function1[MSEventObj, js.Any] = _
  var onfilterchange: js.Function1[MSEventObj, js.Any] = _
  var offsetParent: Element = _
  var ondatasetcomplete: js.Function1[MSEventObj, js.Any] = _
  var onsuspend: js.Function1[Event, js.Any] = _
  var readyState: js.Any = _
  var onmouseenter: js.Function1[MouseEvent, js.Any] = _
  var innerText: js.String = _
  var onerrorupdate: js.Function1[MSEventObj, js.Any] = _
  var onmouseout: js.Function1[MouseEvent, js.Any] = _
  var parentElement: HTMLElement = _
  var onmousewheel: js.Function1[MouseWheelEvent, js.Any] = _
  var onvolumechange: js.Function1[Event, js.Any] = _
  var oncellchange: js.Function1[MSEventObj, js.Any] = _
  var onrowexit: js.Function1[MSEventObj, js.Any] = _
  var onrowsinserted: js.Function1[MSEventObj, js.Any] = _
  var onpropertychange: js.Function1[MSEventObj, js.Any] = _
  var filters: Object = _
  var children: HTMLCollection = _
  var ondragend: js.Function1[DragEvent, js.Any] = _
  var onbeforepaste: js.Function1[DragEvent, js.Any] = _
  var ondragover: js.Function1[DragEvent, js.Any] = _
  var offsetTop: js.Number = _
  var onmouseup: js.Function1[MouseEvent, js.Any] = _
  var ondragstart: js.Function1[DragEvent, js.Any] = _
  var onbeforecopy: js.Function1[DragEvent, js.Any] = _
  var ondrag: js.Function1[DragEvent, js.Any] = _
  var innerHTML: js.String = _
  var onmouseover: js.Function1[MouseEvent, js.Any] = _
  var lang: js.String = _
  var uniqueNumber: js.Number = _
  var onpause: js.Function1[Event, js.Any] = _
  var tagUrn: js.String = _
  var onmousedown: js.Function1[MouseEvent, js.Any] = _
  var onclick: js.Function1[MouseEvent, js.Any] = _
  var onwaiting: js.Function1[Event, js.Any] = _
  var onresizestart: js.Function1[MSEventObj, js.Any] = _
  var offsetLeft: js.Number = _
  var isTextEdit: js.Boolean = _
  var isDisabled: js.Boolean = _
  var onpaste: js.Function1[DragEvent, js.Any] = _
  var canHaveHTML: js.Boolean = _
  var onmoveend: js.Function1[MSEventObj, js.Any] = _
  var language: js.String = _
  var onstalled: js.Function1[Event, js.Any] = _
  var onmousemove: js.Function1[MouseEvent, js.Any] = _
  var style: MSStyleCSSProperties = _
  var isContentEditable: js.Boolean = _
  var onbeforeeditfocus: js.Function1[MSEventObj, js.Any] = _
  var onratechange: js.Function1[Event, js.Any] = _
  var contentEditable: js.String = _
  var tabIndex: js.Number = _
  var document: Document = _
  var onprogress: js.Function1[js.Any, js.Any] = _
  var ondblclick: js.Function1[MouseEvent, js.Any] = _
  var oncontextmenu: js.Function1[MouseEvent, js.Any] = _
  var onloadedmetadata: js.Function1[Event, js.Any] = _
  var onafterupdate: js.Function1[MSEventObj, js.Any] = _
  var onplay: js.Function1[Event, js.Any] = _
  var onresizeend: js.Function1[MSEventObj, js.Any] = _
  var onplaying: js.Function1[Event, js.Any] = _
  var isMultiLine: js.Boolean = _
  var onfocusout: js.Function1[FocusEvent, js.Any] = _
  var onabort: js.Function1[UIEvent, js.Any] = _
  var ondataavailable: js.Function1[MSEventObj, js.Any] = _
  var hideFocus: js.Boolean = _
  var onreadystatechange: js.Function1[Event, js.Any] = _
  var onkeypress: js.Function1[KeyboardEvent, js.Any] = _
  var onloadeddata: js.Function1[Event, js.Any] = _
  var onbeforedeactivate: js.Function1[UIEvent, js.Any] = _
  var outerText: js.String = _
  var disabled: js.Boolean = _
  var onactivate: js.Function1[UIEvent, js.Any] = _
  var accessKey: js.String = _
  var onmovestart: js.Function1[MSEventObj, js.Any] = _
  var onselectstart: js.Function1[Event, js.Any] = _
  var ontimeupdate: js.Function1[Event, js.Any] = _
  var oncut: js.Function1[DragEvent, js.Any] = _
  var onselect: js.Function1[UIEvent, js.Any] = _
  var ondrop: js.Function1[DragEvent, js.Any] = _
  var offsetWidth: js.Number = _
  var oncopy: js.Function1[DragEvent, js.Any] = _
  var onended: js.Function1[Event, js.Any] = _
  var onscroll: js.Function1[UIEvent, js.Any] = _
  var onrowenter: js.Function1[MSEventObj, js.Any] = _
  var canHaveChildren: js.Boolean = _
  var oninput: js.Function1[Event, js.Any] = _
  def dragDrop(): js.Boolean = ???
  def scrollIntoView(top: js.Boolean): Unit = ???
  def scrollIntoView(): Unit = ???
  def addFilter(filter: Object): Unit = ???
  def setCapture(containerCapture: js.Boolean): Unit = ???
  def setCapture(): Unit = ???
  def focus(): Unit = ???
  def getAdjacentText(where: js.String): js.String = ???
  def insertAdjacentText(where: js.String, text: js.String): Unit = ???
  def getElementsByClassName(classNames: js.String): NodeList = ???
  def setActive(): Unit = ???
  def removeFilter(filter: Object): Unit = ???
  def blur(): Unit = ???
  def clearAttributes(): Unit = ???
  def releaseCapture(): Unit = ???
  def createControlRange(): ControlRangeCollection = ???
  def removeBehavior(cookie: js.Number): js.Boolean = ???
  def contains(child: HTMLElement): js.Boolean = ???
  def click(): Unit = ???
  def insertAdjacentElement(position: js.String, insertedElement: Element): Element = ???
  def mergeAttributes(source: HTMLElement, preserveIdentity: js.Boolean): Unit = ???
  def mergeAttributes(source: HTMLElement): Unit = ???
  def replaceAdjacentText(where: js.String, newText: js.String): js.String = ???
  def applyElement(apply: Element, where: js.String): Element = ???
  def applyElement(apply: Element): Element = ???
  def addBehavior(bstrUrl: js.String, factory: js.Any): js.Number = ???
  def addBehavior(bstrUrl: js.String): js.Number = ???
  def insertAdjacentHTML(where: js.String, html: js.String): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
  var onmscontentzoom: js.Function1[js.Any, js.Any] = _
  var oncuechange: js.Function1[Event, js.Any] = _
  var spellcheck: js.Boolean = _
  var classList: DOMTokenList = _
  var onmsmanipulationstatechanged: js.Function1[js.Any, js.Any] = _
  var draggable: js.Boolean = _
}

object HTMLElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLElement),List())))) */
}

trait Comment extends CharacterData {
  var text: js.String = _
}

object Comment extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Comment),List())))) */
}

trait PerformanceResourceTiming extends PerformanceEntry {
  var redirectStart: js.Number = _
  var redirectEnd: js.Number = _
  var domainLookupEnd: js.Number = _
  var responseStart: js.Number = _
  var domainLookupStart: js.Number = _
  var fetchStart: js.Number = _
  var requestStart: js.Number = _
  var connectEnd: js.Number = _
  var connectStart: js.Number = _
  var initiatorType: js.String = _
  var responseEnd: js.Number = _
}

object PerformanceResourceTiming extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(PerformanceResourceTiming),List())))) */
}

trait CanvasPattern extends js.Object {
}

object CanvasPattern extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(CanvasPattern),List())))) */
}

trait HTMLHRElement extends HTMLElement with DOML2DeprecatedColorProperty with DOML2DeprecatedSizeProperty {
  var width: js.Number = _
  var align: js.String = _
  var noShade: js.Boolean = _
}

object HTMLHRElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLHRElement),List())))) */
}

trait HTMLObjectElement extends HTMLElement with GetSVGDocument with DOML2DeprecatedMarginStyle with DOML2DeprecatedBorderStyle with DOML2DeprecatedAlignmentStyle with MSDataBindingExtensions with MSDataBindingRecordSetExtensions {
  var width: js.String = _
  var codeType: js.String = _
  var `object`: Object = _
  var form: HTMLFormElement = _
  var code: js.String = _
  var archive: js.String = _
  var standby: js.String = _
  var alt: js.String = _
  var classid: js.String = _
  var name: js.String = _
  var useMap: js.String = _
  var data: js.String = _
  var height: js.String = _
  var contentDocument: Document = _
  var altHtml: js.String = _
  var codeBase: js.String = _
  var declare: js.Boolean = _
  var `type`: js.String = _
  var BaseHref: js.String = _
  var validationMessage: js.String = _
  var validity: ValidityState = _
  var willValidate: js.Boolean = _
  def checkValidity(): js.Boolean = ???
  def setCustomValidity(error: js.String): Unit = ???
}

object HTMLObjectElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLObjectElement),List())))) */
}

trait HTMLEmbedElement extends HTMLElement with GetSVGDocument {
  var width: js.String = _
  var palette: js.String = _
  var src: js.String = _
  var name: js.String = _
  var pluginspage: js.String = _
  var height: js.String = _
  var units: js.String = _
}

object HTMLEmbedElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLEmbedElement),List())))) */
}

trait StorageEvent extends Event {
  var oldValue: js.Any = _
  var newValue: js.Any = _
  var url: js.String = _
  var storageArea: Storage = _
  var key: js.String = _
  def initStorageEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, keyArg: js.String, oldValueArg: js.Any, newValueArg: js.Any, urlArg: js.String, storageAreaArg: Storage): Unit = ???
}

object StorageEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(StorageEvent),List())))) */
}

trait CharacterData extends Node {
  var length: js.Number = _
  var data: js.String = _
  def deleteData(offset: js.Number, count: js.Number): Unit = ???
  def replaceData(offset: js.Number, count: js.Number, arg: js.String): Unit = ???
  def appendData(arg: js.String): Unit = ???
  def insertData(offset: js.Number, arg: js.String): Unit = ???
  def substringData(offset: js.Number, count: js.Number): js.String = ???
}

object CharacterData extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(CharacterData),List())))) */
}

trait HTMLOptGroupElement extends HTMLElement with MSDataBindingExtensions {
  var index: js.Number = _
  var defaultSelected: js.Boolean = _
  var text: js.String = _
  var value: js.String = _
  var form: HTMLFormElement = _
  var label: js.String = _
  var selected: js.Boolean = _
}

object HTMLOptGroupElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLOptGroupElement),List())))) */
}

trait HTMLIsIndexElement extends HTMLElement {
  var form: HTMLFormElement = _
  var action: js.String = _
  var prompt: js.String = _
}

object HTMLIsIndexElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLIsIndexElement),List())))) */
}

trait SVGPathSegLinetoRel extends SVGPathSeg {
  var y: js.Number = _
  var x: js.Number = _
}

object SVGPathSegLinetoRel extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGPathSegLinetoRel),List())))) */
}

trait DOMException extends js.Object {
  var code: js.Number = _
  var message: js.String = _
  
  var HIERARCHY_REQUEST_ERR: js.Number = _
  var NO_MODIFICATION_ALLOWED_ERR: js.Number = _
  var INVALID_MODIFICATION_ERR: js.Number = _
  var NAMESPACE_ERR: js.Number = _
  var INVALID_CHARACTER_ERR: js.Number = _
  var TYPE_MISMATCH_ERR: js.Number = _
  var ABORT_ERR: js.Number = _
  var INVALID_STATE_ERR: js.Number = _
  var SECURITY_ERR: js.Number = _
  var NETWORK_ERR: js.Number = _
  var WRONG_DOCUMENT_ERR: js.Number = _
  var QUOTA_EXCEEDED_ERR: js.Number = _
  var INDEX_SIZE_ERR: js.Number = _
  var DOMSTRING_SIZE_ERR: js.Number = _
  var SYNTAX_ERR: js.Number = _
  var SERIALIZE_ERR: js.Number = _
  var VALIDATION_ERR: js.Number = _
  var NOT_FOUND_ERR: js.Number = _
  var URL_MISMATCH_ERR: js.Number = _
  var PARSE_ERR: js.Number = _
  var NO_DATA_ALLOWED_ERR: js.Number = _
  var NOT_SUPPORTED_ERR: js.Number = _
  var INVALID_ACCESS_ERR: js.Number = _
  var INUSE_ATTRIBUTE_ERR: js.Number = _
  var name: js.String = _
  var INVALID_NODE_TYPE_ERR: js.Number = _
  var DATA_CLONE_ERR: js.Number = _
  var TIMEOUT_ERR: js.Number = _
}

object DOMException extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(DOMException),List())))) */
  var HIERARCHY_REQUEST_ERR: js.Number = _
  var NO_MODIFICATION_ALLOWED_ERR: js.Number = _
  var INVALID_MODIFICATION_ERR: js.Number = _
  var NAMESPACE_ERR: js.Number = _
  var INVALID_CHARACTER_ERR: js.Number = _
  var TYPE_MISMATCH_ERR: js.Number = _
  var ABORT_ERR: js.Number = _
  var INVALID_STATE_ERR: js.Number = _
  var SECURITY_ERR: js.Number = _
  var NETWORK_ERR: js.Number = _
  var WRONG_DOCUMENT_ERR: js.Number = _
  var QUOTA_EXCEEDED_ERR: js.Number = _
  var INDEX_SIZE_ERR: js.Number = _
  var DOMSTRING_SIZE_ERR: js.Number = _
  var SYNTAX_ERR: js.Number = _
  var SERIALIZE_ERR: js.Number = _
  var VALIDATION_ERR: js.Number = _
  var NOT_FOUND_ERR: js.Number = _
  var URL_MISMATCH_ERR: js.Number = _
  var PARSE_ERR: js.Number = _
  var NO_DATA_ALLOWED_ERR: js.Number = _
  var NOT_SUPPORTED_ERR: js.Number = _
  var INVALID_ACCESS_ERR: js.Number = _
  var INUSE_ATTRIBUTE_ERR: js.Number = _
}

trait SVGAnimatedBoolean extends js.Object {
  var animVal: js.Boolean = _
  var baseVal: js.Boolean = _
}

object SVGAnimatedBoolean extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGAnimatedBoolean),List())))) */
}

trait MSCompatibleInfoCollection extends js.Object {
  var length: js.Number = _
  def item(index: js.Number): MSCompatibleInfo = ???
}

object MSCompatibleInfoCollection extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSCompatibleInfoCollection),List())))) */
}

trait SVGSwitchElement extends SVGElement with SVGStylable with SVGTransformable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
}

object SVGSwitchElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGSwitchElement),List())))) */
}

trait SVGPreserveAspectRatio extends js.Object {
  var align: js.Number = _
  var meetOrSlice: js.Number = _
  var SVG_PRESERVEASPECTRATIO_NONE: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMINYMID: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMAXYMIN: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMINYMAX: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMAXYMAX: js.Number = _
  var SVG_MEETORSLICE_UNKNOWN: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMAXYMID: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMIDYMAX: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMINYMIN: js.Number = _
  var SVG_MEETORSLICE_MEET: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMIDYMID: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMIDYMIN: js.Number = _
  var SVG_MEETORSLICE_SLICE: js.Number = _
  var SVG_PRESERVEASPECTRATIO_UNKNOWN: js.Number = _
}

object SVGPreserveAspectRatio extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGPreserveAspectRatio),List())))) */
  var SVG_PRESERVEASPECTRATIO_NONE: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMINYMID: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMAXYMIN: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMINYMAX: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMAXYMAX: js.Number = _
  var SVG_MEETORSLICE_UNKNOWN: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMAXYMID: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMIDYMAX: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMINYMIN: js.Number = _
  var SVG_MEETORSLICE_MEET: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMIDYMID: js.Number = _
  var SVG_PRESERVEASPECTRATIO_XMIDYMIN: js.Number = _
  var SVG_MEETORSLICE_SLICE: js.Number = _
  var SVG_PRESERVEASPECTRATIO_UNKNOWN: js.Number = _
}

trait Attr extends Node {
  var expando: js.Boolean = _
  var specified: js.Boolean = _
  var ownerElement: Element = _
  var value: js.String = _
  var name: js.String = _
}

object Attr extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Attr),List())))) */
}

trait PerformanceNavigation extends js.Object {
  var redirectCount: js.Number = _
  var `type`: js.Number = _
  def toJSON(): js.Dynamic = ???
  var TYPE_RELOAD: js.Number = _
  var TYPE_RESERVED: js.Number = _
  var TYPE_BACK_FORWARD: js.Number = _
  var TYPE_NAVIGATE: js.Number = _
}

object PerformanceNavigation extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(PerformanceNavigation),List())))) */
  var TYPE_RELOAD: js.Number = _
  var TYPE_RESERVED: js.Number = _
  var TYPE_BACK_FORWARD: js.Number = _
  var TYPE_NAVIGATE: js.Number = _
}

trait SVGStopElement extends SVGElement with SVGStylable {
  var offset: SVGAnimatedNumber = _
}

object SVGStopElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGStopElement),List())))) */
}

trait PositionCallback extends js.Object {
  def apply(position: Position): Unit = ???
}

trait SVGSymbolElement extends SVGElement with SVGStylable with SVGLangSpace with SVGFitToViewBox with SVGExternalResourcesRequired {
}

object SVGSymbolElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGSymbolElement),List())))) */
}

trait SVGElementInstanceList extends js.Object {
  var length: js.Number = _
  def item(index: js.Number): SVGElementInstance = ???
}

object SVGElementInstanceList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGElementInstanceList),List())))) */
}

trait CSSRuleList extends js.Object {
  var length: js.Number = _
  def item(index: js.Number): CSSRule = ???
  @scala.js.annotation.JSBracketAccess
  def apply(index: js.Number): CSSRule = ???
  @scala.js.annotation.JSBracketAccess
  def update(index: js.Number, v: CSSRule): Unit = ???
}

object CSSRuleList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(CSSRuleList),List())))) */
}

trait MSDataBindingRecordSetExtensions extends js.Object {
  var recordset: Object = _
  def namedRecordset(dataMember: js.String, hierarchy: js.Any): Object = ???
  def namedRecordset(dataMember: js.String): Object = ???
}

trait LinkStyle extends js.Object {
  var styleSheet: StyleSheet = _
  var sheet: StyleSheet = _
}

trait HTMLVideoElement extends HTMLMediaElement {
  var width: js.Number = _
  var videoWidth: js.Number = _
  var videoHeight: js.Number = _
  var height: js.Number = _
  var poster: js.String = _
  var msIsStereo3D: js.Boolean = _
  var msStereo3DPackingMode: js.String = _
  var onMSVideoOptimalLayoutChanged: js.Function1[js.Any, js.Any] = _
  var onMSVideoFrameStepCompleted: js.Function1[js.Any, js.Any] = _
  var msStereo3DRenderMode: js.String = _
  var msIsLayoutOptimalForPlayback: js.Boolean = _
  var msHorizontalMirror: js.Boolean = _
  var onMSVideoFormatChanged: js.Function1[js.Any, js.Any] = _
  var msZoom: js.Boolean = _
  def msInsertVideoEffect(activatableClassId: js.String, effectRequired: js.Boolean, config: js.Any): Unit = ???
  def msInsertVideoEffect(activatableClassId: js.String, effectRequired: js.Boolean): Unit = ???
  def msSetVideoRectangle(left: js.Number, top: js.Number, right: js.Number, bottom: js.Number): Unit = ???
  def msFrameStep(forward: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}

object HTMLVideoElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLVideoElement),List())))) */
}

trait ClientRectList extends js.Object {
  var length: js.Number = _
  def item(index: js.Number): ClientRect = ???
  @scala.js.annotation.JSBracketAccess
  def apply(index: js.Number): ClientRect = ???
  @scala.js.annotation.JSBracketAccess
  def update(index: js.Number, v: ClientRect): Unit = ???
}

object ClientRectList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(ClientRectList),List())))) */
}

trait SVGMaskElement extends SVGElement with SVGUnitTypes with SVGStylable with SVGLangSpace with SVGTests with SVGExternalResourcesRequired {
  var y: SVGAnimatedLength = _
  var width: SVGAnimatedLength = _
  var maskUnits: SVGAnimatedEnumeration = _
  var maskContentUnits: SVGAnimatedEnumeration = _
  var x: SVGAnimatedLength = _
  var height: SVGAnimatedLength = _
}

object SVGMaskElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGMaskElement),List())))) */
}

trait External extends js.Object {
}

object External extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(External),List())))) */
}

object Audio extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(FunParam(Ident(src),true,Some(TypeRef(CoreType(string),List())))),Some(TypeRef(TypeName(HTMLAudioElement),List())))) */
}

object Option extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(FunParam(Ident(text),true,Some(TypeRef(CoreType(string),List()))), FunParam(Ident(value),true,Some(TypeRef(CoreType(string),List()))), FunParam(Ident(defaultSelected),true,Some(TypeRef(CoreType(boolean),List()))), FunParam(Ident(selected),true,Some(TypeRef(CoreType(boolean),List())))),Some(TypeRef(TypeName(HTMLOptionElement),List())))) */
}

object Image extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(FunParam(Ident(width),true,Some(TypeRef(CoreType(number),List()))), FunParam(Ident(height),true,Some(TypeRef(CoreType(number),List())))),Some(TypeRef(TypeName(HTMLImageElement),List())))) */
}

trait ObjectURLOptions extends js.Object {
  var oneTimeOnly: js.Boolean = _
}

trait MSGestureEvent extends UIEvent {
  var offsetY: js.Number = _
  var translationY: js.Number = _
  var velocityExpansion: js.Number = _
  var velocityY: js.Number = _
  var velocityAngular: js.Number = _
  var translationX: js.Number = _
  var velocityX: js.Number = _
  var hwTimestamp: js.Number = _
  var offsetX: js.Number = _
  var screenX: js.Number = _
  var rotation: js.Number = _
  var expansion: js.Number = _
  var clientY: js.Number = _
  var screenY: js.Number = _
  var scale: js.Number = _
  var gestureObject: js.Any = _
  var clientX: js.Number = _
  def initGestureEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, viewArg: Window, detailArg: js.Number, screenXArg: js.Number, screenYArg: js.Number, clientXArg: js.Number, clientYArg: js.Number, offsetXArg: js.Number, offsetYArg: js.Number, translationXArg: js.Number, translationYArg: js.Number, scaleArg: js.Number, expansionArg: js.Number, rotationArg: js.Number, velocityXArg: js.Number, velocityYArg: js.Number, velocityExpansionArg: js.Number, velocityAngularArg: js.Number, hwTimestampArg: js.Number): Unit = ???
  var MSGESTURE_FLAG_BEGIN: js.Number = _
  var MSGESTURE_FLAG_END: js.Number = _
  var MSGESTURE_FLAG_CANCEL: js.Number = _
  var MSGESTURE_FLAG_INERTIA: js.Number = _
  var MSGESTURE_FLAG_NONE: js.Number = _
}

object MSGestureEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSGestureEvent),List())))) */
  var MSGESTURE_FLAG_BEGIN: js.Number = _
  var MSGESTURE_FLAG_END: js.Number = _
  var MSGESTURE_FLAG_CANCEL: js.Number = _
  var MSGESTURE_FLAG_INERTIA: js.Number = _
  var MSGESTURE_FLAG_NONE: js.Number = _
}

trait ErrorEvent extends Event {
  var colno: js.Number = _
  var filename: js.String = _
  var lineno: js.Number = _
  var message: js.String = _
  def initErrorEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, messageArg: js.String, filenameArg: js.String, linenoArg: js.Number): Unit = ???
}

object ErrorEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(ErrorEvent),List())))) */
}

trait SVGFilterElement extends SVGElement with SVGUnitTypes with SVGStylable with SVGLangSpace with SVGURIReference with SVGExternalResourcesRequired {
  var y: SVGAnimatedLength = _
  var width: SVGAnimatedLength = _
  var filterResX: SVGAnimatedInteger = _
  var filterUnits: SVGAnimatedEnumeration = _
  var primitiveUnits: SVGAnimatedEnumeration = _
  var x: SVGAnimatedLength = _
  var height: SVGAnimatedLength = _
  var filterResY: SVGAnimatedInteger = _
  def setFilterRes(filterResX: js.Number, filterResY: js.Number): Unit = ???
}

object SVGFilterElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFilterElement),List())))) */
}

trait TrackEvent extends Event {
  var track: js.Any = _
}

object TrackEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(TrackEvent),List())))) */
}

trait SVGFEMergeNodeElement extends SVGElement {
  var in1: SVGAnimatedString = _
}

object SVGFEMergeNodeElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEMergeNodeElement),List())))) */
}

trait SVGFEFloodElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
}

object SVGFEFloodElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEFloodElement),List())))) */
}

trait MSGesture extends js.Object {
  var target: Element = _
  def addPointer(pointerId: js.Number): Unit = ???
  def stop(): Unit = ???
}

object MSGesture extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSGesture),List())))) */
}

trait TextTrackCue extends EventTarget {
  var onenter: js.Function1[Event, js.Any] = _
  var track: TextTrack = _
  var endTime: js.Number = _
  var text: js.String = _
  var pauseOnExit: js.Boolean = _
  var id: js.String = _
  var startTime: js.Number = _
  var onexit: js.Function1[Event, js.Any] = _
  def getCueAsHTML(): DocumentFragment = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}

object TextTrackCue extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(TextTrackCue),List())))) */
}

trait MSStreamReader extends MSBaseReader {
  var error: DOMError = _
  def readAsArrayBuffer(stream: MSStream, size: js.Number): Unit = ???
  def readAsArrayBuffer(stream: MSStream): Unit = ???
  def readAsBlob(stream: MSStream, size: js.Number): Unit = ???
  def readAsBlob(stream: MSStream): Unit = ???
  def readAsDataURL(stream: MSStream, size: js.Number): Unit = ???
  def readAsDataURL(stream: MSStream): Unit = ???
  def readAsText(stream: MSStream, encoding: js.String, size: js.Number): Unit = ???
  def readAsText(stream: MSStream, encoding: js.String): Unit = ???
  def readAsText(stream: MSStream): Unit = ???
}

object MSStreamReader extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSStreamReader),List())))) */
}

trait DOMTokenList extends js.Object {
  var length: js.Number = _
  def contains(token: js.String): js.Boolean = ???
  def remove(token: js.String): Unit = ???
  def toggle(token: js.String): js.Boolean = ???
  def add(token: js.String): Unit = ???
  def item(index: js.Number): js.String = ???
  @scala.js.annotation.JSBracketAccess
  def apply(index: js.Number): js.String = ???
  @scala.js.annotation.JSBracketAccess
  def update(index: js.Number, v: js.String): Unit = ???
  
}

object DOMTokenList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(DOMTokenList),List())))) */
}

trait SVGFEFuncAElement extends SVGComponentTransferFunctionElement {
}

object SVGFEFuncAElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEFuncAElement),List())))) */
}

trait SVGFETileElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var in1: SVGAnimatedString = _
}

object SVGFETileElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFETileElement),List())))) */
}

trait SVGFEBlendElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var in2: SVGAnimatedString = _
  var mode: SVGAnimatedEnumeration = _
  var in1: SVGAnimatedString = _
  var SVG_FEBLEND_MODE_DARKEN: js.Number = _
  var SVG_FEBLEND_MODE_UNKNOWN: js.Number = _
  var SVG_FEBLEND_MODE_MULTIPLY: js.Number = _
  var SVG_FEBLEND_MODE_NORMAL: js.Number = _
  var SVG_FEBLEND_MODE_SCREEN: js.Number = _
  var SVG_FEBLEND_MODE_LIGHTEN: js.Number = _
}

object SVGFEBlendElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEBlendElement),List())))) */
  var SVG_FEBLEND_MODE_DARKEN: js.Number = _
  var SVG_FEBLEND_MODE_UNKNOWN: js.Number = _
  var SVG_FEBLEND_MODE_MULTIPLY: js.Number = _
  var SVG_FEBLEND_MODE_NORMAL: js.Number = _
  var SVG_FEBLEND_MODE_SCREEN: js.Number = _
  var SVG_FEBLEND_MODE_LIGHTEN: js.Number = _
}

object WindowTimers extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(WindowTimers),List())))) */
}

trait MessageChannel extends js.Object {
  var port2: MessagePort = _
  var port1: MessagePort = _
}

object MessageChannel extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MessageChannel),List())))) */
}

trait SVGFEMergeElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
}

object SVGFEMergeElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEMergeElement),List())))) */
}

trait TransitionEvent extends Event {
  var propertyName: js.String = _
  var elapsedTime: js.Number = _
  def initTransitionEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, propertyNameArg: js.String, elapsedTimeArg: js.Number): Unit = ???
}

object TransitionEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(TransitionEvent),List())))) */
}

trait MediaQueryList extends js.Object {
  var matches: js.Boolean = _
  var media: js.String = _
  def addListener(listener: MediaQueryListListener): Unit = ???
  def removeListener(listener: MediaQueryListListener): Unit = ???
}

object MediaQueryList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MediaQueryList),List())))) */
}

trait DOMError extends js.Object {
  var name: js.String = _
  
}

object DOMError extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(DOMError),List())))) */
}

trait CloseEvent extends Event {
  var wasClean: js.Boolean = _
  var reason: js.String = _
  var code: js.Number = _
  def initCloseEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, wasCleanArg: js.Boolean, codeArg: js.Number, reasonArg: js.String): Unit = ???
}

object CloseEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(CloseEvent),List())))) */
}

class WebSocket protected () extends EventTarget {
  def this(url: js.String) = this()
  def this(url: js.String, prototcol: js.String) = this()
  def this(url: js.String, prototcol: js.Array[js.String]) = this()
  var protocol: js.String = _
  var readyState: js.Number = _
  var bufferedAmount: js.Number = _
  var onopen: js.Function1[Event, js.Any] = _
  var extensions: js.String = _
  var onmessage: js.Function1[js.Any, js.Any] = _
  var onclose: js.Function1[CloseEvent, js.Any] = _
  var onerror: js.Function1[ErrorEvent, js.Any] = _
  var binaryType: js.String = _
  var url: js.String = _
  def close(code: js.Number, reason: js.String): Unit = ???
  def close(code: js.Number): Unit = ???
  def close(): Unit = ???
  def send(data: js.Any): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
  var OPEN: js.Number = _
  var CLOSING: js.Number = _
  var CONNECTING: js.Number = _
  var CLOSED: js.Number = _
}

object WebSocket extends js.Object {
  var OPEN: js.Number = _
  var CLOSING: js.Number = _
  var CONNECTING: js.Number = _
  var CLOSED: js.Number = _
}

trait SVGFEPointLightElement extends SVGElement {
  var y: SVGAnimatedNumber = _
  var x: SVGAnimatedNumber = _
  var z: SVGAnimatedNumber = _
}

object SVGFEPointLightElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEPointLightElement),List())))) */
}

trait ProgressEvent extends Event {
  var loaded: js.Number = _
  var lengthComputable: js.Boolean = _
  var total: js.Number = _
  def initProgressEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, lengthComputableArg: js.Boolean, loadedArg: js.Number, totalArg: js.Number): Unit = ???
}

object ProgressEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(ProgressEvent),List())))) */
}

trait IDBObjectStore extends js.Object {
  var indexNames: DOMStringList = _
  var name: js.String = _
  var transaction: IDBTransaction = _
  var keyPath: js.String = _
  def count(key: js.Any): IDBRequest = ???
  def count(): IDBRequest = ???
  def add(value: js.Any, key: js.Any): IDBRequest = ???
  def add(value: js.Any): IDBRequest = ???
  def clear(): IDBRequest = ???
  def createIndex(name: js.String, keyPath: js.String, optionalParameters: js.Any): IDBIndex = ???
  def createIndex(name: js.String, keyPath: js.String): IDBIndex = ???
  def put(value: js.Any, key: js.Any): IDBRequest = ???
  def put(value: js.Any): IDBRequest = ???
  def openCursor(range: js.Any, direction: js.String): IDBRequest = ???
  def openCursor(range: js.Any): IDBRequest = ???
  def openCursor(): IDBRequest = ???
  def deleteIndex(indexName: js.String): Unit = ???
  def index(name: js.String): IDBIndex = ???
  def get(key: js.Any): IDBRequest = ???
  def delete(key: js.Any): IDBRequest = ???
}

object IDBObjectStore extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(IDBObjectStore),List())))) */
}

trait SVGFEGaussianBlurElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var stdDeviationX: SVGAnimatedNumber = _
  var in1: SVGAnimatedString = _
  var stdDeviationY: SVGAnimatedNumber = _
  def setStdDeviation(stdDeviationX: js.Number, stdDeviationY: js.Number): Unit = ???
}

object SVGFEGaussianBlurElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEGaussianBlurElement),List())))) */
}

trait SVGFilterPrimitiveStandardAttributes extends SVGStylable {
  var y: SVGAnimatedLength = _
  var width: SVGAnimatedLength = _
  var x: SVGAnimatedLength = _
  var height: SVGAnimatedLength = _
  var result: SVGAnimatedString = _
}

trait IDBVersionChangeEvent extends Event {
  var newVersion: js.Number = _
  var oldVersion: js.Number = _
}

object IDBVersionChangeEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(IDBVersionChangeEvent),List())))) */
}

trait IDBIndex extends js.Object {
  var unique: js.Boolean = _
  var name: js.String = _
  var keyPath: js.String = _
  var objectStore: IDBObjectStore = _
  def count(key: js.Any): IDBRequest = ???
  def count(): IDBRequest = ???
  def getKey(key: js.Any): IDBRequest = ???
  def openKeyCursor(range: IDBKeyRange, direction: js.String): IDBRequest = ???
  def openKeyCursor(range: IDBKeyRange): IDBRequest = ???
  def openKeyCursor(): IDBRequest = ???
  def get(key: js.Any): IDBRequest = ???
  def openCursor(range: IDBKeyRange, direction: js.String): IDBRequest = ???
  def openCursor(range: IDBKeyRange): IDBRequest = ???
  def openCursor(): IDBRequest = ???
}

object IDBIndex extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(IDBIndex),List())))) */
}

trait FileList extends js.Object {
  var length: js.Number = _
  def item(index: js.Number): File = ???
  @scala.js.annotation.JSBracketAccess
  def apply(index: js.Number): File = ???
  @scala.js.annotation.JSBracketAccess
  def update(index: js.Number, v: File): Unit = ???
}

object FileList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(FileList),List())))) */
}

trait IDBCursor extends js.Object {
  var source: js.Any = _
  var direction: js.String = _
  var key: js.Any = _
  var primaryKey: js.Any = _
  def advance(count: js.Number): Unit = ???
  def delete(): IDBRequest = ???
  def update(value: js.Any): IDBRequest = ???
  var PREV: js.String = _
  var PREV_NO_DUPLICATE: js.String = _
  var NEXT: js.String = _
  var NEXT_NO_DUPLICATE: js.String = _
}

object IDBCursor extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(IDBCursor),List())))) */
  var PREV: js.String = _
  var PREV_NO_DUPLICATE: js.String = _
  var NEXT: js.String = _
  var NEXT_NO_DUPLICATE: js.String = _
}

trait SVGFESpecularLightingElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var kernelUnitLengthY: SVGAnimatedNumber = _
  var surfaceScale: SVGAnimatedNumber = _
  var specularExponent: SVGAnimatedNumber = _
  var in1: SVGAnimatedString = _
  var kernelUnitLengthX: SVGAnimatedNumber = _
  var specularConstant: SVGAnimatedNumber = _
}

object SVGFESpecularLightingElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFESpecularLightingElement),List())))) */
}

trait File extends Blob {
  var lastModifiedDate: js.Any = _
  var name: js.String = _
}

object File extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(File),List())))) */
}

trait URL extends js.Object {
  def revokeObjectURL(url: js.String): Unit = ???
  def createObjectURL(`object`: js.Any, options: ObjectURLOptions): js.String = ???
  def createObjectURL(`object`: js.Any): js.String = ???
}

trait IDBCursorWithValue extends IDBCursor {
  var value: js.Any = _
}

object IDBCursorWithValue extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(IDBCursorWithValue),List())))) */
}

trait XMLHttpRequestEventTarget extends EventTarget {
  var onprogress: js.Function1[ProgressEvent, js.Any] = _
  var onerror: js.Function1[ErrorEvent, js.Any] = _
  var onload: js.Function1[js.Any, js.Any] = _
  var ontimeout: js.Function1[js.Any, js.Any] = _
  var onabort: js.Function1[js.Any, js.Any] = _
  var onloadstart: js.Function1[js.Any, js.Any] = _
  var onloadend: js.Function1[ProgressEvent, js.Any] = _
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}

object XMLHttpRequestEventTarget extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(XMLHttpRequestEventTarget),List())))) */
}

trait IDBEnvironment extends js.Object {
  var msIndexedDB: IDBFactory = _
  var indexedDB: IDBFactory = _
}

trait AudioTrackList extends EventTarget {
  var length: js.Number = _
  var onchange: js.Function1[js.Any, js.Any] = _
  var onaddtrack: js.Function1[TrackEvent, js.Any] = _
  def getTrackById(id: js.String): AudioTrack = ???
  def item(index: js.Number): AudioTrack = ???
  @scala.js.annotation.JSBracketAccess
  def apply(index: js.Number): AudioTrack = ???
  @scala.js.annotation.JSBracketAccess
  def update(index: js.Number, v: AudioTrack): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}

object AudioTrackList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(AudioTrackList),List())))) */
}

trait MSBaseReader extends EventTarget {
  var onprogress: js.Function1[ProgressEvent, js.Any] = _
  var readyState: js.Number = _
  var onabort: js.Function1[js.Any, js.Any] = _
  var onloadend: js.Function1[ProgressEvent, js.Any] = _
  var onerror: js.Function1[ErrorEvent, js.Any] = _
  var onload: js.Function1[js.Any, js.Any] = _
  var onloadstart: js.Function1[js.Any, js.Any] = _
  var result: js.Any = _
  def abort(): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
  var LOADING: js.Number = _
  var EMPTY: js.Number = _
  var DONE: js.Number = _
}

trait SVGFEMorphologyElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var operator: SVGAnimatedEnumeration = _
  var radiusX: SVGAnimatedNumber = _
  var radiusY: SVGAnimatedNumber = _
  var in1: SVGAnimatedString = _
  var SVG_MORPHOLOGY_OPERATOR_UNKNOWN: js.Number = _
  var SVG_MORPHOLOGY_OPERATOR_ERODE: js.Number = _
  var SVG_MORPHOLOGY_OPERATOR_DILATE: js.Number = _
}

object SVGFEMorphologyElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEMorphologyElement),List())))) */
  var SVG_MORPHOLOGY_OPERATOR_UNKNOWN: js.Number = _
  var SVG_MORPHOLOGY_OPERATOR_ERODE: js.Number = _
  var SVG_MORPHOLOGY_OPERATOR_DILATE: js.Number = _
}

trait SVGFEFuncRElement extends SVGComponentTransferFunctionElement {
}

object SVGFEFuncRElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEFuncRElement),List())))) */
}

trait WindowTimersExtension extends js.Object {
  def msSetImmediate(expression: js.Any, args: js.Any*): js.Number = ???
  def clearImmediate(handle: js.Number): Unit = ???
  def msClearImmediate(handle: js.Number): Unit = ???
  def setImmediate(expression: js.Any, args: js.Any*): js.Number = ???
}

trait SVGFEDisplacementMapElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var in2: SVGAnimatedString = _
  var xChannelSelector: SVGAnimatedEnumeration = _
  var yChannelSelector: SVGAnimatedEnumeration = _
  var scale: SVGAnimatedNumber = _
  var in1: SVGAnimatedString = _
  var SVG_CHANNEL_B: js.Number = _
  var SVG_CHANNEL_R: js.Number = _
  var SVG_CHANNEL_G: js.Number = _
  var SVG_CHANNEL_UNKNOWN: js.Number = _
  var SVG_CHANNEL_A: js.Number = _
}

object SVGFEDisplacementMapElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEDisplacementMapElement),List())))) */
  var SVG_CHANNEL_B: js.Number = _
  var SVG_CHANNEL_R: js.Number = _
  var SVG_CHANNEL_G: js.Number = _
  var SVG_CHANNEL_UNKNOWN: js.Number = _
  var SVG_CHANNEL_A: js.Number = _
}

trait AnimationEvent extends Event {
  var animationName: js.String = _
  var elapsedTime: js.Number = _
  def initAnimationEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, animationNameArg: js.String, elapsedTimeArg: js.Number): Unit = ???
}

object AnimationEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(AnimationEvent),List())))) */
}

trait SVGComponentTransferFunctionElement extends SVGElement {
  var tableValues: SVGAnimatedNumberList = _
  var slope: SVGAnimatedNumber = _
  var `type`: SVGAnimatedEnumeration = _
  var exponent: SVGAnimatedNumber = _
  var amplitude: SVGAnimatedNumber = _
  var intercept: SVGAnimatedNumber = _
  var offset: SVGAnimatedNumber = _
  var SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN: js.Number = _
  var SVG_FECOMPONENTTRANSFER_TYPE_TABLE: js.Number = _
  var SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY: js.Number = _
  var SVG_FECOMPONENTTRANSFER_TYPE_GAMMA: js.Number = _
  var SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE: js.Number = _
  var SVG_FECOMPONENTTRANSFER_TYPE_LINEAR: js.Number = _
}

object SVGComponentTransferFunctionElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGComponentTransferFunctionElement),List())))) */
  var SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN: js.Number = _
  var SVG_FECOMPONENTTRANSFER_TYPE_TABLE: js.Number = _
  var SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY: js.Number = _
  var SVG_FECOMPONENTTRANSFER_TYPE_GAMMA: js.Number = _
  var SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE: js.Number = _
  var SVG_FECOMPONENTTRANSFER_TYPE_LINEAR: js.Number = _
}

trait MSRangeCollection extends js.Object {
  var length: js.Number = _
  def item(index: js.Number): Range = ???
  @scala.js.annotation.JSBracketAccess
  def apply(index: js.Number): Range = ???
  @scala.js.annotation.JSBracketAccess
  def update(index: js.Number, v: Range): Unit = ???
}

object MSRangeCollection extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSRangeCollection),List())))) */
}

trait SVGFEDistantLightElement extends SVGElement {
  var azimuth: SVGAnimatedNumber = _
  var elevation: SVGAnimatedNumber = _
}

object SVGFEDistantLightElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEDistantLightElement),List())))) */
}

trait SVGFEFuncBElement extends SVGComponentTransferFunctionElement {
}

object SVGFEFuncBElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEFuncBElement),List())))) */
}

trait IDBKeyRange extends js.Object {
  var upper: js.Any = _
  var upperOpen: js.Boolean = _
  var lower: js.Any = _
  var lowerOpen: js.Boolean = _
  def bound(lower: js.Any, upper: js.Any, lowerOpen: js.Boolean, upperOpen: js.Boolean): IDBKeyRange = ???
  def bound(lower: js.Any, upper: js.Any, lowerOpen: js.Boolean): IDBKeyRange = ???
  def bound(lower: js.Any, upper: js.Any): IDBKeyRange = ???
  def only(value: js.Any): IDBKeyRange = ???
  def lowerBound(bound: js.Any, open: js.Boolean): IDBKeyRange = ???
  def lowerBound(bound: js.Any): IDBKeyRange = ???
  def upperBound(bound: js.Any, open: js.Boolean): IDBKeyRange = ???
  def upperBound(bound: js.Any): IDBKeyRange = ???
}

object IDBKeyRange extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(IDBKeyRange),List())))) */
}

trait WindowConsole extends js.Object {
  var console: Console = _
}

trait IDBTransaction extends EventTarget {
  var oncomplete: js.Function1[Event, js.Any] = _
  var db: IDBDatabase = _
  var mode: js.String = _
  var error: DOMError = _
  var onerror: js.Function1[ErrorEvent, js.Any] = _
  var onabort: js.Function1[js.Any, js.Any] = _
  def abort(): Unit = ???
  def objectStore(name: js.String): IDBObjectStore = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
  var READ_ONLY: js.String = _
  var VERSION_CHANGE: js.String = _
  var READ_WRITE: js.String = _
}

object IDBTransaction extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(IDBTransaction),List())))) */
  var READ_ONLY: js.String = _
  var VERSION_CHANGE: js.String = _
  var READ_WRITE: js.String = _
}

trait AudioTrack extends js.Object {
  var kind: js.String = _
  var language: js.String = _
  var id: js.String = _
  var label: js.String = _
  var enabled: js.Boolean = _
}

object AudioTrack extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(AudioTrack),List())))) */
}

trait SVGFEConvolveMatrixElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var orderY: SVGAnimatedInteger = _
  var kernelUnitLengthY: SVGAnimatedNumber = _
  var orderX: SVGAnimatedInteger = _
  var preserveAlpha: SVGAnimatedBoolean = _
  var kernelMatrix: SVGAnimatedNumberList = _
  var edgeMode: SVGAnimatedEnumeration = _
  var kernelUnitLengthX: SVGAnimatedNumber = _
  var bias: SVGAnimatedNumber = _
  var targetX: SVGAnimatedInteger = _
  var targetY: SVGAnimatedInteger = _
  var divisor: SVGAnimatedNumber = _
  var in1: SVGAnimatedString = _
  var SVG_EDGEMODE_WRAP: js.Number = _
  var SVG_EDGEMODE_DUPLICATE: js.Number = _
  var SVG_EDGEMODE_UNKNOWN: js.Number = _
  var SVG_EDGEMODE_NONE: js.Number = _
}

object SVGFEConvolveMatrixElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEConvolveMatrixElement),List())))) */
  var SVG_EDGEMODE_WRAP: js.Number = _
  var SVG_EDGEMODE_DUPLICATE: js.Number = _
  var SVG_EDGEMODE_UNKNOWN: js.Number = _
  var SVG_EDGEMODE_NONE: js.Number = _
}

trait TextTrackCueList extends js.Object {
  var length: js.Number = _
  def item(index: js.Number): TextTrackCue = ???
  @scala.js.annotation.JSBracketAccess
  def apply(index: js.Number): TextTrackCue = ???
  @scala.js.annotation.JSBracketAccess
  def update(index: js.Number, v: TextTrackCue): Unit = ???
  def getCueById(id: js.String): TextTrackCue = ???
}

object TextTrackCueList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(TextTrackCueList),List())))) */
}

trait CSSKeyframesRule extends CSSRule {
  var name: js.String = _
  var cssRules: CSSRuleList = _
  def findRule(rule: js.String): CSSKeyframeRule = ???
  def deleteRule(rule: js.String): Unit = ???
  def appendRule(rule: js.String): Unit = ???
}

object CSSKeyframesRule extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(CSSKeyframesRule),List())))) */
}

trait SVGFETurbulenceElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var baseFrequencyX: SVGAnimatedNumber = _
  var numOctaves: SVGAnimatedInteger = _
  var `type`: SVGAnimatedEnumeration = _
  var baseFrequencyY: SVGAnimatedNumber = _
  var stitchTiles: SVGAnimatedEnumeration = _
  var seed: SVGAnimatedNumber = _
  var SVG_STITCHTYPE_UNKNOWN: js.Number = _
  var SVG_STITCHTYPE_NOSTITCH: js.Number = _
  var SVG_TURBULENCE_TYPE_UNKNOWN: js.Number = _
  var SVG_TURBULENCE_TYPE_TURBULENCE: js.Number = _
  var SVG_TURBULENCE_TYPE_FRACTALNOISE: js.Number = _
  var SVG_STITCHTYPE_STITCH: js.Number = _
}

object SVGFETurbulenceElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFETurbulenceElement),List())))) */
  var SVG_STITCHTYPE_UNKNOWN: js.Number = _
  var SVG_STITCHTYPE_NOSTITCH: js.Number = _
  var SVG_TURBULENCE_TYPE_UNKNOWN: js.Number = _
  var SVG_TURBULENCE_TYPE_TURBULENCE: js.Number = _
  var SVG_TURBULENCE_TYPE_FRACTALNOISE: js.Number = _
  var SVG_STITCHTYPE_STITCH: js.Number = _
}

trait TextTrackList extends js.Object {
  var length: js.Number = _
  def item(index: js.Number): TextTrack = ???
  @scala.js.annotation.JSBracketAccess
  def apply(index: js.Number): TextTrack = ???
  @scala.js.annotation.JSBracketAccess
  def update(index: js.Number, v: TextTrack): Unit = ???
}

object TextTrackList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(TextTrackList),List())))) */
}

trait SVGFEFuncGElement extends SVGComponentTransferFunctionElement {
}

object SVGFEFuncGElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEFuncGElement),List())))) */
}

trait SVGFEColorMatrixElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var in1: SVGAnimatedString = _
  var `type`: SVGAnimatedEnumeration = _
  var values: SVGAnimatedNumberList = _
  var SVG_FECOLORMATRIX_TYPE_SATURATE: js.Number = _
  var SVG_FECOLORMATRIX_TYPE_UNKNOWN: js.Number = _
  var SVG_FECOLORMATRIX_TYPE_MATRIX: js.Number = _
  var SVG_FECOLORMATRIX_TYPE_HUEROTATE: js.Number = _
  var SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA: js.Number = _
}

object SVGFEColorMatrixElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEColorMatrixElement),List())))) */
  var SVG_FECOLORMATRIX_TYPE_SATURATE: js.Number = _
  var SVG_FECOLORMATRIX_TYPE_UNKNOWN: js.Number = _
  var SVG_FECOLORMATRIX_TYPE_MATRIX: js.Number = _
  var SVG_FECOLORMATRIX_TYPE_HUEROTATE: js.Number = _
  var SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA: js.Number = _
}

trait Console extends js.Object {
  def info(message: js.Any, optionalParams: js.Any*): Unit = ???
  def profile(reportName: js.String): Unit = ???
  def profile(): Unit = ???
  def assert(test: js.Boolean, message: js.String, optionalParams: js.Any*): Unit = ???
  def msIsIndependentlyComposed(element: Element): js.Boolean = ???
  def clear(): Unit = ???
  def dir(value: js.Any, optionalParams: js.Any*): Unit = ???
  def warn(message: js.Any, optionalParams: js.Any*): Unit = ???
  def error(message: js.Any, optionalParams: js.Any*): Unit = ???
  def log(message: js.Any, optionalParams: js.Any*): Unit = ???
  def profileEnd(): Unit = ???
}

object Console extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(Console),List())))) */
}

trait SVGFESpotLightElement extends SVGElement {
  var pointsAtY: SVGAnimatedNumber = _
  var y: SVGAnimatedNumber = _
  var limitingConeAngle: SVGAnimatedNumber = _
  var specularExponent: SVGAnimatedNumber = _
  var x: SVGAnimatedNumber = _
  var pointsAtZ: SVGAnimatedNumber = _
  var z: SVGAnimatedNumber = _
  var pointsAtX: SVGAnimatedNumber = _
}

object SVGFESpotLightElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFESpotLightElement),List())))) */
}

trait WindowBase64 extends js.Object {
  def btoa(rawString: js.String): js.String = ???
  def atob(encodedString: js.String): js.String = ???
}

trait IDBDatabase extends EventTarget {
  var version: js.String = _
  var name: js.String = _
  var objectStoreNames: DOMStringList = _
  var onerror: js.Function1[ErrorEvent, js.Any] = _
  var onabort: js.Function1[js.Any, js.Any] = _
  def createObjectStore(name: js.String, optionalParameters: js.Any): IDBObjectStore = ???
  def createObjectStore(name: js.String): IDBObjectStore = ???
  def close(): Unit = ???
  def transaction(storeNames: js.Any, mode: js.String): IDBTransaction = ???
  def transaction(storeNames: js.Any): IDBTransaction = ???
  def deleteObjectStore(name: js.String): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}

object IDBDatabase extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(IDBDatabase),List())))) */
}

trait DOMStringList extends js.Object {
  var length: js.Number = _
  def contains(str: js.String): js.Boolean = ???
  def item(index: js.Number): js.String = ???
  @scala.js.annotation.JSBracketAccess
  def apply(index: js.Number): js.String = ???
  @scala.js.annotation.JSBracketAccess
  def update(index: js.Number, v: js.String): Unit = ???
}

object DOMStringList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(DOMStringList),List())))) */
}

trait IDBOpenDBRequest extends IDBRequest {
  var onupgradeneeded: js.Function1[IDBVersionChangeEvent, js.Any] = _
  var onblocked: js.Function1[Event, js.Any] = _
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}

object IDBOpenDBRequest extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(IDBOpenDBRequest),List())))) */
}

trait HTMLProgressElement extends HTMLElement {
  var value: js.Number = _
  var max: js.Number = _
  var position: js.Number = _
  var form: HTMLFormElement = _
}

object HTMLProgressElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLProgressElement),List())))) */
}

trait MSLaunchUriCallback extends js.Object {
  def apply(): Unit = ???
}

trait SVGFEOffsetElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var dy: SVGAnimatedNumber = _
  var in1: SVGAnimatedString = _
  var dx: SVGAnimatedNumber = _
}

object SVGFEOffsetElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEOffsetElement),List())))) */
}

trait MSUnsafeFunctionCallback extends js.Object {
  def apply(): js.Dynamic = ???
}

trait TextTrack extends EventTarget {
  var language: js.String = _
  var mode: js.Any = _
  var readyState: js.Number = _
  var activeCues: TextTrackCueList = _
  var cues: TextTrackCueList = _
  var oncuechange: js.Function1[Event, js.Any] = _
  var kind: js.String = _
  var onload: js.Function1[js.Any, js.Any] = _
  var onerror: js.Function1[ErrorEvent, js.Any] = _
  var label: js.String = _
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
  var ERROR: js.Number = _
  var SHOWING: js.Number = _
  var LOADING: js.Number = _
  var LOADED: js.Number = _
  var NONE: js.Number = _
  var HIDDEN: js.Number = _
  var DISABLED: js.Number = _
}

object TextTrack extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(TextTrack),List())))) */
  var ERROR: js.Number = _
  var SHOWING: js.Number = _
  var LOADING: js.Number = _
  var LOADED: js.Number = _
  var NONE: js.Number = _
  var HIDDEN: js.Number = _
  var DISABLED: js.Number = _
}

trait MediaQueryListListener extends js.Object {
  def apply(mql: MediaQueryList): Unit = ???
}

trait IDBRequest extends EventTarget {
  var source: js.Any = _
  var onsuccess: js.Function1[Event, js.Any] = _
  var error: DOMError = _
  var transaction: IDBTransaction = _
  var onerror: js.Function1[ErrorEvent, js.Any] = _
  var readyState: js.String = _
  var result: js.Any = _
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}

object IDBRequest extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(IDBRequest),List())))) */
}

trait MessagePort extends EventTarget {
  var onmessage: js.Function1[js.Any, js.Any] = _
  def close(): Unit = ???
  def postMessage(message: js.Any, ports: js.Any): Unit = ???
  def postMessage(message: js.Any): Unit = ???
  def start(): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}

object MessagePort extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MessagePort),List())))) */
}

trait FileReader extends MSBaseReader {
  var error: DOMError = _
  def readAsArrayBuffer(blob: Blob): Unit = ???
  def readAsDataURL(blob: Blob): Unit = ???
  def readAsText(blob: Blob, encoding: js.String): Unit = ???
  def readAsText(blob: Blob): Unit = ???
}

object FileReader extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(FileReader),List())))) */
}

trait BlobPropertyBag extends js.Object {
  var `type`: js.String = _
  var endings: js.String = _
}

class Blob extends js.Object {
  def this(blobParts: js.Array[js.Any], options: BlobPropertyBag) = this()
  def this(blobParts: js.Array[js.Any]) = this()
  var `type`: js.String = _
  var size: js.Number = _
  def msDetachStream(): js.Dynamic = ???
  def slice(start: js.Number, end: js.Number, contentType: js.String): Blob = ???
  def slice(start: js.Number, end: js.Number): Blob = ???
  def slice(start: js.Number): Blob = ???
  def slice(): Blob = ???
  def close(): Unit = ???
  def msClose(): Unit = ???
}

object Blob extends js.Object {
}

trait ApplicationCache extends EventTarget {
  var status: js.Number = _
  var ondownloading: js.Function1[Event, js.Any] = _
  var onprogress: js.Function1[ProgressEvent, js.Any] = _
  var onupdateready: js.Function1[Event, js.Any] = _
  var oncached: js.Function1[Event, js.Any] = _
  var onobsolete: js.Function1[Event, js.Any] = _
  var onerror: js.Function1[ErrorEvent, js.Any] = _
  var onchecking: js.Function1[Event, js.Any] = _
  var onnoupdate: js.Function1[Event, js.Any] = _
  def swapCache(): Unit = ???
  def abort(): Unit = ???
  def update(): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
  var CHECKING: js.Number = _
  var UNCACHED: js.Number = _
  var UPDATEREADY: js.Number = _
  var DOWNLOADING: js.Number = _
  var IDLE: js.Number = _
  var OBSOLETE: js.Number = _
}

object ApplicationCache extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(ApplicationCache),List())))) */
  var CHECKING: js.Number = _
  var UNCACHED: js.Number = _
  var UPDATEREADY: js.Number = _
  var DOWNLOADING: js.Number = _
  var IDLE: js.Number = _
  var OBSOLETE: js.Number = _
}

trait FrameRequestCallback extends js.Object {
  def apply(time: js.Number): Unit = ???
}

trait PopStateEvent extends Event {
  var state: js.Any = _
  def initPopStateEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, stateArg: js.Any): Unit = ???
}

object PopStateEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(PopStateEvent),List())))) */
}

trait CSSKeyframeRule extends CSSRule {
  var keyText: js.String = _
  var style: CSSStyleDeclaration = _
}

object CSSKeyframeRule extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(CSSKeyframeRule),List())))) */
}

trait MSFileSaver extends js.Object {
  def msSaveBlob(blob: js.Any, defaultName: js.String): js.Boolean = ???
  def msSaveBlob(blob: js.Any): js.Boolean = ???
  def msSaveOrOpenBlob(blob: js.Any, defaultName: js.String): js.Boolean = ???
  def msSaveOrOpenBlob(blob: js.Any): js.Boolean = ???
}

trait MSStream extends js.Object {
  var `type`: js.String = _
  def msDetachStream(): js.Dynamic = ???
  def msClose(): Unit = ???
}

object MSStream extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSStream),List())))) */
}

trait MSBlobBuilder extends js.Object {
  def append(data: js.Any, endings: js.String): Unit = ???
  def append(data: js.Any): Unit = ???
  def getBlob(contentType: js.String): Blob = ???
  def getBlob(): Blob = ???
}

object MSBlobBuilder extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSBlobBuilder),List())))) */
}

trait DOMSettableTokenList extends DOMTokenList {
  var value: js.String = _
}

object DOMSettableTokenList extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(DOMSettableTokenList),List())))) */
}

trait IDBFactory extends js.Object {
  def open(name: js.String, version: js.Number): IDBOpenDBRequest = ???
  def open(name: js.String): IDBOpenDBRequest = ???
  def cmp(first: js.Any, second: js.Any): js.Number = ???
  def deleteDatabase(name: js.String): IDBOpenDBRequest = ???
}

object IDBFactory extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(IDBFactory),List())))) */
}

trait MSPointerEvent extends MouseEvent {
  var width: js.Number = _
  var rotation: js.Number = _
  var pressure: js.Number = _
  var pointerType: js.Any = _
  var isPrimary: js.Boolean = _
  var tiltY: js.Number = _
  var height: js.Number = _
  var intermediatePoints: js.Any = _
  var currentPoint: js.Any = _
  var tiltX: js.Number = _
  var hwTimestamp: js.Number = _
  var pointerId: js.Number = _
  def initPointerEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, viewArg: Window, detailArg: js.Number, screenXArg: js.Number, screenYArg: js.Number, clientXArg: js.Number, clientYArg: js.Number, ctrlKeyArg: js.Boolean, altKeyArg: js.Boolean, shiftKeyArg: js.Boolean, metaKeyArg: js.Boolean, buttonArg: js.Number, relatedTargetArg: EventTarget, offsetXArg: js.Number, offsetYArg: js.Number, widthArg: js.Number, heightArg: js.Number, pressure: js.Number, rotation: js.Number, tiltX: js.Number, tiltY: js.Number, pointerIdArg: js.Number, pointerType: js.Any, hwTimestampArg: js.Number, isPrimary: js.Boolean): Unit = ???
  def getCurrentPoint(element: Element): Unit = ???
  def getIntermediatePoints(element: Element): Unit = ???
  var MSPOINTER_TYPE_PEN: js.Number = _
  var MSPOINTER_TYPE_MOUSE: js.Number = _
  var MSPOINTER_TYPE_TOUCH: js.Number = _
}

object MSPointerEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSPointerEvent),List())))) */
  var MSPOINTER_TYPE_PEN: js.Number = _
  var MSPOINTER_TYPE_MOUSE: js.Number = _
  var MSPOINTER_TYPE_TOUCH: js.Number = _
}

trait MSManipulationEvent extends UIEvent {
  var lastState: js.Number = _
  var currentState: js.Number = _
  def initMSManipulationEvent(typeArg: js.String, canBubbleArg: js.Boolean, cancelableArg: js.Boolean, viewArg: Window, detailArg: js.Number, lastState: js.Number, currentState: js.Number): Unit = ???
  var MS_MANIPULATION_STATE_STOPPED: js.Number = _
  var MS_MANIPULATION_STATE_ACTIVE: js.Number = _
  var MS_MANIPULATION_STATE_INERTIA: js.Number = _
}

object MSManipulationEvent extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(MSManipulationEvent),List())))) */
  var MS_MANIPULATION_STATE_STOPPED: js.Number = _
  var MS_MANIPULATION_STATE_ACTIVE: js.Number = _
  var MS_MANIPULATION_STATE_INERTIA: js.Number = _
}

class FormData extends js.Object {
  def this(form: HTMLFormElement) = this()
  def append(name: js.Any, value: js.Any, blobName: js.String): Unit = ???
  def append(name: js.Any, value: js.Any): Unit = ???
}

object FormData extends js.Object {
}

trait HTMLDataListElement extends HTMLElement {
  var options: HTMLCollection = _
}

object HTMLDataListElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLDataListElement),List())))) */
}

trait SVGFEImageElement extends SVGElement with SVGLangSpace with SVGFilterPrimitiveStandardAttributes with SVGURIReference with SVGExternalResourcesRequired {
  var preserveAspectRatio: SVGAnimatedPreserveAspectRatio = _
}

object SVGFEImageElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEImageElement),List())))) */
}

trait AbstractWorker extends EventTarget {
  var onerror: js.Function1[ErrorEvent, js.Any] = _
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}

trait SVGFECompositeElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var operator: SVGAnimatedEnumeration = _
  var in2: SVGAnimatedString = _
  var k2: SVGAnimatedNumber = _
  var k1: SVGAnimatedNumber = _
  var k3: SVGAnimatedNumber = _
  var in1: SVGAnimatedString = _
  var k4: SVGAnimatedNumber = _
  var SVG_FECOMPOSITE_OPERATOR_OUT: js.Number = _
  var SVG_FECOMPOSITE_OPERATOR_OVER: js.Number = _
  var SVG_FECOMPOSITE_OPERATOR_XOR: js.Number = _
  var SVG_FECOMPOSITE_OPERATOR_ARITHMETIC: js.Number = _
  var SVG_FECOMPOSITE_OPERATOR_UNKNOWN: js.Number = _
  var SVG_FECOMPOSITE_OPERATOR_IN: js.Number = _
  var SVG_FECOMPOSITE_OPERATOR_ATOP: js.Number = _
}

object SVGFECompositeElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFECompositeElement),List())))) */
  var SVG_FECOMPOSITE_OPERATOR_OUT: js.Number = _
  var SVG_FECOMPOSITE_OPERATOR_OVER: js.Number = _
  var SVG_FECOMPOSITE_OPERATOR_XOR: js.Number = _
  var SVG_FECOMPOSITE_OPERATOR_ARITHMETIC: js.Number = _
  var SVG_FECOMPOSITE_OPERATOR_UNKNOWN: js.Number = _
  var SVG_FECOMPOSITE_OPERATOR_IN: js.Number = _
  var SVG_FECOMPOSITE_OPERATOR_ATOP: js.Number = _
}

trait ValidityState extends js.Object {
  var customError: js.Boolean = _
  var valueMissing: js.Boolean = _
  var stepMismatch: js.Boolean = _
  var rangeUnderflow: js.Boolean = _
  var rangeOverflow: js.Boolean = _
  var typeMismatch: js.Boolean = _
  var patternMismatch: js.Boolean = _
  var tooLong: js.Boolean = _
  var valid: js.Boolean = _
}

object ValidityState extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(ValidityState),List())))) */
}

trait HTMLTrackElement extends HTMLElement {
  var kind: js.String = _
  var src: js.String = _
  var srclang: js.String = _
  var track: TextTrack = _
  var label: js.String = _
}

object HTMLTrackElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLTrackElement),List())))) */
}

trait MSApp extends js.Object {
  def createFileFromStorageFile(storageFile: js.Any): File = ???
  def createBlobFromRandomAccessStream(`type`: js.String, seeker: js.Any): Blob = ???
  def createStreamFromInputStream(`type`: js.String, inputStream: js.Any): MSStream = ???
  def terminateApp(exceptionObject: js.Any): Unit = ???
  def createDataPackage(`object`: js.Any): js.Dynamic = ???
  def execUnsafeLocalFunction(unsafeFunction: MSUnsafeFunctionCallback): js.Dynamic = ???
  def getHtmlPrintDocumentSource(htmlDoc: js.Any): js.Dynamic = ???
  def addPublicLocalApplicationUri(uri: js.String): Unit = ???
  def createDataPackageFromSelection(): js.Dynamic = ???
}

trait SVGFEComponentTransferElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var in1: SVGAnimatedString = _
}

object SVGFEComponentTransferElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEComponentTransferElement),List())))) */
}

trait SVGFEDiffuseLightingElement extends SVGElement with SVGFilterPrimitiveStandardAttributes {
  var kernelUnitLengthY: SVGAnimatedNumber = _
  var surfaceScale: SVGAnimatedNumber = _
  var in1: SVGAnimatedString = _
  var kernelUnitLengthX: SVGAnimatedNumber = _
  var diffuseConstant: SVGAnimatedNumber = _
}

object SVGFEDiffuseLightingElement extends js.Object {
/* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(SVGFEDiffuseLightingElement),List())))) */
}

class MSCSSMatrix extends js.Object {
  def this(text: js.String) = this()
  var m24: js.Number = _
  var m34: js.Number = _
  var a: js.Number = _
  var d: js.Number = _
  var m32: js.Number = _
  var m41: js.Number = _
  var m11: js.Number = _
  var f: js.Number = _
  var e: js.Number = _
  var m23: js.Number = _
  var m14: js.Number = _
  var m33: js.Number = _
  var m22: js.Number = _
  var m21: js.Number = _
  var c: js.Number = _
  var m12: js.Number = _
  var b: js.Number = _
  var m42: js.Number = _
  var m31: js.Number = _
  var m43: js.Number = _
  var m13: js.Number = _
  var m44: js.Number = _
  def multiply(secondMatrix: MSCSSMatrix): MSCSSMatrix = ???
  def skewY(angle: js.Number): MSCSSMatrix = ???
  def setMatrixValue(value: js.String): Unit = ???
  def inverse(): MSCSSMatrix = ???
  def rotateAxisAngle(x: js.Number, y: js.Number, z: js.Number, angle: js.Number): MSCSSMatrix = ???
  
  def rotate(angleX: js.Number, angleY: js.Number, angleZ: js.Number): MSCSSMatrix = ???
  def rotate(angleX: js.Number, angleY: js.Number): MSCSSMatrix = ???
  def rotate(angleX: js.Number): MSCSSMatrix = ???
  def translate(x: js.Number, y: js.Number, z: js.Number): MSCSSMatrix = ???
  def translate(x: js.Number, y: js.Number): MSCSSMatrix = ???
  def scale(scaleX: js.Number, scaleY: js.Number, scaleZ: js.Number): MSCSSMatrix = ???
  def scale(scaleX: js.Number, scaleY: js.Number): MSCSSMatrix = ???
  def scale(scaleX: js.Number): MSCSSMatrix = ???
  def skewX(angle: js.Number): MSCSSMatrix = ???
}

object MSCSSMatrix extends js.Object {
}

class Worker protected () extends AbstractWorker {
  def this(stringUrl: js.String) = this()
  var onmessage: js.Function1[js.Any, js.Any] = _
  def postMessage(message: js.Any, ports: js.Any): Unit = ???
  def postMessage(message: js.Any): Unit = ???
  def terminate(): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
  override def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
}

object Worker extends js.Object {
}

}
package js{
  object JsGlobals extends js.GlobalScope {
    var ondragend: js.Function1[DragEvent, js.Any] = _
    var onkeydown: js.Function1[KeyboardEvent, js.Any] = _
    var ondragover: js.Function1[DragEvent, js.Any] = _
    var onkeyup: js.Function1[KeyboardEvent, js.Any] = _
    var onreset: js.Function1[Event, js.Any] = _
    var onmouseup: js.Function1[MouseEvent, js.Any] = _
    var ondragstart: js.Function1[DragEvent, js.Any] = _
    var ondrag: js.Function1[DragEvent, js.Any] = _
    var screenX: js.Number = _
    var onmouseover: js.Function1[MouseEvent, js.Any] = _
    var ondragleave: js.Function1[DragEvent, js.Any] = _
    var history: History = _
    var pageXOffset: js.Number = _
    var name: js.String = _
    var onafterprint: js.Function1[Event, js.Any] = _
    var onpause: js.Function1[Event, js.Any] = _
    var onbeforeprint: js.Function1[Event, js.Any] = _
    var top: Window = _
    var onmousedown: js.Function1[MouseEvent, js.Any] = _
    var onseeked: js.Function1[Event, js.Any] = _
    var opener: Window = _
    var onclick: js.Function1[MouseEvent, js.Any] = _
    var innerHeight: js.Number = _
    var onwaiting: js.Function1[Event, js.Any] = _
    var ononline: js.Function1[Event, js.Any] = _
    var ondurationchange: js.Function1[Event, js.Any] = _
    var frames: Window = _
    var onblur: js.Function1[FocusEvent, js.Any] = _
    var onemptied: js.Function1[Event, js.Any] = _
    var onseeking: js.Function1[Event, js.Any] = _
    var oncanplay: js.Function1[Event, js.Any] = _
    var outerWidth: js.Number = _
    var onstalled: js.Function1[Event, js.Any] = _
    var onmousemove: js.Function1[MouseEvent, js.Any] = _
    var innerWidth: js.Number = _
    var onoffline: js.Function1[Event, js.Any] = _
    var length: js.Number = _
    var screen: Screen = _
    var onbeforeunload: js.Function1[BeforeUnloadEvent, js.Any] = _
    var onratechange: js.Function1[Event, js.Any] = _
    var onstorage: js.Function1[StorageEvent, js.Any] = _
    var onloadstart: js.Function1[Event, js.Any] = _
    var ondragenter: js.Function1[DragEvent, js.Any] = _
    var onsubmit: js.Function1[Event, js.Any] = _
    var self: Window = _
    var document: Document = _
    var onprogress: js.Function1[js.Any, js.Any] = _
    var ondblclick: js.Function1[MouseEvent, js.Any] = _
    var pageYOffset: js.Number = _
    var oncontextmenu: js.Function1[MouseEvent, js.Any] = _
    var onchange: js.Function1[Event, js.Any] = _
    var onloadedmetadata: js.Function1[Event, js.Any] = _
    var onplay: js.Function1[Event, js.Any] = _
    var onerror: ErrorEventHandler = _
    var onplaying: js.Function1[Event, js.Any] = _
    var parent: Window = _
    var location: Location = _
    var oncanplaythrough: js.Function1[Event, js.Any] = _
    var onabort: js.Function1[UIEvent, js.Any] = _
    var onreadystatechange: js.Function1[Event, js.Any] = _
    var outerHeight: js.Number = _
    var onkeypress: js.Function1[KeyboardEvent, js.Any] = _
    var frameElement: Element = _
    var onloadeddata: js.Function1[Event, js.Any] = _
    var onsuspend: js.Function1[Event, js.Any] = _
    var window: Window = _
    var onfocus: js.Function1[FocusEvent, js.Any] = _
    var onmessage: js.Function1[MessageEvent, js.Any] = _
    var ontimeupdate: js.Function1[Event, js.Any] = _
    var onresize: js.Function1[UIEvent, js.Any] = _
    var onselect: js.Function1[UIEvent, js.Any] = _
    var navigator: Navigator = _
    var styleMedia: StyleMedia = _
    var ondrop: js.Function1[DragEvent, js.Any] = _
    var onmouseout: js.Function1[MouseEvent, js.Any] = _
    var onended: js.Function1[Event, js.Any] = _
    var onhashchange: js.Function1[Event, js.Any] = _
    var onunload: js.Function1[Event, js.Any] = _
    var onscroll: js.Function1[UIEvent, js.Any] = _
    var screenY: js.Number = _
    var onmousewheel: js.Function1[MouseWheelEvent, js.Any] = _
    var onload: js.Function1[Event, js.Any] = _
    var onvolumechange: js.Function1[Event, js.Any] = _
    var oninput: js.Function1[Event, js.Any] = _
    var performance: Performance = _
    def alert(message: js.String): Unit = ???
    def alert(): Unit = ???
    def scroll(x: js.Number, y: js.Number): Unit = ???
    def scroll(x: js.Number): Unit = ???
    def scroll(): Unit = ???
    def focus(): Unit = ???
    def scrollTo(x: js.Number, y: js.Number): Unit = ???
    def scrollTo(x: js.Number): Unit = ???
    def scrollTo(): Unit = ???
    def print(): Unit = ???
    def prompt(message: js.String, defaul: js.String): js.String = ???
    def prompt(message: js.String): js.String = ???
    def prompt(): js.String = ???

    def open(url: js.String, target: js.String, features: js.String, replace: js.Boolean): Window = ???
    def open(url: js.String, target: js.String, features: js.String): Window = ???
    def open(url: js.String, target: js.String): Window = ???
    def open(url: js.String): Window = ???
    def open(): Window = ???
    def scrollBy(x: js.Number, y: js.Number): Unit = ???
    def scrollBy(x: js.Number): Unit = ???
    def scrollBy(): Unit = ???
    def confirm(message: js.String): js.Boolean = ???
    def confirm(): js.Boolean = ???
    def close(): Unit = ???
    def postMessage(message: js.Any, targetOrigin: js.String, ports: js.Any): Unit = ???
    def postMessage(message: js.Any, targetOrigin: js.String): Unit = ???
    def showModalDialog(url: js.String, argument: js.Any, options: js.Any): js.Dynamic = ???
    def showModalDialog(url: js.String, argument: js.Any): js.Dynamic = ???
    def showModalDialog(url: js.String): js.Dynamic = ???
    def showModalDialog(): js.Dynamic = ???
    def blur(): Unit = ???
    def getSelection(): Selection = ???
    def getComputedStyle(elt: Element, pseudoElt: js.String): CSSStyleDeclaration = ???
    def getComputedStyle(elt: Element): CSSStyleDeclaration = ???
    def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
    def addEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
    def removeEventListener(`type`: js.String, listener: js.Function1[Event, Unit], useCapture: js.Boolean): Unit = ???
    def removeEventListener(`type`: js.String, listener: js.Function1[Event, Unit]): Unit = ???
    def dispatchEvent(evt: Event): js.Boolean = ???
    def attachEvent(event: js.String, listener: js.Function1[Event, Unit]): js.Boolean = ???
    def detachEvent(event: js.String, listener: js.Function1[Event, Unit]): Unit = ???
    var localStorage: Storage = _
    var status: js.String = _
    var onmouseleave: js.Function1[MouseEvent, js.Any] = _
    var screenLeft: js.Number = _
    var offscreenBuffering: js.Any = _
    var maxConnectionsPerServer: js.Number = _
    var onmouseenter: js.Function1[MouseEvent, js.Any] = _
    var clipboardData: DataTransfer = _
    var defaultStatus: js.String = _
    var clientInformation: Navigator = _
    var closed: js.Boolean = _
    var onhelp: js.Function1[Event, js.Any] = _
    var external: External = _
    var event: MSEventObj = _
    var onfocusout: js.Function1[FocusEvent, js.Any] = _
    var screenTop: js.Number = _
    var onfocusin: js.Function1[FocusEvent, js.Any] = _
    def showModelessDialog(url: js.String, argument: js.Any, options: js.Any): Window = ???
    def showModelessDialog(url: js.String, argument: js.Any): Window = ???
    def showModelessDialog(url: js.String): Window = ???
    def showModelessDialog(): Window = ???
    def navigate(url: js.String): Unit = ???
    def resizeBy(x: js.Number, y: js.Number): Unit = ???
    def resizeBy(x: js.Number): Unit = ???
    def resizeBy(): Unit = ???
    def item(index: js.Any): js.Dynamic = ???
    def resizeTo(x: js.Number, y: js.Number): Unit = ???
    def resizeTo(x: js.Number): Unit = ???
    def resizeTo(): Unit = ???
    def createPopup(arguments: js.Any): MSPopupWindow = ???
    def createPopup(): MSPopupWindow = ???
    def toStaticHTML(html: js.String): js.String = ???
    def execScript(code: js.String, language: js.String): js.Dynamic = ???
    def execScript(code: js.String): js.Dynamic = ???
    def msWriteProfilerMark(profilerMarkName: js.String): Unit = ???
    def moveTo(x: js.Number, y: js.Number): Unit = ???
    def moveTo(x: js.Number): Unit = ???
    def moveTo(): Unit = ???
    def moveBy(x: js.Number, y: js.Number): Unit = ???
    def moveBy(x: js.Number): Unit = ???
    def moveBy(): Unit = ???
    def showHelp(url: js.String, helpArg: js.Any, features: js.String): Unit = ???
    def showHelp(url: js.String, helpArg: js.Any): Unit = ???
    def showHelp(url: js.String): Unit = ???
    var sessionStorage: Storage = _
    def clearTimeout(handle: js.Number): Unit = ???
    def setTimeout(handler: js.Any, timeout: js.Any, args: js.Any*): js.Number = ???
    def clearInterval(handle: js.Number): Unit = ???
    def setInterval(handler: js.Any, timeout: js.Any, args: js.Any*): js.Number = ???
    var URL: URL = _
    var MSApp: MSApp = _
    var onmspointerdown: js.Function1[js.Any, js.Any] = _
    var animationStartTime: js.Number = _
    var onmsgesturedoubletap: js.Function1[js.Any, js.Any] = _
    var onmspointerhover: js.Function1[js.Any, js.Any] = _
    var onmsgesturehold: js.Function1[js.Any, js.Any] = _
    var onmspointermove: js.Function1[js.Any, js.Any] = _
    var onmsgesturechange: js.Function1[js.Any, js.Any] = _
    var onmsgesturestart: js.Function1[js.Any, js.Any] = _
    var onmspointercancel: js.Function1[js.Any, js.Any] = _
    var onmsgestureend: js.Function1[js.Any, js.Any] = _
    var onmsgesturetap: js.Function1[js.Any, js.Any] = _
    var onmspointerout: js.Function1[js.Any, js.Any] = _
    var msAnimationStartTime: js.Number = _
    var applicationCache: ApplicationCache = _
    var onmsinertiastart: js.Function1[js.Any, js.Any] = _
    var onmspointerover: js.Function1[js.Any, js.Any] = _
    var onpopstate: js.Function1[PopStateEvent, js.Any] = _
    var onmspointerup: js.Function1[js.Any, js.Any] = _
    def msCancelRequestAnimationFrame(handle: js.Number): Unit = ???
    def matchMedia(mediaQuery: js.String): MediaQueryList = ???
    def cancelAnimationFrame(handle: js.Number): Unit = ???
    def msIsStaticHTML(html: js.String): js.Boolean = ???
    def msMatchMedia(mediaQuery: js.String): MediaQueryList = ???
    def requestAnimationFrame(callback: FrameRequestCallback): js.Number = ???
    def msRequestAnimationFrame(callback: FrameRequestCallback): js.Number = ???
    def btoa(rawString: js.String): js.String = ???
    def atob(encodedString: js.String): js.String = ???
    var msIndexedDB: IDBFactory = _
    var indexedDB: IDBFactory = _
    var console: Console = _
  }
}