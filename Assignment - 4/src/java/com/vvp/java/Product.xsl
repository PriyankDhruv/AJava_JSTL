<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : Product.xsl
    Created on : 24 April, 2019, 12:35 PM
    Author     : PRIYANK DHRUV
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/">
        <html>
            <head>
                <title>Product.xsl</title>
            </head>
            <body>
                <h2>My Products</h2>
			<table border = "1">
				<tr bgcolor = "green">
					<th align = "center">Product_Name</th>
					<th align = "center">Price</th>
				</tr>
				<xsl:foreach select = "products/product">
					
						<tr>
							<td>
								<xsl:value-of select = "productname"/>
							</td>
							<td>
								<xsl:value-of select = "price"/>
							</td>
						</tr>
					
				</xsl:foreach>
			</table>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
