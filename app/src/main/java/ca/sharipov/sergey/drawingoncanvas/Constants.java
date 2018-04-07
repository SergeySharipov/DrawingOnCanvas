package ca.sharipov.sergey.drawingoncanvas;

public interface Constants {
    int BOTTOM_POSITION = 0;
    int LEFT_POSITION = 90;
    int TOP_POSITION = 180;
    int RIGHT_POSITION = 270;
    int NULL_POSITION = 45;
    int MAX_POSITION = 360;

    int[][][] NUMBERS_POSITIONS = {
            {//0
                    {BOTTOM_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, BOTTOM_POSITION},
                    {TOP_POSITION, BOTTOM_POSITION}, {BOTTOM_POSITION, RIGHT_POSITION}, {LEFT_POSITION, BOTTOM_POSITION}, {TOP_POSITION, BOTTOM_POSITION},
                    {TOP_POSITION, BOTTOM_POSITION}, {TOP_POSITION, BOTTOM_POSITION}, {TOP_POSITION, BOTTOM_POSITION}, {TOP_POSITION, BOTTOM_POSITION},
                    {TOP_POSITION, BOTTOM_POSITION}, {TOP_POSITION, BOTTOM_POSITION}, {TOP_POSITION, BOTTOM_POSITION}, {TOP_POSITION, BOTTOM_POSITION},
                    {TOP_POSITION, BOTTOM_POSITION}, {TOP_POSITION, RIGHT_POSITION}, {LEFT_POSITION, TOP_POSITION}, {TOP_POSITION, BOTTOM_POSITION},
                    {TOP_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, TOP_POSITION}
            },
            {//1
                    {BOTTOM_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, BOTTOM_POSITION}, {NULL_POSITION, NULL_POSITION},
                    {TOP_POSITION, RIGHT_POSITION}, {LEFT_POSITION, BOTTOM_POSITION}, {TOP_POSITION, BOTTOM_POSITION}, {NULL_POSITION, NULL_POSITION},
                    {NULL_POSITION, NULL_POSITION}, {TOP_POSITION, BOTTOM_POSITION}, {TOP_POSITION, BOTTOM_POSITION}, {NULL_POSITION, NULL_POSITION},
                    {NULL_POSITION, NULL_POSITION}, {TOP_POSITION, BOTTOM_POSITION}, {TOP_POSITION, BOTTOM_POSITION}, {NULL_POSITION, NULL_POSITION},
                    {BOTTOM_POSITION, RIGHT_POSITION}, {LEFT_POSITION, TOP_POSITION}, {TOP_POSITION, RIGHT_POSITION}, {LEFT_POSITION, BOTTOM_POSITION},
                    {TOP_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, TOP_POSITION}
            },
            {//2
                    {BOTTOM_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, BOTTOM_POSITION},
                    {TOP_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, BOTTOM_POSITION}, {TOP_POSITION, BOTTOM_POSITION},
                    {BOTTOM_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, TOP_POSITION}, {TOP_POSITION, BOTTOM_POSITION},
                    {TOP_POSITION, BOTTOM_POSITION}, {BOTTOM_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, TOP_POSITION},
                    {TOP_POSITION, BOTTOM_POSITION}, {TOP_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, BOTTOM_POSITION},
                    {TOP_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, TOP_POSITION}
            },
            {//3
                    {BOTTOM_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, BOTTOM_POSITION},
                    {TOP_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, BOTTOM_POSITION}, {TOP_POSITION, BOTTOM_POSITION},
                    {BOTTOM_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, TOP_POSITION}, {TOP_POSITION, BOTTOM_POSITION},
                    {TOP_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, BOTTOM_POSITION}, {TOP_POSITION, BOTTOM_POSITION},
                    {BOTTOM_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, TOP_POSITION}, {TOP_POSITION, BOTTOM_POSITION},
                    {TOP_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, TOP_POSITION}
            },
            {//4
                    {BOTTOM_POSITION, RIGHT_POSITION}, {LEFT_POSITION, BOTTOM_POSITION}, {BOTTOM_POSITION, RIGHT_POSITION}, {LEFT_POSITION, BOTTOM_POSITION},
                    {TOP_POSITION, BOTTOM_POSITION}, {TOP_POSITION, BOTTOM_POSITION}, {TOP_POSITION, BOTTOM_POSITION}, {TOP_POSITION, BOTTOM_POSITION},
                    {TOP_POSITION, BOTTOM_POSITION}, {TOP_POSITION, RIGHT_POSITION}, {LEFT_POSITION, TOP_POSITION}, {TOP_POSITION, BOTTOM_POSITION},
                    {TOP_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, BOTTOM_POSITION}, {TOP_POSITION, BOTTOM_POSITION},
                    {NULL_POSITION, NULL_POSITION}, {NULL_POSITION, NULL_POSITION}, {TOP_POSITION, BOTTOM_POSITION}, {TOP_POSITION, BOTTOM_POSITION},
                    {NULL_POSITION, NULL_POSITION}, {NULL_POSITION, NULL_POSITION}, {TOP_POSITION, RIGHT_POSITION}, {LEFT_POSITION, TOP_POSITION}
            },
            {//5
                    {BOTTOM_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, BOTTOM_POSITION},
                    {TOP_POSITION, BOTTOM_POSITION}, {BOTTOM_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, TOP_POSITION},
                    {TOP_POSITION, BOTTOM_POSITION}, {TOP_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, BOTTOM_POSITION},
                    {TOP_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, BOTTOM_POSITION}, {TOP_POSITION, BOTTOM_POSITION},
                    {BOTTOM_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, TOP_POSITION}, {TOP_POSITION, BOTTOM_POSITION},
                    {TOP_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, TOP_POSITION}
            },
            {//6
                    {BOTTOM_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, BOTTOM_POSITION},
                    {TOP_POSITION, BOTTOM_POSITION}, {BOTTOM_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, TOP_POSITION},
                    {TOP_POSITION, BOTTOM_POSITION}, {TOP_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, BOTTOM_POSITION},
                    {TOP_POSITION, BOTTOM_POSITION}, {BOTTOM_POSITION, RIGHT_POSITION}, {LEFT_POSITION, BOTTOM_POSITION}, {TOP_POSITION, BOTTOM_POSITION},
                    {TOP_POSITION, BOTTOM_POSITION}, {TOP_POSITION, RIGHT_POSITION}, {LEFT_POSITION, TOP_POSITION}, {TOP_POSITION, BOTTOM_POSITION},
                    {TOP_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, TOP_POSITION}
            },
            {//7
                    {BOTTOM_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, BOTTOM_POSITION},
                    {TOP_POSITION, BOTTOM_POSITION}, {BOTTOM_POSITION, RIGHT_POSITION}, {LEFT_POSITION, BOTTOM_POSITION}, {TOP_POSITION, BOTTOM_POSITION},
                    {TOP_POSITION, RIGHT_POSITION}, {LEFT_POSITION, TOP_POSITION}, {TOP_POSITION, BOTTOM_POSITION}, {TOP_POSITION, BOTTOM_POSITION},
                    {NULL_POSITION, NULL_POSITION}, {NULL_POSITION, NULL_POSITION}, {TOP_POSITION, BOTTOM_POSITION}, {TOP_POSITION, BOTTOM_POSITION},
                    {NULL_POSITION, NULL_POSITION}, {NULL_POSITION, NULL_POSITION}, {TOP_POSITION, BOTTOM_POSITION}, {TOP_POSITION, BOTTOM_POSITION},
                    {NULL_POSITION, NULL_POSITION}, {NULL_POSITION, NULL_POSITION}, {TOP_POSITION, RIGHT_POSITION}, {LEFT_POSITION, TOP_POSITION}
            },
            {//8
                    {BOTTOM_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, BOTTOM_POSITION},
                    {TOP_POSITION, BOTTOM_POSITION}, {BOTTOM_POSITION, RIGHT_POSITION}, {LEFT_POSITION, BOTTOM_POSITION}, {TOP_POSITION, BOTTOM_POSITION},
                    {TOP_POSITION, BOTTOM_POSITION}, {TOP_POSITION, RIGHT_POSITION}, {LEFT_POSITION, TOP_POSITION}, {TOP_POSITION, BOTTOM_POSITION},
                    {TOP_POSITION, BOTTOM_POSITION}, {BOTTOM_POSITION, RIGHT_POSITION}, {LEFT_POSITION, BOTTOM_POSITION}, {TOP_POSITION, BOTTOM_POSITION},
                    {TOP_POSITION, BOTTOM_POSITION}, {TOP_POSITION, RIGHT_POSITION}, {LEFT_POSITION, TOP_POSITION}, {TOP_POSITION, BOTTOM_POSITION},
                    {TOP_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, TOP_POSITION}
            },
            {//9
                    {BOTTOM_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, BOTTOM_POSITION},
                    {TOP_POSITION, BOTTOM_POSITION}, {BOTTOM_POSITION, RIGHT_POSITION}, {LEFT_POSITION, BOTTOM_POSITION}, {TOP_POSITION, BOTTOM_POSITION},
                    {TOP_POSITION, BOTTOM_POSITION}, {TOP_POSITION, RIGHT_POSITION}, {LEFT_POSITION, TOP_POSITION}, {TOP_POSITION, BOTTOM_POSITION},
                    {TOP_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, BOTTOM_POSITION}, {TOP_POSITION, BOTTOM_POSITION},
                    {BOTTOM_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, TOP_POSITION}, {TOP_POSITION, BOTTOM_POSITION},
                    {TOP_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, RIGHT_POSITION}, {LEFT_POSITION, TOP_POSITION}
            },
            {//-1
                    {NULL_POSITION, NULL_POSITION},{NULL_POSITION, NULL_POSITION},{NULL_POSITION, NULL_POSITION},{NULL_POSITION, NULL_POSITION},
                    {NULL_POSITION, NULL_POSITION},{NULL_POSITION, NULL_POSITION},{NULL_POSITION, NULL_POSITION},{NULL_POSITION, NULL_POSITION},
                    {NULL_POSITION, NULL_POSITION},{NULL_POSITION, NULL_POSITION},{NULL_POSITION, NULL_POSITION},{NULL_POSITION, NULL_POSITION},
                    {NULL_POSITION, NULL_POSITION},{NULL_POSITION, NULL_POSITION},{NULL_POSITION, NULL_POSITION},{NULL_POSITION, NULL_POSITION},
                    {NULL_POSITION, NULL_POSITION},{NULL_POSITION, NULL_POSITION},{NULL_POSITION, NULL_POSITION},{NULL_POSITION, NULL_POSITION},
                    {NULL_POSITION, NULL_POSITION},{NULL_POSITION, NULL_POSITION},{NULL_POSITION, NULL_POSITION},{NULL_POSITION, NULL_POSITION}
            }
    };

}