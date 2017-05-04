package at.fhj.matrix;

/**
 * 
 * Implements standard operations on matrices consisting of integer numbers
 * 
 */

public class Matrix {

	// 2-dimensional int-array for storing Matrix elements
	// The first dimension gives the row, the second the column
	// I.e.: daten[0][1] specifies the element in the first row
	// and second column
	int[][] daten; 
	
	// actual number of rows and columns
	int numRows, numCols; 

	/**
	 * Create an empty Matrix with no rows and columns
	 */
	public Matrix() {
		this.numRows = this.numCols = 0;
		this.daten = null;
	}
	
	/**
	 * Create a new Matrix with a given number of rows and columns
	 * 
	 * @param numRows
	 *            number of rows
	 * @param numCols
	 *            number of columns
	 */
	public Matrix(int numRows, int numCols) {

		// Begin Implementation
		this.numCols = numCols;
		this.numRows = numRows;

		daten = new int[numRows][numCols];
		// End Implementation
	}

	/**
	 * Create a new Matrix with a given number of rows and columns
	 * and initialize all fields with a given value
	 * 
	 * @param numRows
	 *            number of rows
	 * @param numCols
	 *            number of columns
	 * @param val
	 *            initialization value
	 */
	public Matrix(int numRows, int numCols, int val) {
		// Begin Implementation
        this(numRows,numCols);
        setAll(val);
		// End Implementation
	}

	/**
	 * Create a new Matrix from a 2-dimensional array by copying 
	 * every single "int" element from the array into a newly 
	 * allocated "daten" attribute (i.e. "daten" is a real copy of 
	 * parameter "a" and MUST NOT refer to "a") 
	 * 
	 * @param a
	 *            2-dimensional array holding the matrix values
	 */
	public Matrix(int[][] a) {
		// Begin Implementation
        this(a.length, a[0].length);
        for(int row = 0; row < numRows(); row++){
            for(int col = 0; col <numCols();col++){
                daten[row][col] = a[row][col];
            }
        }
		// End Implementation
	}

	/**
	 * Get the number of rows of the matrix
	 * 
	 * @return number of rows
	 */
	public int numRows() {
		return this.numRows;
	}

	/**
	 * Get the number of columns of the matrix
	 * 
	 * @return number of columns
	 */
	public int numCols() {
		return this.numCols;
	}

	/**
	 * Add Matrix m to this Matrix and return the result as new Matrix
	 * 
	 * @param m
	 *            Matrix to be added to this Matrix
	 * @return new Matrix representing the result
	 */
	public Matrix add(Matrix m) {
		// Begin Implementation
		return null; // change it !
		// End Implementation
	}

	/**
	 * Multiply Matrix m with this Matrix and return the result as new Matrix
	 * 
	 * @param m
	 *            Matrix to be multiplied with this Matrix
	 * @return new Matrix representing the result
	 */
	public Matrix mult(Matrix m) {
		// Begin Implementation
		return null; // change it!
		// End Implementation
	}

	/**
	 * Multiply a scalar integer value with this Matrix and return the result as
	 * new Matrix
	 * 
	 * @param k
	 *            scalar integer value
	 * @return new Matrix representing the result
	 */
	public Matrix mult(int k) {
		// Begin Implementation
		return null; // change it!
		// End Implementation
	}

	/**
	 * Compare if Matrix m equals this Matrix by comparing all elements
	 * 
	 * @param m
	 *            Matrix to compare to this Matrix
	 * @return result of the compare operation
	 */
	public boolean equals(Matrix m) {
		// Begin Implementation
		return true; //change it!
		// End Implementation
	}

	/**
	 * Get the element value on the given row and column position
	 * 
	 * @param row
	 * @param col
	 * @return element value
	 */
	public int get(int row, int col) {

		return daten[row][col];
	}

	/**
	 * Set the element value on the given row and column position
	 * 
	 * @param val
	 * @param row
	 * @param col
	 */
	public void set(int val, int row, int col) {

		daten[row][col] = val;
	}

	/**
	 * Set all elements of the Matrix to the given value
	 * 
	 * @param val
	 */
	public void setAll(int val) {

		for (int row = 0; row < numRows; row++)
			for (int col = 0; col < numCols; col++)
				daten[row][col] = val;
	}

}
