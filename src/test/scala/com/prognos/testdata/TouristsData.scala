package com.prognos.testdata

import breeze.linalg.DenseVector

object TouristsData extends SeasonalTestDataVector {
  override def data: DenseVector[Double] = DenseVector(
    30.05251,19.14850,25.31769,27.59144,32.07646,23.48796,28.47594,35.12375,36.83848,25.00702,30.72223,28.69376,36.64099,
    23.82461,29.31168,31.77031,35.17788,19.77524,29.60175,34.53884,41.27360,26.65586,28.27986,35.19115,41.72746,24.04185,
    32.32810,37.32871,46.21315,29.34633,36.48291,42.97772,48.90152,31.18022,37.71788,40.42021,51.20686,31.88723,40.97826,
    43.77249,55.55857,33.85092,42.07638,45.64229,59.76678,35.19188,44.31974,47.91374
  )

  override def start: Int = 1999

  override def end: Int = 2010

  override def period: Int = 4
}