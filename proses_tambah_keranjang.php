<?php 
session_start();
    if($_POST){
        include "koneksi.php";
        
        $qry_get_paket=mysqli_query($conn,"select * from paket where id_paket = '".$_POST['id_paket']."'");
        $dt_paket=mysqli_fetch_array($qry_get_paket);
        $_SESSION['cart'][]=array(
            'id_paket'=>$dt_paket['id_paket'],
            'jenis_paket'=>$dt_paket['jenis_paket'],
            'harga' => $dt_paket['harga'],
            'qty'=>$_POST['jumlah_beli'],
            'satuan'=>$dt_paket['satuan']
        );
    }
    header('location: pesan.php');
?>
