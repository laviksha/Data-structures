static int myXOR(int x, int y)
{
    return (x | y) &
           (~x | ~y);
}
