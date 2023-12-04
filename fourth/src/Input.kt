val INPUT = """
    Card   1: 98 16 95 90 53 33 43  7 46 45 | 85 15 78 57 34 10 46 90 33 13  8 54  4 37 25 63 55 41  7 82 69 16 30 76  2
    Card   2: 55 34 32 64 52 76 54  8 36 94 | 94 95 76 66 38 26 80 54 32 91 19 64 21 55 36 96 52 82 15 56 70 89 46 71 74
    Card   3: 35 26 78 89 82 92 37 10  3 43 | 41 81 62 52 92 63 26 57 28 55 93 30 72 71 99 84 96 60 82 78 73 65 43 50 25
    Card   4: 71 27 75 73 79 83 44 55 31 49 | 74 79 17 38 28 41 88 25 61 55 12 40 43 44  6 73 71 83 49 75 67 80 27 10 31
    Card   5: 26 10 58 57 85 65 42 23 97 30 | 65 26 85 97 31 10 23 88 58 16 80 22 67 44  7 77 30 69 34 42 24 57 66 27 99
    Card   6: 56 24 39 96 36 46 48 94 30 58 | 16 24 99 48 73 30 91  7 87 57 23 49 69 39 94 63 17 58 56  9 34 36 31 46 96
    Card   7: 82 75 29 17 66 41 25 52 98  5 | 30 41 73 66 25 57 47 22 89 34 75 21  5 63 90 85 13 38 82 17 29 71 98 52  1
    Card   8: 45 56 10 72 89 61 64 32 82  7 | 64 32 45 67 84 28  2 56 10 82 55 72  6 61 97 91 89  7 22 70 88  3 41 98 13
    Card   9: 92 39 44 48 96 72 43 78 98 86 | 76 87  9 45 98 47 31 44 34 92 43 54 72 39 50 96 77 86 62 13 16  6 78 48  8
    Card  10: 66 44 15 56 88 27 54 51  5 92 | 44 92 18 56 22 85 40 76 90 83  5 13 35 59 27 65 62 15 95 94 81 39 88 54  6
    Card  11: 13 42  7 36 46 82 78 60  1 55 | 42  7 95 43 13 82 94 32 74 16 46 70 60 78 86 30 53 36 55 96  4 92 49 44 26
    Card  12: 65 39 28 30 99 73 95 92 55 58 | 23 86 39 28 88 48 41 73 89 95 34 92  5 21 72 10 97 30 20 32 40 85 27 68 65
    Card  13: 68 60 92 16 70 71 15 94 43 83 | 70 59 88 67 27 77 51 54 15 22 49 71 94 60  7 72 47  1 38 39 36 19 68 12 16
    Card  14: 73 83  6  7 67 48 24 13 17 70 | 72 77 78 96 50 83 12 92 80 60 10 87 38 23 31 30 58 47  1 43 59 34 75  8  5
    Card  15: 69 53 76  5 55 85 42 10 94 63 | 59 66 87 60 28  6 24 32 40 70 69 63 54 97 96 82 94 10 53 74 42 16 76 44 55
    Card  16: 84 77 93 78 46 70  5 12 98 83 | 89  4 27 30 98 91 93 52 67 39 88 56 92 79 25  1 83 60 11 68 53 69 84 73 85
    Card  17: 26 37  9 58 78 49 52 31 97 34 | 39 99 37 81 49 72 84 94 76 70 33 41 12 89 85 47 51 65 97 16  3 24 19 79  8
    Card  18: 49 74 17 93 46 15 85 59 24 36 | 46 25 20 94 47 90 61 84 63  4 41 79 18 74 54 80 43 29 97 86 77 52  5 99  8
    Card  19: 85 64 79 31 53 92 42 69 93  3 | 47 62 61 21  3 49  7 74 98 22 86 34 48 15 76 13 89 81 31 77 37 56 99 97 50
    Card  20: 73 64 45 77 19 33 82 14 84 29 | 17 90 95 78 54 35 49 55 62 60 30 56 59 81 68 88 69 87 77  7 83 65 92  6  1
    Card  21: 91 38 35 34 53 92 66 82 55 21 | 23 39 87 34 27 31 15  5 36 64 80 97 52 89 94 50 26 37 45 44 17 30 88  1 82
    Card  22: 64 85 88 91 87 84 43 35 39 41 | 73  3 89 63 75 99 24  5  9 70 26  2 21 30 86 96 40 81 78 60 61 32 74 51 17
    Card  23: 84 72 32 92 44 94 46  7 19  4 | 73 39 45 18 76 65 25 40 32 66 78 51 15 50 69  9 11  6 26 90 61 35 22 54 55
    Card  24: 57 78 95  5 97 47 42 10 73 35 | 77 67 28 93 52 55 54 51 92 66 49 56 27 17 37  7 89 74 14 62 87 88 82 53  2
    Card  25: 21 69 58 54 90  1 95 45 72 53 | 72 81 77  1 69  9 58 21 29 22 95 45 68 80 90 54 78 97 48 53 59 36 31 46 75
    Card  26: 12 46 92 10 21 97 35 27 68 74 | 47 74 27 72 90 25 49 30  7 26 97 60 61  3 31 51 68 92 41 10  4  9 35 88 63
    Card  27: 21 27 52 20 85 42  5 70 56 37 | 55 57  2  5 79 11 58 77 49 45 74 69 27 70 21 56 66 12 76 20 92 84 37 85 61
    Card  28: 95 39 51 30 19 90 75  3 25 21 | 20 97 83 95 25 84 30 22 78 33 51 46 74 79 19 89 63 61 39 90 21  3  2 52 31
    Card  29: 53  5 71 37 67 81 19 52 36 74 | 52 93 15  5 33 36 28  8 12 32 31 43  2 13 74 62 59 10 20 70 68 14 87 19 38
    Card  30:  9 67 73 21 20 64 11 84 97 31 | 13 57 40 58 21 84 80 30 67 52 85 74 56 55 50 97 72 10 51 89  6 70 64 96 11
    Card  31: 64 54 68 67 50  6 88 29 63 38 | 38 67  3 31 61 83 28 44  1 99 66 65 74 98 64 55 51  8 54 94 46 68 95 79 50
    Card  32: 86 43 79 54  5  7 78 38 10 23 | 39 92 54  6 38 23  5  8 57 91 41  7 70 10 45 82  9 35 62 87 56 69  4 78 36
    Card  33: 66 58 52  9 27 81  1 17 94 78 | 34  3 95 56 69 78 91 45 32 30 59 84 64 52 36 62 26 16 63 99 27 89 74 28 24
    Card  34: 73 58 80 18 17 67 70 41 29 75 | 81 27 76 63 20 31 72 46 33 53 45 38 39 29 57 92 78 28 70 61 19 55 36 32 24
    Card  35: 79 31  6 76 62 27 97 40 92 41 | 26 97  5 47 76 40 21 87  3  4 38 61 53 48 43 36 41 65 55 25 57 96 79 18 49
    Card  36: 34 43 78 88 72 74 97  3 10 38 | 55 62 96 44 79 33 68 52 75 22 98 26 71 82 36 56 86 15 64 41 46 24 83 11 67
    Card  37: 26 61 31 17  4 56 12 50 86 51 | 17 68 22 61 85 78  9 51 14  6 39 31 28 27 96 50 52  4 86 43 12 26 59 74  7
    Card  38:  7 99 77 74  6 43 85 33 53 19 | 94 45 19 36  6 55 66 82 16 47 65 42 78 12 76 77 48 79  8 75 93 62 56 50 33
    Card  39: 57 97 81 84 25 60 16 44  1 78 |  4 78  9 51 90 40 34 64 89 38 80 16 71 35 88 87 41  6 65 23 39 15 67 52 72
    Card  40: 81 44 16 11 53 72 46 91 86 20 | 17 47 80 40  1 69 93 55 54 12 26 82 64 45 61 58 70 83 28 98 94 89 92 59 23
    Card  41: 55 89 25 91 42 45 80 59 84 82 | 83 31 11 42 61 48 77 95 89 84 13 79 92 25 68 33 26 40 52 24 66 45 97 29 17
    Card  42:  2 96 32 73  8 34 66  9  6 41 | 55 90 96 29 45 14  9  6 75 30 60 47 51 37 81  3 72 58 73 87 70 18 23 69 80
    Card  43: 65  3 18 82 67 22 62 79 17 94 | 51 11 26 23 89 55 13 32 77  9 12 38 60 20 25 64 14 43 24 35 56 80 42 99 86
    Card  44: 30 47 49 35 19 82 26 85 27 95 | 43 97 86 69 42 94 78 11 27 31 17 39 79 46 90 18 57 48  4 22 32 87 38 29 84
    Card  45: 83 15 74 94 99  1 57 82 68 16 | 95 97 84  6 87 81 20 64 69  5 28 30 29 88 43 15 98  7 24 55 34 39 47 92  3
    Card  46: 73 22 25 83 84 55 53 34 51  2 | 27 90 24 61 29 43 50 17 18 68 15 80  8 81 87 16 10 85 54 31 56 91 46 52 95
    Card  47: 70 19 17 60 46 78 75 86 27 59 | 86 99 19 45  8 17 29 41 52 75 60 47 79 54 57 70 46 59 51 68 94 78 27 53  1
    Card  48: 45  6 22 51 11 30 31  1 83 77 |  2 73 85 49 61 86 77 90 59 97 47 89 10 22 45 41 31  6 83 11  1 65 58 82 60
    Card  49: 60 78 33  6 11 36 72 56 61 94 | 43 16 62 46 31 61 78 56 60 67 33  6 13 72 94 68 18 77 11  5 36 54 10  8 66
    Card  50: 88 21 74 31 20 46 75 10 89 77 | 23 88 43 10 74 64  5 77 55 76 28 78 21 31 27 89  1 72 20 96 75 82 46 47 35
    Card  51: 12  8  3 94 21 26 24 86 45 85 |  6 14 12 10  7 69 78 31 64  5 44  3 80  4 52 71 20 84 50 59 13  8 94 77 99
    Card  52: 14 84 36 27  8 46 99 30  7 44 | 30 16 89 87 60  9 14 78 99  8 65 58 38 88  7 46 67 29 69 37 40 44 97 36 51
    Card  53: 39 37 12 83  4 98 96 92 41 73 | 67 20 91 99  4 10 63 26  6 75 40 92 37 65 39 73 68 84 12 83 96 98 54 41  7
    Card  54:  1 27 72 18 88 99 64 19 86 37 | 88 19 37 64  5 22 80 99  1 27 65  8  9 53 14 16 79 95 71 72 32 21 86 39 98
    Card  55: 39 88 93 55 97  9 34 92 45  2 | 92 55 21  1 78 34 97 94 11 38  2 44 64 15 80 35 60  9 81 54 88 91 96 85 45
    Card  56: 79 74 85 84 65 87 27 44 16 90 | 98 79 48 77 52 82 58 18 57 72 16 84  3 85 90 74 64 87 44 14 27 71 75  4 21
    Card  57: 96 53 75 92  9 43 56 52 91 97 |  7 76 56  3 92 75 16 43 96 72 29 49 66 91 28 70 87 33 58  1 52 19  9 97 53
    Card  58: 44 25 31 71 95 73 10 54 53 17 | 37 99 57 16 80 73 24 47 17 83 68 31 13 52 93 71 76 95 12 81 14 21 49  7 34
    Card  59: 29 45 26 80 95 57 20 13 14 63 | 83 51 36 19  5 58 44  3 97  1 16 67 15 41 53 31 28 91 84 40 90 24 88 60 18
    Card  60: 50 63 56 53 14 35 18  1 91 19 | 25 96 66 45 36 58 90 91  1 32 35 14  3 47 33 22 86 40 95 24 23  4 27 68 48
    Card  61: 42 83 31 68 92  7 26  4 29 22 |  7 17 31 43 79  2 33  4 63 88 26 61 81 93 69 85 89 11 65 77 42 92 37 57 32
    Card  62: 64 85 65 55 43 53 10 69 33 97 | 78 61 31 76 18 30 39 12 90 42  8 58 27 67 89 46 26 69 82 11 16 62  1 44 10
    Card  63:  6 33 83 73 17 30 32 81 49  5 | 52 90 76 93  5 86 73 34 92 47 67 55 43 61 26 18  1 33 16 50 49 74 24 46 89
    Card  64: 87 91 82 58 84 50 48  3 27 55 | 60 96 72 26 81  1  6 52 78 99  4 23 40 30 36 47 48 69 25 34 83 87 37 70 20
    Card  65: 92 76 38 30 50 39 75 90 44  1 | 68 71 39 13 53 25 63 76 16 59 41 43 18 22 17 98  4 10 86 89 12 26 72 95 19
    Card  66: 76 41 77 37 23 94 96 27 66 22 | 59 24 20 92  4 37 91 33 16 53  3 90  5 69 50 27 99 62 98 61 35 28 86 95 82
    Card  67: 37 98 85 97 69 64 72 47 13 50 | 43 10  6 41 67 80 82 29 40 94 61 33 36 63 65 76 24  9 86 57 79 73  8 45  2
    Card  68: 55 35 94 69 38 26 63 33 98 76 |  7 41 71 84 21 25 12 20 98 46 82 72 38  8 56 89 39 27 75 43 96 44 29 78 35
    Card  69: 24 86 74 36 66 84 90 61  1 94 | 55 57 18 85 69 97 16 34 32 54 93 35 64  9  8  4 98  5 72 59 75 23 62 91 26
    Card  70: 56 52 41 51 88 93 17 44 32  7 | 46 57 16 69 10 50 26  5 36 92 24 55 63 98 11  3 75 31 33 99 74  1 89 60 61
    Card  71: 15 41 67 78 51 72 12 77 32 88 | 83 93 91 13 50 87 47 96 16 19 11 34  6 27 82  5 46 56 69 79 62 85 35 40 61
    Card  72:  2 58 18 85 23 66 40  9 50 79 | 41  2 50  8 10 75  7 61 62 87 11 99 33 30 56 25 98 54 59 82 94 74 35 60 15
    Card  73: 75 90 45 31 56 86 11 42 89 26 | 89 90 28 11 57 49 24 35 14 19 72 94 79 44 30  3 43 41 53 46 26 86 97 51 20
    Card  74: 27 24 43 10 84 39 96 22 25 78 | 39 33 42 11 63 50 91 43 35  4 80 84 32 26 70 48 18  6 29 23 78 24 89 45  8
    Card  75: 79 38 25 51 77 84 68 43 83 10 | 75 74 13  3 24  6 55 81 11 39 49 66 99 50 48 15 14 37 61 57 17 59 87 36  9
    Card  76: 24  9 81 35 34  1 59 80 56 58 |  9 56 36 60  1 58 80 59 72 34 12 24 35 81 17 68 77 62 67 97 69 78 41 90 93
    Card  77: 84 55 45 44 36 80 97  5 64 70 | 57 22 49 54 43 71 53 90 12 35  6 64 79 84 99  7 94 17 38 70 45 72 68 80 74
    Card  78: 24 49 27 96 77 18 82 33 50 19 | 60  6 67 19  9 82 98 11 15 50 49 62 14 18 22 33 27 77 96  3  2  4 24 57 37
    Card  79: 83 54  1  2 26 55 33 37 76 20 | 30 55  1 51 50  7 26 34 76 62 89 92 17 38 33 20 13 95  2 65 45 54 37  6 25
    Card  80: 72 60 47 97 98 37 24 71 92 38 | 76 60 68 93 24 82 22 45 19 97 53 61 98 88 49 77 70 92  8 40 15 38 52 75 74
    Card  81: 78 90 38 77 11 47  1 80 64 30 | 90  2 67 95 70 75 83 19 11 18 86 38 30 93 62  1 77  7 65 41 84 64 78 47  4
    Card  82: 65 17 18 85 47 25 89 84 28  1 | 92 40 96 66  5 25 61 48 73 71 13 35 70 18 19 84 43 12 87 57 37  1 30 65 51
    Card  83: 99 71 23 76 61 19 58 57 78 15 | 96 19 98 71 34 38 95 93 48 79 53 42 15 61 56 29 23 99 39 60 78 40 49 12 57
    Card  84: 65 13  8 63 12 61 45 34 38 75 | 13 89 79 18 83 24 56 34  8 23 15 19 71 12 26 45 86 72 76 25 17 42 46 35 88
    Card  85: 29 85 81 70 92 51 67 83 48 13 | 28 53  4 11 55 61 27  9 36 82 47 98 65 43 33 74 88 64  2  3 37 22 62  6 84
    Card  86: 92 75 84 17 33 18 46 81 77  2 | 36 53 13 25  6 28 54 42 70 34 61 31 86 68 67  4 48 73 41 62 60 57 38 65  1
    Card  87: 29 68 34 54 22 33  6 28  1 47 |  4 79 62 77 82 78 75 70 93 58 38 56 97 13 80  2 45 76 31 90 15 37 81 63 95
    Card  88: 49 30 56 59  7 20 38 28 90 68 | 61 39 32 22 51 81 41 60 14 77  7 19 89 47 43 38 23 65 36 35 80  4 78 62 26
    Card  89: 17 70 26 62 84 57 67 31 15 87 | 59 74 32 72  7 97 23  5 99 77 50 22 17 76 73 30 10 20 44 70 55 38 75 29 24
    Card  90: 33 56 47 17  6 51 71 42  1 83 | 82  6 52 50 45 49 66 16 60 97 85 62 90 64 58  7 41 43 83 25  3 48 69 80 32
    Card  91: 69 37 35 55 42 57 78 80 60 43 | 16 91 92 10 32 68 84 64 60 79  2  9 21 58 77 93 53 11 52 83 50  4 86 89 22
    Card  92: 94 76 95 35 25 21 36 75 99 55 | 58 54 41 85 27 42 69 30 89 53 68 52 33 56  3 39 26 73 97 47 10 38 17 64 62
    Card  93: 30 38 15 75 10 78 45 57 51 96 | 51 57 46 78  6 55 96 35 38 15 45 63 28 41 26 10 18 64 24 93 75 62 32 92 30
    Card  94:  2  3 80 42 55 29 95 49 67 96 |  3 66 49 92 13 51 42 67 28 37 95 99 71  5 17 29 30  2 98 32 12 96  8 55 80
    Card  95: 54  8  7 36 81 32 62 66 92  6 | 77 92  8 54 53 34 88 62 84 48  6 35 68 32 66 23 95 81  7 18 17 36  3 60 75
    Card  96: 10 94 86 82 85 62 89 45 15  8 |  5 94 30 69 82 12 10 42 92 39 52 46 85 89 84 55 78 62  8 24 45 77 15 58 59
    Card  97: 21 92 18  5 25 95 55 67 52 78 | 11 68 32 41 67 66 80 82 72 15 49 25 97 12 18 38 37 76 92 34 74 53 55 36 78
    Card  98: 87 23 17 15 72 86 91 70 19 21 | 64 17 13 45 87 10 86 59 73 19 27 94 91 70 23 50 39 46 51 48 21 72 54 15 90
    Card  99: 10 14 71 83 92 54 52 64 27 15 | 58 89 63 24 57 55  1 95 53 43 84 54 65 61 26 87 96 71  3  9 82 77 91 62 92
    Card 100: 14 88 31 96 27 22 75 21 33 94 | 66 87 76 81 51 57 36 64 96 90  5 39 37 97  8 65 77 35 85 49 84 94 14 86 52
    Card 101: 32 70 58 16 57  5 34 79 12 74 | 37 29 87 68 84 16 54 27 24 65 48 62 60 85 86 55 19 61 35  9 17 69 32 99 75
    Card 102: 49 94 51 52  5 98 86 59 67 29 | 34 48 59 87 92 28 81 44 58 47 97 11 75 99 69 85 66 60 80 76 64 56 72 23 90
    Card 103: 22 96 38 63 73 62 57 18 93 19 | 97 87  5 68 47 88 78 70 77 62 17 94 81 19 28 36 79 72 64 53 29  3 20 89 60
    Card 104: 14 18 46 49 60 90  9 22 17 44 | 26 94 56 99 21 55 47 86 27 51 28 96 64 70 87 45 62 81 63 30 35 20 50 48 76
    Card 105: 40  5 36 22 90 29 58 54 53 64 | 64 47 95 43 16 60 22  1  9 71 94 27 18 59 32 20 52 92 12 90 55 83 19 61 89
    Card 106: 59 48 97 50 67 99 89 39 90 95 |  3 40 56 68  6 16 41 38 62 54 97 10 14 44 30 86 37 84 48 65 52 36 53 63  5
    Card 107: 55 34 89 15 93  2 31 43 87 17 | 88 70 83 32 98 53 86 68 50 37 27 56 51 10 45 36 20 94 59 80 66 44 73 99  8
    Card 108: 53 26 99 90 39 25 66 80 82 37 | 34 46 28 60 89 96 15 84  7 88 95 31 22 94 61 78 93 62 81 87 44  5 20 72  2
    Card 109: 50 31 91  6 92 72 90 18 71 37 | 18 86 37 50 68 71 35 95 16 85 93 55 96 80 52  6 77  4 92 20 91 56 90 31 72
    Card 110: 66 18 11 94 16 58 54 63 47 82 | 81 42 24 47 16 54 59 38 67 66 35 49 96 10 64 63 11 94 58 78 65 82 44 74 18
    Card 111: 98 21 14 86 68 94 60 31 24 38 | 84 98 22 11 71  9 83 14 89 94 85 42 63 30 16 86  2 23  3 31 61 18 68 54  4
    Card 112: 71 62 11 73 54 74 12 82 69 31 | 78  1  5 72 92 74 18 11 71 10 93 83 81 21 31 62 61 82 54  8 68 73 69  9 12
    Card 113: 42 62 85 51 61 40 76  8 78 12 | 85 78  2 42 71 28 25 75 69 40 88 24 98 84 92 51 10 21 27 12 62  8 56 41 76
    Card 114: 55 11 43 33 97 83 30 37 52  6 | 94 71 81 20  4 43 97 30 33 56 69 99 13  8 32 37 96 58 55 26 29 31 83 80 67
    Card 115:  4 40  9 71 18 59 19 84 91 72 | 62 43 73 87 42 61  7 99 45 70 97 18  6 77  8 93 81 55 41 38 12 64  1 82 51
    Card 116: 60 21 16 17 29 83 46 20 64 18 | 83 21 18 41 43 73 53 29 35 17  4 46  1 57 81 20 70 97  5 16 64 30 84 38 60
    Card 117: 51 54 92 49 29 82 43 58 19 50 |  7 50 71  4 82 22 23 56 31 27 58 26 19 29 49 11 69 52 92 54 24 43 51 93 73
    Card 118: 91  4 57 51 13 18  8 34 24  3 | 18  4 65 97 17 47 99 41 57 91 94  8 34 40 48 68 37  3  2 13 53 60 44 24 90
    Card 119: 81 80 42 19 62 23 86  5 20 45 | 96 27 94 86 39 67 20 93 81 66 14 23 45 98 84 37 85 19 62 80  5 61 82 12 59
    Card 120: 17 47 14 32 51 92 87 37 68 93 | 97 54 31 39 69 99 41  2 26 75 86 13 25 55 81 44 77  4 72 74 80 95 40 76 63
    Card 121: 75 68 67 87  7 16 71 12  8 19 |  8 42 99 66 70 64  5 73 67 15 40 72 34 28 18 61 30 83 49 17 87 93 25 24 43
    Card 122: 72  8 67 23 21 77 66 28 19 82 | 47 59 90 55 75 36 52 17 70 28 91 15 11 66 80 82 34 25 44 83 53 67 63 23 87
    Card 123: 48 80 92  9 12 61 29 32 41 55 | 53 28 21 64 24 56 89  9 80 29 85 67 46 15 52 90 11 62 74 69 47 32 75 60 31
    Card 124: 83 79 14 51 85 13 91 98 66  2 | 53 48 34 70 46 44 18 54 50 67 73  8 61 81 40 29 17 65 86 30 76 59 47 16 74
    Card 125:  1 11 69 75 62 45 35 53 34 23 | 97 12 16 45 31 21 87 95 22  7 25 62 64  6 11 10 29 91  9 24 53 74 75 40 41
    Card 126: 85 31 48 37 11 26 44 69 61 82 | 46 34 11 87 68 86 39 73 90 23 98 32 71 28 22 29 20 49 77 63 70 76  6 52  3
    Card 127: 11 15 54 44 46 82 78 74 26 23 | 29 11 18 99 20 17 67 55 83 65 22 27 10  3 62 89 69  1 45 91 84 61 90 92 44
    Card 128: 80 55 19 83 49 18 72 37 68 21 | 64 53 67 47 65 41 34 15 89 10 32 51 91 61 58 69 23 56 87 57 79 84 78  5  4
    Card 129: 30 46 40 21 99  2 51 95 74 97 | 62 67 68 44 86 93 47  5 39 12 49 88  9 36 89  3 38 65 79 42 20 45 14 70 91
    Card 130: 54 65 73  3 21 93 68 43 10 20 | 51 66  6  4 76 27 48 87 86 81 47 92 82 28 91 18 62  8 96 59 88 37 25 46 49
    Card 131: 71 43 15 32 16 50 28 80  1 81 | 76 64 21 55 12  6 96 20 77 22 26 32 54  8 62 68 17 86 56 53 10 81 33 41 24
    Card 132: 55 64 61 49 79 90  8 34 85 97 | 50  6 40 30 91 48 41 57 22  8 62 70 84 38 98 76 83 94 82 68  2 42 32 47 14
    Card 133: 48 60 44 27 13 41 99 35 78 74 | 88 25  8 19 69 34 79 83 46 72 52  6 16 97 62 15 70  4 56 30  3  7 36 23 73
    Card 134: 40 72 54  4 18 20  3 39 46 91 |  3 18 91 69 66 29 60 33 39 96 84  9 20 24 41 16 53 46 49 72 95 81  4 40 54
    Card 135: 82 66 29 16 86 89 15 23 95 11 | 14 43 57 68 80 11 89 92 59 67 86 39  8 18 16 23 83 64 82 66 95 29 15 37  6
    Card 136: 30 36 52 77 67 75 76  1 11 79 | 36 85 67 16 76 52 69 47 14 22 20 26 11 30 18 13 75 87 79 93 39 89  1 99 77
    Card 137: 54 79 25 62 93 65  7 68 90 11 | 94 73 86 78 64 71 25 82 20 30 97 28  9 65 90 35 70 87 32 31 49 51 74 26 72
    Card 138:  6 76  2 87 89 20 95 23 42 21 | 95 32 59 60 46 84 79 81 80 17 86 18 36 98 52  3 83 68 88 38 67 72 51 22 26
    Card 139: 61 81 70 50  3 47 88 54 60 90 | 26 63 75 70 81 13 90  8 60 46 56 61 14 68 88 82 47 36 50 18 73 54 98  3 76
    Card 140: 58 71 64 80 27 99 29 94 30 40 | 58 53 31 76 65 23 29 54 45 22 94 30 99 70 27 80  5 81  3 71 37  7 14 64 40
    Card 141: 12 73 17 11 89  3 80 72 92 63 | 23 78  2 80 35 96 41 72 30 39 48 10 51 87 12 34 92 73  6 45 89 76 27 11 60
    Card 142: 82 22  6 68 97 86 15 56 84  7 | 52 40 91 39 92 32 84 26 78 24 37 38 74 90 86 50 64 77  3 95 94  2 87 75 34
    Card 143: 28 59 68 11 93 48 63 96 39 54 | 98 15 56 11 45 78 54 93 44 66 33 59 90 74 63 97 39 30 96  5 48 26 76 42 28
    Card 144: 92 18 45 37 69 99 26 43 81 91 | 26 91 64 55 18 57 11 95  9 37 45 38 92 31  3 34 69 87 24 97 98 99 81 14 10
    Card 145: 11 69 35 21 10 49 84 75 50 68 | 16 67 48 15 43 54 95 11 91 27 39  9 34 88 86 20  4 89 47 75 62 61 64 85  8
    Card 146: 27 44 15 92 93 56 76 72 34 81 | 86 43 66 95 33 76 27 60 32 25 37 29  1 53 72 61 85 36 93 62 97 58 96 56 47
    Card 147: 54 67 15 21 28 99 33 63 96 82 | 76 54 91 95  8 73 30 28 65 82 67 98 43 81 39 33 44 53 49 16 21 88 12 45 15
    Card 148: 80 74 55 33 70 92 63 21 79 23 | 86 84 40 53 20 49 97  5 66 95 93 96 46 18 24 28 51  9 52 67 89 14 30  8 11
    Card 149: 65 14 55 81  1 73 41 44 47 87 | 71 87 90 34 25 36 82 59 88 85  4 27 63 98 30 13 17 44 93 14 32 55 68 41 29
    Card 150: 51 34 46 92 85 57 59 62 42 40 | 22 93 39 44 83 37  4 48 33  7 41 95 70 26 30 56 78 65  6 67 81 14 58 87 27
    Card 151: 89 79 66 24 39 35  9 32 76 30 | 69 80 83 86 22  4 15 92 87 11 64 40 94 77 82 29 57 36 54 95 43 78 65 74 84
    Card 152: 63 26 47 96 13 14  8  7 32 51 | 40 65 90 80 33  9 99 67 42  1 29 83  2 93 23 45 53 94 79 39 18 35 72 91  3
    Card 153: 76 45 64 13 85 42  5 47  2 40 | 34 46 19 21 35 77 71 56 94 27 37  8 60 90 96 63 57 55 32 95 68 10 73  4 51
    Card 154: 96 31 79 16 50 15 92 67 91 47 | 27 44 86 41 18 63 28 21 38 12 68 48 39 66 58 99 52 53 80 64 24  7 93 95 55
    Card 155: 84 46 62 78 15 29 87 73 27 67 | 50 25 75 90 66 34 72 31 33 24  8 41 29 69 20 54 32 85 65 68 21 94 64  9 42
    Card 156: 57 55 36 90 19 73 42  5 17 21 | 60 26 47 37 51 86  9 65 69 92 88 44 53 42 54 15 63 17 91 72 83 89  8  4 81
    Card 157: 32 39  2 75 90  5 85 50 22 80 | 19 29  5 85 20 90 87 61 75 78 47 95 34 63 57  2 33 82 24 56 80 49 70 72 21
    Card 158: 36 76 91 66 19 88 59 24 11 87 | 48 72 97 45 75 29 70  9 31 96  3 16 36 24 90 67 76 82 42 18 80 81 40  5 46
    Card 159: 97 33 68 61 50 87 77 92 36 38 |  6 58 78 65 36 42 80 98 12 47  7 54 67 60  5  9  1 17 90 32 62 39 11 64 26
    Card 160: 83 97 81 82 90 68 54 57 24 96 | 26 90 51 86 47 93 43 32 14 46 54 50 79 37 28  3 21 24 96 33 83 31 82 29 72
    Card 161: 40 64 36 35 17 82 15 52 20 79 | 36 32 57 52 60 46 17 16 20 79 75 35 58 65 44 63 47 49 82 48 76 64 40 15  4
    Card 162: 82 68 31 74 28 39 94 34 61 80 | 74 25 38  3 66 32  1 19 28 39 31 94 67 78 99  7 68 80 18 42 61 72 82 49 34
    Card 163: 73 89 42 20 85 80 45 71 75 32 | 14 39 54 81 69 47 79 46 20  2 43 88 92 31 45 32 80 55 30 85 27 40 63 73 75
    Card 164: 75 44 66 52 15 32 53 99 19 48 | 27 26 44 55 48 96 32 29  2 53 52 15 51 83 79 22 41 66 50 28 91 99 61 75 19
    Card 165: 63 15 31 95  9 83 77 42 80 68 | 31 13 48 93 78 69 82 44 57 28 11 84 86 20 40 76 99 30 47  1 88  6 49 51 21
    Card 166: 93 15  3 43 88 77 24 36 70 74 | 58 36 21 77 15 37 28 22 46 41 88  7 23 47  9 63  3 93 91 70 74 43 26 24 76
    Card 167: 59 10 26 33 69  4 47 21 78 54 | 78 21 85 44 52  5 80 64 42 30 11 59 22 10 33 69 47 23 86 50 20  4 54 26 96
    Card 168: 93 33 56 73  7 32 66 75 35 18 | 54 83  8 29 81 19 51 77 36 26 86 56 76 90 85 46 18 96 79  3 13 57 40 53 59
    Card 169:  4 25 15 63 18 35 64 88 43 29 | 15  1  7 21 84 67 36 33 37 17 65 25 30 18 51 83 63 99 98 66 92 73 39 52 22
    Card 170: 70 44 78 92 43 99 58 36 45 52 | 21 53 74 78 83 95 20 27 69  8 18 15  7 51  2 13 46 57  9 50 17 33 48  6 10
    Card 171: 14 18 42 99 88 89 76  5 60 67 | 11 43 99 89 85 84 53 41 23 60 13 59 18  9 95 88  8  2 25 77 76 54 28 79 14
    Card 172: 14 36 61  7 96 68 48  3 25 26 | 90 21  7 78  3 44 33 34 62 61 31 10  8 37 12 94 11 20 60 91 41 28  9 80 48
    Card 173: 23 13 66 64 57 61 62 12 85 55 | 78 58 36 84 66 19 95 60 31 98 50 75 83 64 96 16 14 47 72 74 86 61  6 65 63
    Card 174: 87 17 65 38 93 64 23 35 44 30 | 18 74 73 34 58 46 54 97 85 42 67 53 92 21 90 70 12 32 82 61 57 37  3 94 29
    Card 175: 16 40 45 76 34 43 82 29 15 65 | 74 15 25  5 16 93 18 84 33 17 37 34 44 72 59 47 43 95 54 39 75 48 69  7 61
    Card 176: 97 38 94 13 74 37 95 17 73 40 | 93 44 64 39 15 46 30 16 35 50 85 71 49 99 36 34 98 47 43 83 76  2 78 52 29
    Card 177: 47 35 15 69  3 28 31 36 99 19 | 29 53 70 11 37 22 50 92 76 80 71 30 58 63 20 32 83 68 34 17 81 14 13 62 59
    Card 178: 20 89 11 12 41 26 49 82 27 56 | 73 40 86 43 75 59 46 81 78 67 44 68 93 98 22 51 92 66 14  5 13 31  7 83  3
    Card 179: 77 72 54 47 44 12 74 80 19 35 | 87 85 17 34 73 31 25 23 39 79 75 82 15 41 68 58 57  1 61 36 50 65  2 96 94
    Card 180: 20 15 32 52 24 80 25 23 41 92 | 52 61 67 28 29 80 16 25 97  2 86 53  9 33 57 56  1 23 41 20 32 12 24 92 15
    Card 181: 89 45 15 68  1 54 27 12 78 11 | 54 28 17 56 98 27  3 89 15 45 87 24 12 11 20 53  1  9 78 68 57 90 36 43 22
    Card 182: 89 91 25 36 50 81 32 75 52 15 | 85 90 76 96 93 36 67 99 75 32 91 29 50 18 66 89 11 40 39 52 35 81 15 25 16
    Card 183: 21 74 42 66 75 99 89 50 24  6 | 88 54 64 29 80 35 69 36 91 25 40 53  8 39 92 58 26 44 60 49 27 46 93 71 77
    Card 184: 40 12 28 35 29 77 91 83 27 38 | 99 58 90 49 85 26 33 64 15 30 40 97 61 41 52  5 22  2 56 17 74 62 84 51 89
    Card 185: 86 29 49 67 58 15  2 25 92 94 | 15 36 18 71 39 49 48 58 86 88 68 67 27 92 47 91 37 90  2 25 41 23 31 29 94
    Card 186: 28 63  5 29  4 25 53 61 81 34 | 52 98 45 33 79 27 51 37 29 38  2 81 25 95 85 77 13 78 63 82 97 71 62  8 50
    Card 187: 24 38 16 63 49 28 86 39 21  2 | 64 24 95 98 80 54 96 19 46 18 82 66 41 28 49 72 90 17 44 71 81 13 25 50 15
    Card 188: 40 88 91 96 21 65 46 38 10 89 | 80 40 89 68 54 96 71 79 70 11 97 93 91 69 65 75 32 38 46 61 67 12 78 88 36
    Card 189: 64 99 58 43 42 51  5 57 86  6 | 77 35 64 88 72 10 58 21 23  6 80 41 55 24 48 11 98 59 52 30 53 57 71 26 49
    Card 190: 44 59 64 10 49 33  4 35 45  5 |  8  5 49 67 26 12 78 48 60 44 51 20 47 99 93 30  9 10 69 72  6 33 37 35 77
    Card 191: 65 48 31  5 19 90 85 40 36 38 | 66 46 92 53  6 56 23 34 12 75 28 44 47 42 76 39 86 49 33 35 70 32 37 18  8
    Card 192: 12 40 48 60 14 23 21 78  6 42 | 90 61 57 85 66 83 43 82  7 67 55 93 17 60 15 20 70 81 89 80 62 18 53 44  3
    Card 193: 19 63 70 77 73 13 33 83 72 49 | 48 71 18 49 99 47 91 83 16 26 51 31  3 12  5 73 88  1 95 10 54 90  8 22 70
    Card 194: 48 51 17 59 61 25 13 70 33 12 |  4 68 37 80  3 61 42 85 57 51 87 65 12 35 21 15  5 19 17  2 58 70 59 73  6
    Card 195: 97  8 45 27  2 14 94 92 37 51 | 30 80 59 35 23 66 24 62 20 54 99 73 82 51 93 60 28 46 95 89 40 61 38 39 14
    Card 196: 67 90 56 86 73 96 40 91 75 25 | 32 71 34 25 85 72 65 51  7 59 83 94 52 49 58 21 53 42 93 63 46 45 24 64 47
    Card 197: 34 60 30 42  2 58 50  6  8 65 | 79 92 57 76 20 78 86 47 58 99 65 80 84 16  5 30 36 77 46 73 29 26 96 45 98
    Card 198: 27 14 25  8 32 93 59 94 89 98 | 46 82 57 37 45 41 33 18 73 55 38 21 13 40 96 87 23 83 49 10 74  2 61 99 56
    Card 199:  3 36 72 71 13 85 45 35 79 93 | 75  7 51 59 81 15 18 57 77  8  1 70 42 34 63 49 69 67 89 99 94  2 39 46 86
    Card 200: 72 10 70 76 33 82 25 19 46  6 | 23 83 41  5 84 78 32 74 47 16 89  7 54 48 14 40 50 31 24 79 97 96 49 53 55
    Card 201: 69 33 86  4 98 77  3 51 63 84 | 63 32 59  3 51 90 98 86 42 88 33 84 12  4 41 60 78 17 25 66 18 54 69 77 26
    Card 202: 32 71 80 75 17 47 90 33 59 60 | 19 90 51 82  2 30 29  5 86 56 11 75 33 39 59 12  3 71 60  6 80 47 32 46 22
    Card 203:  2  6 88 74 73 49 98  3 63 29 |  4 60 48 69  5 19 49 96 73 78 89 99 29 74 25 71 47 44 35 32 43 31 27 23 90
    Card 204: 82 96 98 15 30 50 63 95  6 14 | 25 11 15 81 27 95  1 68 40  4  6 30 59 64 66 97 31 98 74 54 77 71 60 76 72
    Card 205: 24 97 90 42 15 62 21 23 36 31 | 29 30 66 10 23 62 31 69 26 75 20 34 90 27 32 41 24 14 36 59 42 93 21 91 17
    Card 206: 92  8 83 85 47 74 42 35 87 16 | 92 89 13 42 35 23 60 36 45 21  8 80 87 85 83 16 14 49 47 76 91 72 15 54 74
    Card 207: 26  3 38 10 20 46 27 81 66 91 | 94 48 81 46 77 35 91 37  3 99 63 43 60 44 16 38 20 82 66 15 88 12 56 45 13
    Card 208: 65 15 67 49 89 94 72 98 17 55 | 90 63 93 55 18 72 41 58 73 19 89 96 59 82 15 20 52 57 81  3 74 25 98 67 94
    Card 209: 41 69 22 59 45 53 52 21 78 34 | 87 63 96 61 18 37  9 50 90 39  7 23 59 99 81 12 38 30 42 31 94 51 52 86 78
    Card 210:  8 66 74 64 11 68  5 57 18 36 | 89 83 19 75 41 33 20 67 99 43 87  7 81 55 69 97 31 12 50 27 35 58 80 39 44
    Card 211:  2 63 10 57 71 65 40 54  9 42 | 37 81 54 35 65 67 83 10 24 61 41 52 42 53 71 56 63 58 62 11  9 80 84 99 68
    Card 212: 23 39 30 14 28 79 46 55 52 50 | 15 73 78 25 61 46 27 93 51 88  5 99 87 20 32 66 26 58 77 42 94 47  7 76 91
    Card 213: 81  3 71 56 91 87 93 37 47 49 | 56 71 41 85 81 42 20 38 79 39 90  7 55 40 49 60 37 78 61  1 65 35 28 34 66
    Card 214: 22 23 90 10 52 37 71 72 60 32 | 87  9 94 19 34 89 57 53  1 48 44 33  4 32 49 51 98  2 41 66 27 54 23 17 64
    Card 215: 75 39 31  5 71 87 92 72  8 50 | 32 56 34 50 86 64  4 85 49 81 26 74 42 47 70 17 67 95  2  7 99 77 83 91 73
    Card 216: 61 77 58 37 12 20 25 68 18 22 | 76 70 65 17  9 98 61 33  7 30 66 95 44 27 72 46 32 14 40 81 49 87 56  4 11
    Card 217: 30 73 66 90 65 71 84  1 10 27 |  4 52 56 49 17 39 53  3 69 88  8 55 68 43 41 59 99 44 81 47 91  5 50 45 97
    Card 218: 27 40 32 35 55 13 98 94 16 12 | 63 96 50 19 36 65 71 48 49 51 78 46 75 88 24 16 70 84 53  1 30  3 34  9 29
    Card 219: 74 89 55  5 24 77 64 83 84 94 | 32 19 93 92 82 69 12 38  3 60 39 95 11 71 88 99 98 51 20 40  9 17 18 57 16
""".trimIndent()
