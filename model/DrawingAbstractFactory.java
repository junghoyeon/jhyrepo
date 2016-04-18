abstract class DrawingAbstractFactory {
  abstract getColor(stirng):Color
  abstract getShape(stirng):Shape
}

DrawingAbstractFactory <-- ColorFactory
DrawingAbstractFactory <-- ShapeFactory

interface Color
Color <|.. Green
Color <|.. Red

interface Shape
Shape <|.. Rectangle
Shape <|.. Square
ColorFactory ..> Color
ShapeFactory ..> Shape