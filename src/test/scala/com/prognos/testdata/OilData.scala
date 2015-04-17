package com.prognos.testdata

import breeze.linalg.DenseVector
import com.prognos.Series

object OilData extends TestDataVector {
  val start = 1965
  val end = 2010

  val data:DenseVector[Double] = DenseVector(111.0091,130.8284,141.2871,154.2278,162.7409,192.1665,240.7997,304.2174,
    384.0046,429.6622,359.3169,437.2519,468.4008,424.4353,487.9794,509.8284,506.3473,340.1842,240.2589,219.0328,
    172.0747,252.5901,221.0711,276.5188,271.1480,342.6186,428.3558,442.3946,432.7851,437.2497,438.4428,446.6565,
    454.4733,455.6630,423.6322,456.2713,440.5881,425.3325,485.1494,506.0482,526.7920,514.2689,494.2110,515.3052,
    464.720,467.7724)

  def rangeData(from:Int, to:Int):DenseVector[Double] = {
    val indexedData:List[(Int,Double)] = (start to end).toList.zip(data.toArray)
    val filteredData:Array[Double] = indexedData.filter{case (index:Int,value:Double) => index >= from && index <= to}.map(_._2).toArray
    DenseVector(filteredData)
  }

}
