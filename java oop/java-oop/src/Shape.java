class Shape {

    int getChord(){
        return 0;
    }
}

class shapeChord extends Shape {
    int getChord(){
        return 4;
    }

    int getNilaiChord(){
        return super.getChord();
    }
}
